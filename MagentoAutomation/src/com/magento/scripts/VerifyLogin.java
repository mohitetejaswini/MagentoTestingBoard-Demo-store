package com.magento.scripts;

import java.time.Duration;

import org.testng.annotations.Test;
import com.magento.pom.LoginPOM;

public class VerifyLogin extends BaseTest{
	
		
	
	@Test	
	public void loginVerification() throws InterruptedException {
		
		LoginPOM log = new LoginPOM(driver);
		log.enterEmailPassword();  //valid login
		sa.assertAll();
			
	}
	
	@Test
	public void verifyLoginInvPass() {
		LoginPOM log1 = new LoginPOM(driver);
		log1.loginCred("newtester2111@gmail.com", "indi*2023");     //Invalid password
		
	}
	@Test
	public void verifyLoginInvEmail() {
		LoginPOM log1 = new LoginPOM(driver);
		log1.loginCred("newtester2111@gamil.com", "indi*2023");     //Invalid email
		
	}
	@Test
	public void verifyInvalidLoginEmptEmail() {
		LoginPOM log1 = new LoginPOM(driver);
		log1.loginCred(" ", "indi*2023");     //Empty email
		
	}
	@Test
	public void verifyEmptPass() {
		LoginPOM log1 = new LoginPOM(driver);
		log1.loginCred("newtester2111@gmail.com", "");     //Empty Password
		
	}

}
