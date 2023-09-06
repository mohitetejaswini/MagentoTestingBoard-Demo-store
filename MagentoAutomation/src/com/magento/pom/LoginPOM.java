package com.magento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	@FindBy(name = "login[username]")
	private WebElement email;
	
	@FindBy(name = "login[password]")
	private WebElement password;
	
	@FindBy(name = "send")
	private WebElement submit;
		
	public LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailPassword() {
		email.sendKeys("newtester2111@gmail.com");
		password.sendKeys("india*2023");
		submit.click();

	}
	public void loginCred(String em, String pw) {
		email.sendKeys(em);
		password.sendKeys(pw);
		submit.click();
	}

	
}
