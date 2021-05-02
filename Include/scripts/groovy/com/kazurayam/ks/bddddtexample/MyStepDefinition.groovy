package com.kazurayam.ks.bddddtexample

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.testdata.TestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class MyStepDefinition {

	private TestData data

	MyStepDefinition() {
		data = findTestData("Credentials")
	}

	/**
	 * look up the password of the given username out of the "Data Files/Credentials" 
	 */
	String lookupPasswordOf(String username) {
		for (def index : (1..data.getRowNumbers())) {
			String uname = data.getValue("username", index)
			String pswrd = data.getValue("password", index)
			if (uname == username) {
				return pswrd
			}
		}
		return null
	}

	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I navigate to Cura System homepage")
	def I_navigate_to_Cura_System_homepage() {
		WebUI.openBrowser("http://demoaut.katalon.com")
		//WebUI.waitForPageLoad(30)
	}

	@When("I click Make Appointment button")
	def I_click_makeAppointment_button() {
		WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
	}

	@And("I enter a valid credential of (.*)")
	def I_enter_valid_credential(String username) {
		String password = lookupPasswordOf(username)
		if (password != null) {
			WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_userName'), username)
			WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), password)
		} else {
			throw new IllegalStateException("usernamae ${username} is not found")
		}
	}

	@And("I click Log in button")
	def I_click_login_btn() {
		WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
	}

	@Then("I should be able to login successfully")
	def I_login_successfully() {
		WebUI.verifyTextPresent('Make Appointment', false)
		WebUI.closeBrowser()
	}

	@And("I enter an invalid credential of (.*)")
	def I_enter_invalid_credential(String username) {
		String password = lookupPasswordOf(username)
		if (password != null) {
			WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), username)
			WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), password)
		} else {
			throw new IllegalStateException("username ${username} is not found")
		}
	}


	@Then("I should NOT be able to login successfully")
	def I_login_unsuccessfully() {
		WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
		WebUI.closeBrowser()
	}
}