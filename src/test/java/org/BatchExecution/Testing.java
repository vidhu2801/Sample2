package org.BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing extends Base {
	@Test(groups="smoke")

		public void testCase1 () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
			txtUserName.sendKeys("Dress",Keys.ENTER);
			
	}
}
