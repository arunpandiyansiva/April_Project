package com.runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\com\\feature\\com\\Gmail.feature" , 
                 glue="\\src\\test\\java\\com\\stepdef\\com\\GmailStepdef.java")

public class GmailRunner {
	public static WebDriver driver;
	@BeforeClass 
	public static void setup() {
		driver = Base_Class.browserLaunch("chrome");
	}

}
