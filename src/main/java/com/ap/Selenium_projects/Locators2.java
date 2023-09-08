package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Direct Login & verify success then Logout
		String name="Abhilasha";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("form.form input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//span/input[@name='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login-container h2")).getText(),"Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div.login-container p")).getText(), "You are successfully logged in.");
		driver.findElement(By.cssSelector(".logout-btn")).click();
		driver.close();
		driver.quit();	

	}
	
	

}
