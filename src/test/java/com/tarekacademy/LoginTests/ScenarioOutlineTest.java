package com.tarekacademy.LoginTests;

import com.tarekacademy.LoginPages.LoginPage;
import com.tarekacademy.base.BaseTest;

import io.cucumber.java.en.When;

public class ScenarioOutlineTest extends BaseTest {
	LoginPage lp;

	@When("User enter valid username {string}")
	// @When("^User enter (.+) as valid username$")
	public void user_enter_valid_username(String userName) {
		lp = new LoginPage(driver);
		lp.setUsername(userName);
	}

	// @When("^User enter (.+) as valid password$")
	@When("User enter valid password {string}")
	public void user_enter_valid_password(String password) {
		lp.setPassword(password);
	}

}
