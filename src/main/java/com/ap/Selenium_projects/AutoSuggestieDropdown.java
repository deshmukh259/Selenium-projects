package com.ap.Selenium_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestieDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   driver.findElement(By.id("autosuggest")).sendKeys("in");
		   Thread.sleep(2000);
		   
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// after in keys were passed, all valid options scanned
		
		for(WebElement countryOption  :options) {
		if(countryOption.getText().equalsIgnoreCase("india")){
			countryOption.click();
			break;
				
			}
		}
		   
		   
	}

}
