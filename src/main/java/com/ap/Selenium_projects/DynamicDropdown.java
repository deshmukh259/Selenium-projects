package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// TODO Auto-generated method stub
		// DYNAMIC DROPDOWN

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(@text,'DEL')]")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[text()=' Chennai (MAA)'])[2]")).click();
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Chennai (MAA)']"))
				.click();// Parent Child relationship xpath

		// CALENDER

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();// current UI date -unique
																							// classname

	}

}
