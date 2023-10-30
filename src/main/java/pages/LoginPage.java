package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase
{
	//object repository
	@FindBy(xpath="//input[@id='user-name']") private WebElement userNameTextBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginBtn;
	//constructor to initialize the web element(current class)
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//method to login in application
	public String LoginToApplication() throws IOException
	{
		//userNameTextBox.sendKeys(ReadData.readPropertyFile("UserName"));
		//passwordTextBox.sendKeys(ReadData.readPropertyFile("Password"));
		//loginBtn.click();
		//return driver.getCurrentUrl();
		logger=report.createTest("Login to sauce lab Application");
		userNameTextBox.sendKeys(ReadData.readPropertyFile("UserName"));
		logger.log(Status.INFO,"Username is entered");
		passwordTextBox.sendKeys(ReadData.readPropertyFile("Password"));
		logger.log(Status.INFO,"Password id entered");
		loginBtn.click();
		logger.log(Status.INFO,"Login button is clicked");
		logger.log(Status.PASS,"Login is sucessful");
		return driver.getCurrentUrl();
		

		
	}
	public String LoginToApplicationWithMultipleData(String un, String pass)
	{
		userNameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pass);
		loginBtn.click();
		return driver.getCurrentUrl();

	}
	
	public String verifyTitleOfApplication()
	{
		return driver.getTitle();	
	}
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();
		
	}
	

}

