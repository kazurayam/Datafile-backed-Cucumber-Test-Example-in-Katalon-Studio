/*
 * Test Caes/plinKS/LoginValidCredentil
 */
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kazurayam.ks.bdd.example.Credentials
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// prepare test fixtue accessible
String DATA_FILE_NAME = "HealthcareCredentials"
TestData td = findTestData(DATA_FILE_NAME)
Credentials credentials = new Credentials(td)

// I navigate to Cura System homepage
WebUI.openBrowser('')
WebUI.navigateToUrl('http://demoaut.katalon.com')

// I click Make Appointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

// I enter a valid credential of (.*)
String username = "John Doe"
String password = credentials.lookupPasswordOf(username)
if (password != null) {
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_userName'), username)
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), password)
} else {
	throw new IllegalStateException("usernamae ${username} is not found")
}

WebUI.closeBrowser()