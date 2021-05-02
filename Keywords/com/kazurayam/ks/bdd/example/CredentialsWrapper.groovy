package com.kazurayam.ks.bdd.example

import com.kms.katalon.core.testdata.TestData


public class CredentialsWrapper {

	TestData testData

	CredentialsWrapper(TestData testData) {
		Objects.requireNonNull(testData, "argument testData must not be null")
		this.testData = testData
	}

	/**
	 * look up the password of a given username out of the "Data Files/HealthcareCredentials"
	 */
	String lookupPasswordOf(String username) {
		for (def index : (testData.getRowNumbers()..1)) {
			String uname = testData.getValue("username", index)
			String pswrd = testData.getValue("password", index)
			if (uname == username) {
				return pswrd
			}
		}
		return null
	}
}
