package com.magento.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPOM {
	
	@FindBy(xpath ="//span[text()='Manage Addresses']")
	private WebElement manage_address;


	@FindBy(name = "telephone")
	private WebElement phoneNumber;
	
	@FindBy(name = "street[]")
	private WebElement street;
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(name = "region_id")
	private WebElement state;
	
	@FindBy(name = "postcode")
	private WebElement zipcode;
	
	@FindBy(name = "country_id")
	private WebElement country;
	
	
	@FindBy(xpath="//span[text()='Save Address']")
	private WebElement saveAddressButton;
	
	@FindBy(xpath="//span[text()='Add New Address']")
	private WebElement addNewAddress;
	
	@FindBy(xpath="//a[@data-ui-id='default-billing-edit-link']")
	private WebElement editaddress;
	
	public AddressBookPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void selectState() {
		Select stateSel = new Select(state);
		stateSel.selectByVisibleText("Tirol");
	}
	
//	public void enterZip(String zp) {
//		zipcode.sendKeys(zp);
//	}
	
	public void selectCountry() {
		Select countrySel = new Select(country);
		countrySel.selectByIndex(6);
	}
//------------------------------------------	
	public void editAddress(String phn, String str, String cit, String post) {
		//manage_address.click();
		editaddress.click();
		
		//addNewAddress.click();
		phoneNumber.clear();
		phoneNumber.sendKeys(phn);
		street.clear();
		street.sendKeys(str);
		city.clear();
		city.sendKeys(cit);
		selectState();
		zipcode.clear();
		zipcode.sendKeys(post);
		selectCountry();
	}
	
//--------------------------------------------------	
	public void address(String phn, String str, String cit, String post) {
		
		manage_address.click();
		addNewAddress.click();
		phoneNumber.sendKeys(phn);
		street.sendKeys(str);
		city.sendKeys(cit);
		selectState();
		zipcode.sendKeys(post);
		selectCountry();
	}
	public void clickSaveAddr() {
		saveAddressButton.click();
	}
	

}