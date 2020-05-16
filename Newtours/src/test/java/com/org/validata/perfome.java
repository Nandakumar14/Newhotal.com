package com.org.validata;





import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.junit.FixMethodOrder; 
import org.junit.runners.MethodSorters;
import com.org.base.Property;
import com.org.locator.Locator;
import com.org.locator.Singon;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class perfome extends Property{
	private static final String priority1 = null;
	static Property bw;
	static Locator ele;
	static Singon sig;
	@BeforeClass
	public static void percondition() {
		bw.getdriver("chrome");
	}
@Test
public void condition() throws InterruptedException{
 ele =new Locator();
 
 //Registor
	clickbut( driver,ele.getRegbutt(),10);
	Senddata(driver, ele.getFirstname(),2,"nanda");
	Senddata(driver, ele.getLasttname(),2,"vasu");
	Senddata(driver, ele.getPhone(),2,"7123456789");
	Senddata(driver, ele.getEmail(),2,"v.nandak@yahoomail.com");
	Senddata(driver, ele.getAddress(),2,"3,Ram nagar");
	Senddata(driver, ele.getCity(),2,"Chennai");
	Senddata(driver, ele.getState(),2,"Tamilnadu");
	Senddata(driver, ele.getPostalCode(),2,"600015");
	select(ele.getCountry());
	Thread.sleep(3000);
	Senddata(driver,ele.getUserName(), 3,"v.nandak@yahoomail.com");
	Senddata(driver,ele.getPassword(), 3,"free1234!");
	Senddata(driver,ele.getConformpd(), 3,"free1234!");
	clickbut(driver,ele.getSubbutt(),20);
}
	@Test
	public void condition1() throws InterruptedException{
	 
	sig =new Singon();
	
	clickbut(driver,sig.getSingoffbutt(),4);
	Senddata(driver,sig.getSingusername(), 2,"v.nandak@yahoomail.com");
	Senddata(driver,sig.getSingpassword(),2,"free1234!");
	clickbut(driver,sig.getSingLogin(),5);

}
	

	@AfterClass
	public static void postcondition() throws InterruptedException{
		driver.quit();
	}
	
}
