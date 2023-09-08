package com.ap.Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightBookingE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		   //departure select
		   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		   driver.findElement(By.xpath("//a[contains(@text,'DEL')]")).click();
		   Thread.sleep(2000);
		   
		   //arrival select
		   driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Chennai (MAA)']")).click();//Parent Child relationship xpath
		   
		   //calender todays date
		   driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//current UI date -unique classname
		   
		   //check disabled
		   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5"))
		   {
		 	  System.out.println("is disabled");
		 	  Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
		   
		   //update no of pax
		   driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(1000);
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		   
		   for(int i=1;i<3;i++)
		   {
			   driver.findElement(By.id("hrefIncAdt")).click();//increases to 2 adults  
		   }
		   
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");
		   
		   //select currency
		   WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		    Select dropdown	= new Select(staticDropdown);
		    dropdown.selectByIndex(3);
		    
		   //SEARCH
		    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		   
		   
		   Thread.sleep(5000);
		    driver.quit();
		   
		  

	}

}
