package org.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	
	public static WebDriver  getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver (1).exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void type( WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void KeysToSend (WebElement element,String data) {
		element.sendKeys(data);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}
	

}


