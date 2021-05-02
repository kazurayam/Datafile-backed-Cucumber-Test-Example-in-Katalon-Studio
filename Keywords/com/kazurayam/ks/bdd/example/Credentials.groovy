package com.kazurayam.ks.bdd.example

import com.kms.katalon.core.testdata.TestData


public class Credentials {

	private TestData testData

	Credentials(TestData testData) {
		this.testData = testData
	}

	List<String> getUsernameList() {
		List<String> list = new ArrayList<String>()
		for (def index: 1..testData.getRowNumbers()) {
			list.add(testData.getValue("username", index))
		}
		return list
	}

	List<String> getColumnNameList() {
		List<String> list = testData.getColumnNames() as List
		return list
	}

	/**
	 * look up the password of a given username out of the "Data Files/HealthcareCredentials"
	 */
	String lookupPasswordOf(String username) {
		return lookupItemOf(username, "password")
	}

	String lookupEmailOf(String username) {
		return lookupItemOf(username, "email")
	}

	String lookupPhoneOf(String username) {
		return lookupItemOf(username, "phone")
	}

	String lookupItemOf(String username, String itemName) {
		for (def index : (testData.getRowNumbers()..1)) {
			String uname = testData.getValue("username", index)
			if (uname == username) {
				return testData.getValue(itemName, index)
			}
		}
		return null
	}
	
}
