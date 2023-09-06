package com.magento.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.magento.pom.AddressBookPOM;
import com.magento.pom.LoginPOM;
import com.magento.pom.MyOrdersPOM;

public class BaseTest {
	public WebDriver driver;
	SoftAssert sa = new SoftAssert();
	
	
@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","E:\\Testing\\Selenium\\Chrome download\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);	

	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	 
	 
}
 
// @AfterMethod
// public void close() {
// driver.close();
//
//}
}
