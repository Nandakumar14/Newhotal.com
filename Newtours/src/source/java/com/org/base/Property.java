package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Property {
	public static WebDriver driver;

	public static WebDriver getdriver(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:/Driver/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equals("firfoxe")){
			System.setProperty("webdriver.gecko.driver","E:/Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("please pass the valid browser");
		}
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;	
	}
		
	public static void Senddata(WebDriver driver,WebElement element,int timeout,String value){
	new WebDriverWait(driver,timeout).
	until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	}
	
	public static void clickbut(WebDriver driver,WebElement element,int timeout){
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public  void Actions(WebElement element){
		Actions as =new Actions(driver);
				as.moveToElement(element);
	}

	public static void select(WebElement element){
		Select sel =new Select(element);
	     sel.selectByValue("92");
	}
}

