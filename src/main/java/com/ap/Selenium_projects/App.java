package com.ap.Selenium_projects;

/**
 * Hello world!
 *
 */


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class App  
{
	

		public static void main(String []s) {

		/*sSystem.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://aws.amazon.com");

		String verifyBrowserStackTitle = driver.getTitle();

		System.out.println("Most Reliable App & Cross Browser Testing Platform | BrowserStack".equals(verifyBrowserStackTitle));*/
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();//object of class chrome driver implements interface WebDriver
		driver.get("https://rahulshettyacademy.com");//launchurl
		System.out.println(driver.getTitle());//fetch title of url
		System.out.println(driver.getCurrentUrl());//launched url
		driver.close();
		
		
		
		}

		
}
