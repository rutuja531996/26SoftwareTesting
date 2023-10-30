package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class checkoutPage2 extends TestBase
{
	@FindBy(xpath="//span[@class='title']") WebElement checkoutPage2label;
    @FindBy(xpath ="(//div[@class='summary_info_label'])[1]") WebElement paymentInfoLabel;
    @FindBy(xpath ="(//div[@class='summary_info_label'])[2]") WebElement shippingInfoLabel;
    @FindBy(xpath ="(//div[@class='summary_info_label'])[3]") WebElement pricetotalLabel;
    @FindBy(xpath ="//button[@id='finish']") WebElement finishBtn;
    
    public checkoutPage2()
    {
    	PageFactory.initElements(driver, this);
    }
    public String verifycheckoutPage2label()
	{
		return checkoutPage2label.getText();
	}
    public String verifypaymentInfoLabel()
    {
		return paymentInfoLabel.getText();
    	
    }
    public String verifyshippingInfoLabel()
    {
		return shippingInfoLabel.getText();
    	
    }
    public String verifypricetotalLabel()
    {
		return pricetotalLabel.getText();
    	
    }
    public void clickfinishbtn()
    {
    	finishBtn.click();
    }
	
}
