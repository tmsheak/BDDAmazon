package com.tarekacademy.LoginTests;

import java.io.File;
import java.io.IOException;
import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.tarekacademy.LoginPages.LoginPage;
import com.tarekacademy.base.BaseTest;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

//This class is responsible for taking Screenshot for failed step/scenario
public class Hooks extends BaseTest{
	//Is-A relationship with BaseTest ( using Extends keyword)
	
	LoginPage lp;
	//Has-A relationship with LoginPage
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		lp = new LoginPage(driver);	
		if(scenario.isFailed()) {
			
			//Screenshot
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}