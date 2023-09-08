package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
       WebDriver driver = new ChromeDriver();
       //Sibling raverse Child to parent
       
       driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
       System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());//parent to child & sibling
       System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());//parent to child to parent to another child
       System.out.println(driver.findElement(By.xpath("//div/button[1]/parent::div/parent::header/a/img[@class='logoClass']")).getSize());//parent to child to parent
       //to grandparent to parent 2 to child of parent 2
       
       driver.quit();
       
       
       
	
	}

}
