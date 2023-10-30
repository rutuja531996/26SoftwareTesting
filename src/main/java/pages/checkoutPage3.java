package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class checkoutPage3 extends TestBase
	{
		
		@FindBy(xpath="//span[@class='title']") WebElement checkoutPage3label;
	    @FindBy(xpath ="//img[@class='pony_express']") WebElement image;
	    @FindBy(xpath ="//h2[@class='complete-header']") WebElement thankyouLabel;
	    @FindBy(xpath ="//div[@class='complete-text']") WebElement thankyouText;
	    @FindBy(xpath ="//button[@id='back-to-products']") WebElement backBtn;
	    public checkoutPage3()
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    public String VerifyURLofApplication()
		{
			return driver.getCurrentUrl();
			
		}
	    public String verifycheckoutPage3label()
		{
			return checkoutPage3label.getText();
		}
	    public boolean verifyimage()
		{
			return image.isDisplayed();
		}
	    public String verifythankyouLabel()
	    {
			return thankyouLabel.getText();
	    	
	    }
	    public String verifythankyouText()
	    {
			return thankyouText.getText();
	    	
	    }
	    public void clickbackbtn()
	    {
	    	backBtn.click();
	    }
		
	   
	} 

	    