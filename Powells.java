package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Powells {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sugan\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.powells.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		driver.findElement(By.id("txtUserNameSignIn")).sendKeys("a1r4u3n@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9894942065");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}

}
