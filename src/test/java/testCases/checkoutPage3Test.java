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
import pages.checkoutPage3;
import utility.ReadData;

public class checkoutPage3Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	cartPage cart;
	CheckoutPage1 check1;
	checkoutPage2 check2;
	checkoutPage3 check3;
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new cartPage();
		check1=new CheckoutPage1();
		check2=new checkoutPage2();
		check3=new checkoutPage3();
		login.LoginToApplication();
		invent.add6Products();
		invent.ClickcartCount();
		cart.clickCheckOutBtn();
		check1.inputInfo();
		check2.clickfinishbtn();
	} 
	@Test
	public void verifyURLOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,15);//https://www.saucedemo.com/checkout-complete.html
		String actURL=check3.VerifyURLofApplication();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifycheckoutPage3labelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,14);//Checkout: Complete!
		String actURL=check3.verifycheckoutPage3label();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifyimageTest() 
	{
		boolean result=check3.verifyimage();
		Assert.assertEquals(result,true);
		Reporter.log("Visibility of Checkout image ="+ result);
	}

	@Test
	public void verifythankyouLabelTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,16);//Thank you for your order!
		String actURL=check3.verifythankyouLabel();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifythankyouTextTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,17);//Your order has been dispatched, and will arrive just as fast as the pony can get there!
		String actURL=check3.verifythankyouText();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
