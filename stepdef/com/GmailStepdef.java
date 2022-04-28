package com.stepdef.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Arun.Base_Class;
import com.pom.com.Gmail_Login;
import com.runner.com.GmailRunner;
import com.runner.com.Runner;

import cucumber.api.java.en.*;

public class GmailStepdef extends Base_Class {
	
	public static WebDriver driver= GmailRunner.driver;
	
	Gmail_Login ip =new Gmail_Login(driver);
	

	
	
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
	    
	    getUrl("http://gmail.com/");
	}

	@When("^User enter the username in the username field$")
	public void user_enter_the_username_in_the_username_field() throws Throwable {
	   
	    
	}

	@When("^User enter the password in the password in the password field$")
	public void user_enter_the_password_in_the_password_in_the_password_field() throws Throwable {
	    
	   
	}

	@Then("^User clicks the Signin button$")
	public void user_clicks_the_Signin_button() throws Throwable {
	    
	   
	}

}
