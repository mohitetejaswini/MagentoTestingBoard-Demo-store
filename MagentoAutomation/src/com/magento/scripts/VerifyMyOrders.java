package com.magento.scripts;

import org.testng.annotations.Test;

import com.magento.pom.LoginPOM;
import com.magento.pom.MyOrdersPOM;


public class VerifyMyOrders extends BaseTest {
	public LoginPOM lp;
	public MyOrdersPOM order ;

	@Test
	public void myOrdersVerification() {
		
		lp = new LoginPOM(driver);
		order = new MyOrdersPOM(driver);
		lp.enterEmailPassword();
		
		order.clickMyOrders();
			
	}
	@Test(priority=1)
	public void verifyViewOrders() {
		lp = new LoginPOM(driver);
		order = new MyOrdersPOM(driver);
		lp.enterEmailPassword();
		order.clickMyOrders();
		order.viewOrders();
	}
	@Test(priority=2)
	public void verifyReorderItem() {
		lp = new LoginPOM(driver);
		order = new MyOrdersPOM(driver);
		lp.enterEmailPassword();
		order.clickMyOrders();
		order.reorderItems();
		
	}
	@Test(priority=3)
	public void verifyEntries() {
		lp = new LoginPOM(driver);
		order = new MyOrdersPOM(driver);
		lp.enterEmailPassword();
		
		order.clickMyOrders();
		order.selectEntries();
	}
	
	
	
}
