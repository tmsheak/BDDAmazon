package com.tarekacademy.LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.tarekacademy.base.BasePage;

//The various elements on the page are defined as variables in this class
public class LoginPage extends BasePage {
	// once you extended BasePage, constructor need to created explicitly

	public LoginPage(WebDriver driver) {
		super(driver); // means using Parent's driver

	}

	// By Class: Initializes a new instance of the By class using the given
	// functions to find element
	By userName = By.id("ap_email");

	public void setUsername(String input) {
		// This need to call from LoginTest
		getSendKey(userName, input);

	}

	By password = By.id("ap_password");

	public void setPassword(String input) {

		getSendKey(password, input);
	}

	By clickOnSignIn = By.id("nav-link-accountList-nav-line-1");

	public void setSignInClick() {
		getSignInClick(clickOnSignIn);
	}

	By clickContinue = By.xpath("//input[@id='continue']");

	public void setContiueButton() {
		getClickOnContinue(clickContinue);

	}

	By clickSubmit = By.xpath("//input[@id='signInSubmit']");

	public void setSubmitButton() {
		getClickSignInSubmit(clickSubmit);

	}

	/*
	 * By accountList = By.id("nav-link-accountList");
	 * 
	 * public void setMouseOverOnLIst() { getMouseHoverOnList(accountList); }
	 * 
	 * By logoutBTN = By.xpath("(//span[@class='nav-text'])[21]");
	 * 
	 * public void setLogout() { getLogoutButton(logoutBTN); }
	 */
}