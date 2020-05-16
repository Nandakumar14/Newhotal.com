package com.org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.base.Property;

public class Singon extends Property {
	
	@FindBy(xpath="//a[text()='SIGN-ON']")
	private WebElement Singonbutt;
	
	@FindBy(xpath="//a[text()='SIGN-OFF']")
	private WebElement Singoffbutt;
	

	@FindBy(xpath="//input[@name='userName']")
	private WebElement Singusername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Singpassword;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement SingLogin;

	

	public WebElement getSingoffbutt() {
		return Singoffbutt;
	}

	
	public WebElement getSingonbutt() {
		return Singonbutt;
	}

	public WebElement getSingusername() {
		return Singusername;
	}

	public WebElement getSingpassword() {
		return Singpassword;
	}

	public WebElement getSingLogin() {
		return SingLogin;
	}
	public void setSingoffbutt(WebElement singoffbutt) {
		Singoffbutt = singoffbutt;
	}

	public void setSingonbutt(WebElement singonbutt) {
		this.Singonbutt = singonbutt;
	}

	public void setSingusername(String singusername) {
		this.Singusername.sendKeys(singusername);
	}

	public void setSingpassword(String singpassword) {
		this.Singpassword.sendKeys(singpassword);
	}

	public void setSingLogin(WebElement singLogin) {
		this.SingLogin = singLogin;
	}

public Singon(){
	PageFactory.initElements(driver,this);
}
}

