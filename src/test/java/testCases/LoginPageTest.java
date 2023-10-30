package testCases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class LoginPageTest extends TestBase
{
   LoginPage login;
   @BeforeMethod

       public void setUp() throws InterruptedException, IOException
   	{
   		initialization();
   		login=new LoginPage();
   	}
    @Test
    
    public void verifyURLOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,0);//https://www.saucedemo.com/ (0,0)
		String actURL=login.verifyURLOfApplication();
        Assert.assertEquals(expURL, actURL);
		
	
	}
	@Test
	public void verifyTitleOfApplication() throws EncryptedDocumentException, IOException
	{
		String expTitle=ReadData.readExcel(0,1);//Swag Labs(0,1)
		String actTitle=login.verifyTitleOfApplication();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test
	public void LoginToApplicationTest() throws IOException
	{
		String expURL=ReadData.readExcel(0,2);//https://www.saucedemo.com/inventory.html
		String actURL=login.LoginToApplication();
		//Assert.assertEquals(expURL,actURL);
		
	}
	@AfterMethod
	public void closeBrowser(ITestResult it) throws IOException
	{
		if(it.FAILURE==it.getStatus())
		{
			CaptureScreenShot.scrrenshot(it.getName());
		}
		report.flush();
		driver.close();
	}

}











    
    


