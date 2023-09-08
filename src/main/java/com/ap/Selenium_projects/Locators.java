package com.ap.Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		
		WebDriver driver = new ChromeDriver();//object of class chrome driver implements interface WebDriver
		String name="Abhilasha";
		
		//implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   Locators loc = new Locators();
		String pass= loc.getPassword(driver);
		
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");	
	   driver.findElement(By.id("inputUsername")).sendKeys(name);
	   driver.findElement(By.name("inputPassword")).sendKeys("abcde");
	   driver.findElement(By.className("signInBtn")).click();
	  System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
	  //Forgot password page
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   Thread.sleep(1000);
	   //reset
	   driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
	   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abhilashapattnaik5@gmail.com");
	   driver.findElement(By.xpath("((//input[@type='text'])[2])")).clear();
	   driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abhilashapattnaik4@gmail.com");
	   
	   //parent to child
	   driver.findElement(By.xpath("//form/input[3]")).sendKeys("9438201345");
	   driver.findElement(By.cssSelector("Button.reset-pwd-btn")).click();
	   System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	   driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer'] //button[@class='go-to-login-btn']")).click();
	   
	   //Relogin
	  Thread.sleep(1000);
	   driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
	   driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);
	   driver.findElement(By.id("chkboxTwo")).click();
	   driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	   
	   Thread.sleep(1000);
	   System.out.println(driver.findElement(By.tagName("p")).getText());
	   Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	   Assert.assertEquals(driver.findElement(By.cssSelector("div.login-container h2")).getText(), "Hello "+name+",");
	  
	   
	  driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	   
	   //driver.quit();
	}
	
	public String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("Button.reset-pwd-btn")).click();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] splittedPass1= passwordText.split("'");
		String password= splittedPass1[1].split("'")[0];
		return password;
		
	}

}
 