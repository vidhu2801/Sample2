package org.testngecom;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {
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
public void testCase1() throws InterruptedException {
	driver.get("https://www.amazon.in/");
	WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
	txtUserName.sendKeys("apple laptop",Keys.ENTER);
	
	List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	Thread.sleep(500);
	int size = list.size();
	System.out.println("number of mobile="+size);
	for (int i = 0; i < list.size(); i++) {
		WebElement element = list.get(i);
		String text = element.getText();
		System.out.println(text);
		
	}
}	

}

