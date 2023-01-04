package com.tarekacademy.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*ALl the Regular Methods: username, input button, sendkeys, click, 
 drop-down, isVisible, wait, driver switch, iframe, find element */

public class BasePage {
	protected WebDriver driver; 
	    /* To use this driver, need to create Is-A Relationship
	     * created constructor using driver(highlighted) source --> Created constructor  using field
	     */

	public BasePage(WebDriver driver) {
		super();
		this.driver = driver; // my driver  ( This is the  Parent)
	}

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	//For SendKeys, You need: Locator and input
	public WebElement getSendKey(By locator, String input) {
		WebElement element = getWebElement(locator);
		element.sendKeys(input);
		return element;
	}

	public WebElement getClear(By locator) {
		WebElement element = getWebElement(locator);
		element.clear();
		return element;
	}

		public WebElement getSignInClick(By locator) {
		WebElement element = getWebElement(locator);
		element.click();
		return element;

	}

	public WebElement getClickOnContinue(By locator) {
		WebElement element = getWebElement(locator);
		element.click();
		return element;
	}

	public WebElement getClickSignInSubmit(By locator) {
		WebElement element = getWebElement(locator);
		element.click();
		return element;
	}

	public String getText(By locator) {
		String text = null;
		text = driver.findElement(locator).getText();
		return text;
	}
	public WebElement getLogoutButton(By locator) {
		WebElement element = getWebElement(locator);
		element.click();
		return element;
	}
	public WebElement getMouseHoverOnList(By locator) {
		WebElement element = getWebElement(locator);
		Actions action = new Actions(driver);		
	    action.moveToElement(element).perform();
		
		//element.click();
		return element;
	}
}