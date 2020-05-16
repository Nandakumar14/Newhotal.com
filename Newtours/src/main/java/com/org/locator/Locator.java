package com.org.locator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.base.Property;

public class Locator extends Property {
	@FindBy(xpath="//a[text()='REGISTER']")
	private WebElement Regbutt;
	
	public WebElement getRegbutt() {
		return Regbutt;
	}
	public void setRegbutt(WebElement regbutt) {
		Regbutt = regbutt;
	}

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement Firstname;
	
	@FindBy(name="lastName")
	private WebElement Lasttname;
	
	@FindBy(name="phone")
	private WebElement Phone;
	
	@FindBy(name="userName")
	private WebElement Email;

	@FindBy(name="address1")
	private WebElement Address ;

	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;

	@FindBy(name="postalCode")
	private WebElement PostalCode;
	
	@FindBy(name="country")
	private WebElement Country;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath="//input[@name='confirmPassword']")
	private WebElement Conformpd;
	
	@FindBy(xpath="//input[@name='register']")
	private WebElement subbutt;


	public WebElement getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
	this.Firstname.sendKeys(firstname);
	}
	public WebElement getLasttname() {
		return Lasttname;
	}
	public void setLasttname(String lasttname) {
		this.Lasttname.sendKeys(lasttname);
	}
	public WebElement getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		this.Phone.sendKeys(phone);
	}
	public WebElement getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City.sendKeys(city);
	}
	public WebElement getState() {
		return State;
	}
	public void setState(String state) {
		this.State.sendKeys(state);
	}
	public WebElement getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		this.PostalCode.sendKeys(postalCode);
	}
	public WebElement getCountry() {
		return Country;
	}
	public void setCountry(WebElement country) {
		this.Country=country;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName.sendKeys(userName);
	}
	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password.sendKeys(password);
	}
	public void setAddress(String address) {
		this.Address.sendKeys(address);
	}
	public WebElement getConformpd() {
		return Conformpd;
	}
	public void setConformpd(String conformpd) {
		this.Conformpd.sendKeys(conformpd);
	}
	public WebElement getSubbutt() {
		return subbutt;
	}
	public void setSubbutt(WebElement subbutt) {
		this.subbutt = subbutt;
	}

public Locator(){
PageFactory.initElements(driver,this);

}

}
