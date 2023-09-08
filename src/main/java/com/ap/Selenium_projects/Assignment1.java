package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   
		   driver.findElement(By.id("checkBoxOption1")).click();
		   Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		   
		   Thread.sleep(1000);
		   driver.findElement(By.id("checkBoxOption1")).click();
		   Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		   
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
		  
		  driver.quit();

	}

}
