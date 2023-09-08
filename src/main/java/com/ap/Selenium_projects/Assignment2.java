package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String name="Abhilasha";
		String password="Abcde123";
		
		driver.findElement(By.cssSelector("input[name='name']:nth-child(2)")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhilashapattnaik4@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement genderDropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender=new Select(genderDropdown);
		gender.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("23041995");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
		Assert.assertTrue(true, driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
		Thread.sleep(2000);
		driver.quit();

	}

}
