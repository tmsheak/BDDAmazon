package com.tarekacademy.stepRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= { "pretty",
				"html:target/CucumberReport.html",
				"json:target/cucumber-report.json",
				"junit:target/cucumber-report.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenario.txt"},
		
		snippets=SnippetType.CAMELCASE,
		//features="features",
		features="src/test/resources/Features",
		tags=" @login1",
		//glue={"stepDefinations"}
		glue="com.tarekacademy.LoginTests",
		stepNotifications=true,
		dryRun=false,
		monochrome=true	)

//Tool Bar: Run--> Run Configuration --> Run  Before Runner ready		
public class CucumberRunner{

}

/* monochrome=true: output for the Cucumber test are much more readable.*/

/*dryRun=false: Cucumber will verify individual steps in the Feature file and the implementation code of steps in Feature file */

/*within the Step Definition file */

/*stepNotifications=true: Provide details steps at runs result */

/* @RunWith annotation tells JUnit that tests should run using Cucumber class present in 'Cucumber. api. junit' package */

/* @CucumberOptions are like property files or settings for your test */

/* Pretty: Prints the Gherkin source with additional colors and stack traces for errors.*/

/* Cucumber uses reporter plugins to produce reports that contain information about what scenarios have passed or failed. */

/* The glue is a part of Cucumber options that describes the location and path of the step definition file */

/* Features option helps Cucumber to locate feature files */

/* Snippets. When Cucumber encounters a Gherkin step without a matching step definition, it will print a step definition 
      snippet with a matching Cucumber Expression   */
 





