package com.tarekacademy.stepRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= { "pretty",
				"html:target/CucumberReport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		snippets=SnippetType.CAMELCASE,
		//features="features",
		features="@target/failed_scenario.txt",
		glue="com.tarekacademy.LoginTests",
		stepNotifications=true,
		monochrome=true	)
//Tool Bar: Run--> Run Configuration --> Run  Before Runner ready		
public class FailedCucumberRunner{

}






