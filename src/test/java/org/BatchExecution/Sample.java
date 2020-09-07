package org.BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample extends Base {
	@Test
	public void testCase1() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys("Books",Keys.ENTER);
		
	}

	
	
	
	}




