package org.dataprovider;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTask {
	
	static WebDriver driver;
	
	@BeforeClass
	public void launchbroswer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
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
	@Test(dataProvider="input")
public void testCase(String username) throws InterruptedException {
		driver.get("https://www.amazon.in/");
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys(username,Keys.ENTER);
		Thread.sleep(3000);
		}
@DataProvider (name="input")
	public Object[] [] data(){
		return new Object[] [] {
			{"iphone"},{"camera"},{"bag"},{"mobile"},{"laptop"}
				
			};
		}
		
}
