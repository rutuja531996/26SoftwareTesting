package testCases;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckoutPage1;
import pages.Inventory_Page;
import pages.LoginPage;
import pages.cartPage;
import pages.checkoutPage2;
import utility.ReadData;

public class checkoutPage2Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	cartPage cart;
	CheckoutPage1 check1;
	checkoutPage2 check2;
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new cartPage();
		check1=new CheckoutPage1();
		check2=new checkoutPage2();
		login.LoginToApplication();
		invent.add6Products();
		invent.ClickcartCount();
		cart.clickCheckOutBtn();
		check1.inputInfo();
	} 
	@Test
	public void verifycheckoutPage2labelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,10);//Checkout: Overview
		String actURL=check2.verifycheckoutPage2label();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifypaymentInfoLabelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,11);//Payment Information
		String actURL=check2.verifypaymentInfoLabel();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifyshippingInfoLabelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,12);//Shipping Information
		String actURL=check2.verifyshippingInfoLabel();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifypricetotalLabelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,13);//Price Total
		String actURL=check2.verifypricetotalLabel();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}