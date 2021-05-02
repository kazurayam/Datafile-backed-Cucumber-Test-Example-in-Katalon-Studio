package com.kazurayam.ks.bdd.example_junit

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import com.kazurayam.ks.bdd.example.Credentials

@RunWith(JUnit4.class)
public class CredentialsTest {

	private Credentials creds

	@Before
	void setup() {
		creds = new Credentials(findTestData("HealthcareCredentials"))
	}

	@Test
	void test_getUsernameList() {
		List<String> usernames = creds.getUsernameList()
		assertThat(usernames, is(["John Doe", "FakeName"]))
	}

	@Test
	void test_getColumnNameList() {
		List<String> columnNames =  creds.getColumnNameList()
		assertThat(columnNames, is(["username", "password", "email", "phone"]))
	}

	@Test
	void test_lookupPasswordOfJohnDoe() {
		String password = creds.lookupPasswordOf("John Doe")
		assertThat(password, is("ThisIsNotAPassword"))
	}

	@Test
	void test_lookupPasswordOfFakeName() {
		String password = creds.lookupPasswordOf("FakeName")
		assertThat(password, is("FakePassword"))
	}

	@Test
	void test_lookupEmailOfJohnDoe() {
		String email = creds.lookupEmailOf("John Doe")
		assertThat(email, is("john.doe@foomail.com"))
	}

	@Test
	void test_lookupEmailOfFakeName() {
		String email = creds.lookupEmailOf("FakeName")
		assertThat(email, is("fake.name@barmail.net"))
	}

	@Test
	void test_lookupPhoneOfJohnDoe() {
		String phone = creds.lookupPhoneOf("John Doe")
		assertThat(phone, is("09011112222"))
	}
	
	@Test
	void test_lookupPhoneOfFakeName() {
		String phone = creds.lookupPhoneOf("FakeName")
		assertThat(phone, is("08033334444"))
	}
}
