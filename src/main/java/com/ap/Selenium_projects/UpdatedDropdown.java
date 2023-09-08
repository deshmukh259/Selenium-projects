package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Checkbox selection

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),
				"is False");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),
				"is True");

		// count the number ofcheckboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// update count in dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		/*
		 * while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();//increases to 2
		 * adults i++;
		 * 
		 * }
		 */
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// increases to 2 adults
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("5");

		// RADIO
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// ENABLED or DISABLED UI COMPONENT
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
			System.out.println("is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		// driver.quit();
	}

}
