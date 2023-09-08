package com.ap.Selenium_projects;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int j = 0;
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		String[] itemsNeeded = { "Potato", "Tomato", "Beetroot", "Brocolli" };// add array of all required web elements
																				// tex
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		

		Base b = new Base();
		b.addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] div[class='action-block'] button[type='button']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='promoWrapper'] input.promocode")));
		
		driver.findElement(By.cssSelector("div[class='promoWrapper'] input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("div[class='promoWrapper'] button.promoBtn")).click();
		
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='promoWrapper'] span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("div[class='promoWrapper'] span.promoInfo")).getText());
		

		driver.quit();
	}

	public void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;

		// Add items in cart
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));// fetch list of we elements
																							// found by locator

		for (int i = 0; i < products.size(); i++) {

			// format to get only vegetable name from full text

			String[] name = products.get(i).getText().split("-");// store all elementtext in variable
			String formattedName = name[0].trim();

			// check whether extracted names from webelements are present in array or not
			// convert array to arraylist for easy search- in runtime to save memory
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();// use the locator
																										// to
				// click if

				if (j == itemsNeeded.length) {// no of variables declared in first string array
					break;
				}
			}
		}
	}
}
