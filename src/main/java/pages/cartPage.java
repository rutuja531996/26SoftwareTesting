package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class cartPage extends TestBase
{
	@FindBy(xpath = "//span[@class='title']") WebElement titleofcartpage;
	@FindBy(xpath="//button[@id='checkout']") WebElement checkOutBtn;
	public cartPage()
	{
		PageFactory.initElements(driver,this);
	}
	public String VerifyURLofApplication()
	{
		return driver.getCurrentUrl();
		
	}
	public String verifyTitleCartPage()
	{
		return titleofcartpage.getText();
	}
	public void clickCheckOutBtn()
	{
		checkOutBtn.click();
	}



}
