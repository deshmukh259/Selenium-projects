package com.ap.Selenium_projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/purushottamdeshmukh/clone2/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String username= driver.findElement(By.cssSelector("p.text-center.text-white b:nth-child(1)")).getText();
		String password= driver.findElement(By.cssSelector("p.text-center.text-white b:nth-child(2)")).getText();
		
		LoginPagePractice a= new LoginPagePractice();
		
		a.loginPage(driver, username, password, w);
		
		a.addTocart(driver, w);
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		Thread.sleep(3000);
		driver.quit();
		

	}
	public void addTocart(WebDriver driver , WebDriverWait w) {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn")));
		List <WebElement> signInBtn = driver.findElements(By.cssSelector("button.btn"));
		
		for(int i=0;i<signInBtn.size();i++) {
			
			driver.findElements(By.cssSelector("button.btn")).get(i).click();
		}
		
	}
	
	
	public void loginPage(WebDriver driver ,String username ,String password,WebDriverWait w ) {
		
		//inputs to login
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		//radiobutton
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		//select dropdown
		WebElement selection= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select occupation= new Select(selection);
		occupation.selectByVisibleText("Consultant");
		
		//chkbox
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
	}

}
