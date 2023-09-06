package com.magento.scripts;

import org.testng.annotations.Test;

import com.magento.pom.AddressBookPOM;
import com.magento.pom.LoginPOM;

public class VerifyAddressBook extends BaseTest{
	//VerifyLogin vl = new VerifyLogin();
	
	@Test
	public void addressValidVerification()throws InterruptedException
	{
		Thread.sleep(3000);
		LoginPOM lp = new LoginPOM(driver);
		
		lp.enterEmailPassword();
		//lp.clickLoginButton();
	
		AddressBookPOM address_pom = new AddressBookPOM(driver);
		address_pom.editAddress("00000000", "Pune", "Pune", "1111");
		//address_pom.address("00000000", "Pune", "Pune", "1111");
		
	
//		address_pom.clickManageAddress();
//		address_pom.enterPhone("0000000");
//		address_pom.enterStreet("Pune");
//		address_pom.enterCity("Pune");
//		address_pom.selectState();
//		address_pom.enterZip("1111");
//		address_pom.selectCountry();
//		address_pom.clickSaveAddr();
//		sa.assertAll();
	}

}


