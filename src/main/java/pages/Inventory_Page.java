package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import utility.HandleDropDown;


public class Inventory_Page extends TestBase
{
	@FindBy(xpath="//span[@class='title']") private WebElement ProductTitleText;
	@FindBy(xpath="//div[@class='app_logo']") private WebElement AppLogoText;
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement CartLogo;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement TwitterLogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement FacebookLogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement LinkedInLogo;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") WebElement ProductNameText1;
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") WebElement ProductNameText2;
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']") WebElement ProductNameText3;
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']") WebElement ProductNameText4;
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") WebElement ProductNameText5;
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") WebElement ProductNameText6;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement Addtocart1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement Addtocart2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement Addtocart3;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement Addtocart4;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") WebElement Addtocart5;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement Addtocart6;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement backPackProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement bikeLightProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement boltTshirtProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") WebElement fleeceJacketProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") WebElement onesieProduct;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement redTshirtProduct;
	@FindBy(xpath="//select[@class='product_sort_container']") WebElement productSortDropDown;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") WebElement cartCount;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") WebElement removeBackPackProduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") WebElement removeBikeLightProduct;
	
	public Inventory_Page()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyProductLabel()
	{
		return ProductTitleText.getText();
	}
	public String verifyAppLogoLabel()
	{
		return AppLogoText.getText();
		
	}
	public boolean verifyCartLogo()
	{
		return CartLogo.isDisplayed();
		
	}
	public boolean verifyTwitterLogo()
	{
		return TwitterLogo.isDisplayed();
		
	}
	public boolean verifyFacebookLogo()
	{
		return FacebookLogo.isDisplayed();
		
	}
	public boolean verifyLinkedInLogo()
	{
		return LinkedInLogo.isDisplayed();
		
	}
	public String verifyProductNameText1()
	{
		return ProductNameText1.getText();
	}
	public String verifyProductNameText2()
	{
		return ProductNameText2.getText();
	}
	public String verifyProductNameText3()
	{
		return ProductNameText3.getText();
	}
	public String verifyProductNameText4()
	{
		return ProductNameText4.getText();
	}
	public String verifyProductNameText5()
	{
		return ProductNameText5.getText();
	}
	public String verifyProductNameText6()
	{
		return ProductNameText6.getText();
	}
	
	public boolean verifyAddtocart1()
	{
		return Addtocart1.isDisplayed();
		
	}
	public boolean verifyAddtocart2()
	{
		return Addtocart2.isDisplayed();
		
	}
	public boolean verifyAddtocart3()
	{
		return Addtocart3.isDisplayed();
		
	}
	public boolean verifyAddtocart4()
	{
		return Addtocart4.isDisplayed();
		
	}
	public boolean verifyAddtocart5()
	{
		return Addtocart5.isDisplayed();
		
	}
	public boolean verifyAddtocart6()
	{
		return Addtocart6.isDisplayed();
		
	}
	public String add6Products()
	{
		HandleDropDown.handleSelectClass(productSortDropDown, ("Price (low to high)"));
		//HandleDropdown.handleSelectClass(productSortDropDown, ("Price (low to high)"));
		//HandleDropdown.handleSelectClass(productSortDropDown,("Price (low to high)"));
		//Select s=new Select(productSortDropDown);
		//s.selectByVisibleText("Name (A to Z)");
		backPackProduct.click();
		bikeLightProduct.click();
		boltTshirtProduct.click();
		fleeceJacketProduct.click();
		onesieProduct.click();
		redTshirtProduct.click();
		return cartCount.getText();		
	}
	
	
	public String remove2Product() throws InterruptedException 
	{
		add6Products();
		removeBackPackProduct.click();
		removeBikeLightProduct.click();
		//Thread.sleep(3000);
		return cartCount.getText();	
	}
	public void ClickcartCount()
	{
		cartCount.click();
	}

}


