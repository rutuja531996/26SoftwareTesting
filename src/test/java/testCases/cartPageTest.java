package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Inventory_Page;
import pages.LoginPage;
import pages.cartPage;
import utility.ReadData;

public class cartPageTest extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	cartPage cart;
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new cartPage();
		login.LoginToApplication();
		invent.add6Products();
		invent.ClickcartCount();
	}
	@Test
	public void verifyURLOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,6);//https://www.saucedemo.com/cart.html
		String actURL=cart.VerifyURLofApplication();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("URL of cart page = "+actURL);
	}
	@Test
	public void verifyTitleCartPageTest() throws EncryptedDocumentException, IOException
	{
		String expTitle=ReadData.readExcel(0,7);//Your Cart
		String actTitle=cart.verifyTitleCartPage();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of Cart page"+actTitle);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


}
