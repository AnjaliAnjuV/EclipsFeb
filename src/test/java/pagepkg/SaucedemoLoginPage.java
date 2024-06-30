package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoLoginPage {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement sauceusername;
	
	@FindBy(id="password")
	WebElement saucepaswrd;
	
	@FindBy(name="login-button")
	WebElement saucelogin;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addtocart1;

	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement addtocart2;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addtocart3;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement addtocart4;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement addtocart5;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement addtocart6;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement addtocarticon;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	
	public SaucedemoLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String username, String paswrd) {
	
			sauceusername.sendKeys(username);
			saucepaswrd.sendKeys(paswrd);
			/*firstname.sendKeys(frstnme);
			lastname.sendKeys(lstnme);
			zipcode.sendKeys(zpcd);*/
		  	
		}
		public void loginClick() {
		saucelogin.click();
		addtocart1.click();
		addtocart2.click();
		addtocart3.click();
		addtocart4.click();
		addtocart5.click();
		addtocart6.click();
		addtocarticon.click();
		checkout.click();
		
		/*burgermenu.click();
		logout.click();*/
		}
}


