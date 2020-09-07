package org.BatchExecution;

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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution extends Base {
	@BeforeClass
	public void launchbroswer() {
		WebDriverManager.chromedriver();
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

	@Test(groups = "sanity")

	public void testCase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:/adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vidhyaSubramaniam56");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("vidhu1234");
		Thread.sleep(500);
		WebElement txtLogin = driver.findElement(By.id("login"));
		txtLogin.click();
	}

	@Test(groups = "smoke")

		public void testCase2 () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys("redmi mobiles",Keys.ENTER);
		
	}

	@Test
	public void testCase5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("http:/adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vidhyaSubramaniam56");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("vidhu1234");
		WebElement txtLogin = driver.findElement(By.id("login"));
		txtLogin.click();
	}
	public void testCase6 () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		txtUserName.sendKeys("redmi mobiles",Keys.ENTER);
	}

	@Test
	public void testCase3()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:/adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vidhyaSubramaniam56");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("vidhu1234");
		WebElement txtLogin = driver.findElement(By.id("login"));
		txtLogin.click();

	}

	@Test(groups = "smoke")
	public void testCase4()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidhy\\eclipse-workspace\\TestNGSam1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:/adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vidhyaSubramaniam56");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("vidhu1234");
		WebElement txtLogin = driver.findElement(By.id("login"));
		txtLogin.click();
	}
}
