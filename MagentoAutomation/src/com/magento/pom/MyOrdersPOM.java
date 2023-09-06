package com.magento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyOrdersPOM {
	@FindBy(xpath="//a[text()='My Orders']")
	private WebElement myOrders;
	
	@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/sales/order/view/order_id/21015/']")
	private WebElement viewOrder;
	
	@FindBy(xpath="//tbody/tr[4]/td[6]/a[2]")
	private WebElement reorderItem;
	
	@FindBy(id="limiter")
	private WebElement entryNo;
	
	public MyOrdersPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyOrders()
	{
		myOrders.click();
	}
	public void viewOrders() {
		viewOrder.click();
	}
	
	public void reorderItems() {
		reorderItem.click();
	}
	public void selectEntries() {
		entryNo.click();
		Select selectOpt=new Select(entryNo);
		selectOpt.selectByVisibleText("20");;
		
	}

}
