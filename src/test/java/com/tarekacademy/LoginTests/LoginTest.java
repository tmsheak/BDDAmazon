package com.tarekacademy.LoginTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.tarekacademy.LoginPages.LoginPage;
import com.tarekacademy.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//BaseTest has ChromeDriver opening App
public class LoginTest extends BaseTest {
	// Is-A relationship with BaseTest ( using Extends keyword)

	LoginPage lp;
	// Has-A relationship with LoginPage

	@Given("User is on Amazon Homepage")
	public void user_is_on_amazon_homepage() {
		chrome();

	}

	@Given("User click on signinbutton")
	public void user_click_on_signinbutton() {
		lp = new LoginPage(driver);
		lp.setSignInClick();
	}

	@When("User input valid username")
	public void user_input_valid_username() {
		lp.setUsername("tarsm@gmail.com"); // need valid username for continue

	}

	@When("User click on Continuebutton")
	public void user_click_on_continuebutton() {
		lp.setContiueButton();
	}

	@When("User input valid password")
	public void user_input_valid_password() {
		lp.setPassword("Meah@2023"); // need password

	}

	@When("User click on loginbutton")
	public void user_click_on_loginbutton() {
		lp.setSubmitButton();

	}

	@Then("User validate the landing page")
	public void user_validate_the_landing_page() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.amazon.com/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref_=nav_AccountFlyout_signout";
	
		Assert.assertEquals(actualUrl, expectedUrl, "Url did not match");

	}

	@Then("User validate the page tittle")
	public void user_validate_the_page_tittle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = " ";
		Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");

		// closeApplication();

	}

	@Then("User click on LogoutButton")
	public void user_click_on_logoutButton() throws InterruptedException {		

			Actions a = new Actions(driver);
			
			WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

			WebElement logoutBTN = driver.findElement(By.xpath("(//span[@class='nav-text'])[21]"));

			//mouse hover on account list, mouse hover on logout then click
			//Logout from Account
			a.moveToElement(accountList).moveToElement(logoutBTN).click().perform();
			

		}
	
}

	// closeApplication();

	/*
	 * Assertion: String expectedURL= " given here"; STring
	 * actualURL=driver.getCurrentUrl(); System.out.println(actualURL);
	 * Assert.assertEquals("Does not match", expectedURL, actualURL);
	 * 
	 */


