package org.testngecom;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceBase {


	static WebDriver driver;
	
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
public void faceBook() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("vidhya ");
	WebElement txtPassWrd = driver.findElement(By.id("pass"));
	txtPassWrd.sendKeys("subramaniam");
	Thread.sleep(500);
	WebElement btnLog = driver.findElement(By.id("u_0_f"));
	btnLog.click();
	

}


}


