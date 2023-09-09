package com.ap.Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		WebElement moveOver=driver.findElement(By.id("nav-link-accountList"));
		
		//mouse over to element
		action.moveToElement(moveOver).build().perform();
		
		//send text in caps
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	
	}

}
