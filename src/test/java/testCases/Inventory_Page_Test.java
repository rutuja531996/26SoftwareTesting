package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
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
import utility.HandleDropDown;
import utility.ReadData;

public class Inventory_Page_Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;

	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		login.LoginToApplication();
	}
	@Test
	public void verifyProductLabelTest() throws EncryptedDocumentException, IOException
	{
		String expLable=ReadData.readExcel(0, 3);//Products
		String actLable=invent.verifyProductLabel();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("applications Lable = "+actLable);
	}
	@Test
	public void verifyTwitterLogoTest()
	{
		boolean result=invent.verifyTwitterLogo();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Visibility of Twitter Logo ="+ result);
	}
	@Test
	public void verifyFacebookTest()
	{
		boolean result=invent.verifyFacebookLogo();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Visibility of Facebook Logo ="+ result);
	}
	@Test
	public void verifyLinkedInTest()
	{
		boolean result=invent.verifyLinkedInLogo();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Visibility of LinkedIn Logo ="+ result);
	}
	@Test
	public void verifyAppLogoLabelTest()
	{
		String expLabel="Swag Labs";
		String actLabel=invent.verifyAppLogoLabel();
		AssertJUnit.assertEquals(expLabel, actLabel);
		Reporter.log("Application Logo Lable = "+actLabel);
	}
	@Test
	public void verifyCartLogoTest()
	{
		boolean result=invent.verifyCartLogo();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Visibility of Cart Logo ="+ result);
	}
	@Test
	public void verifyProductNameText1Test()
	{
		String expLable="Sauce Labs Backpack";
		String actLable=invent.verifyProductNameText1();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyProductNameText2Test()
	{
		String expLable="Sauce Labs Bike Light";
		String actLable=invent.verifyProductNameText2();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyProductNameText3Test()
	{
		String expLable="Sauce Labs Bolt T-Shirt";
		String actLable=invent.verifyProductNameText3();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyProductNameText4Test()
	{
		String expLable="Sauce Labs Fleece Jacket";
		String actLable=invent.verifyProductNameText4();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyProductNameText5Test()
	{
		String expLable="Sauce Labs Onesie";
		String actLable=invent.verifyProductNameText5();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyProductNameText6Test()
	{
		String expLable="Test.allTheThings() T-Shirt (Red)";
		String actLable=invent.verifyProductNameText6();
		AssertJUnit.assertEquals(expLable,actLable);
		Reporter.log("Product Lable = "+actLable);
	}
	@Test
	public void verifyAddtocart1Test()
	{
		boolean result=invent.verifyAddtocart1();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void verifyAddtocart2Test()
	{
		boolean result=invent.verifyAddtocart2();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void verifyAddtocart3Test()
	{
		boolean result=invent.verifyAddtocart3();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void verifyAddtocart4Test()
	{
		boolean result=invent.verifyAddtocart4();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void verifyAddtocart5Test()
	{
		boolean result=invent.verifyAddtocart5();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void verifyAddtocart6Test()
	{
		boolean result=invent.verifyAddtocart6();
		AssertJUnit.assertEquals(result,true);
		Reporter.log("Product Label ="+ result);
	}
	@Test
	public void add6ProductsTest() throws EncryptedDocumentException, IOException
	{
		String expCount=ReadData.readExcel(0, 4);//6(0,4)
		String actCount=invent.add6Products();
		AssertJUnit.assertEquals(expCount, actCount);
		Reporter.log("Total products added in to the cart:" + actCount);
	}
	@Test
	public void remove2ProductTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String expCount=ReadData.readExcel(0, 5);//4(0,5)
		String actCount=invent.remove2Product();
		AssertJUnit.assertEquals(expCount, actCount);
		Reporter.log("Count of product after removing"+ actCount);
	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}

