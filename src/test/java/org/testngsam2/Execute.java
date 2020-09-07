package org.testngsam2;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execute extends Base {
	@BeforeClass
	public void launchbroswer() {
		WebDriverManager.chromedriver();
		driver= new ChromeDriver();
		}
	@AfterClass
	public void quitBroswer() {
		driver.quit();
	}
	@BeforeMethod
	public void StartTime() {
		Date d = new Date();
		System.out.println(d);
		}
	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@Test
	public void testCase1 () throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys("apple laptop",Keys.ENTER);
	}
	
	@Test(enabled=false)
	public void testCase () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("vidhya");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("subramaniam");
		Thread.sleep(500);
		WebElement txtLogin= driver.findElement(By.id("Login"));
	    txtLogin.click();	
	}	
	@Test
	public void testCase2 () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("vidhya");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("subramaniam");
		Thread.sleep(500);
		WebElement txtLogin= driver.findElement(By.id("Login"));
	    txtLogin.click();	
		
	}
	@Test
	public void testCase3 () throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys("apple laptop",Keys.ENTER);
	
	}
	@Test
	public void testCase4 () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("vidhya");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("subramaniam");
		Thread.sleep(500);
		WebElement txtLogin= driver.findElement(By.id("Login"));
	    txtLogin.click();	
	}	
	@Test
	public void testCase5 () throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("vidhya");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("subramaniam");
		Thread.sleep(500);
		WebElement txtLogin= driver.findElement(By.id("Login"));
	    txtLogin.click();	
	}
}

