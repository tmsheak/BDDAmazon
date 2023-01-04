package com.tarekacademy.LoginTests;

import com.tarekacademy.LoginPages.LoginPage;
import com.tarekacademy.base.BaseTest;

import io.cucumber.java.en.When;

public class ParameterizationTest extends BaseTest {
	LoginPage lp;

	@When("User input {string} as username")
	public void user_input_as_username(String userName) {
		lp = new LoginPage(driver);
		lp.setUsername(userName);

	}

	@When("User input {string} as password")
	public void user_input_as_password(String password) {
		lp.setPassword(password);
	}

}
