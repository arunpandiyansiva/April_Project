package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static <Webelement> void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sugan\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant:://div[@class='wM6W7d']"));
		System.out.println("Total number of suggestion in the list box:" + list.size());
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant :: //div[@class='//div[@class='wM6W7d']']"));
//		System.out.println("Total number of suggestion in the list box:" + list.size());
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}
		
		
	}

}
