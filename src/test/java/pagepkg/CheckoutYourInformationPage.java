package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage {
	WebDriver driver;
	
	@FindBy(id="first-name")
		WebElement firstname;
		
		@FindBy(id="last-name")
		WebElement lastname;
		
		@FindBy(id="postal-code")
		WebElement zipcode;
		
		@FindBy(id="continue")
		WebElement continuebtn;
		
		/*@FindBy(id="react-burger-menu-btn")
		WebElement burgermenu;
		
		@FindBy(id="logout_sidebar_link")
		WebElement logout;
		*/

public CheckoutYourInformationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void setvalues(String frstnme, String lstnme, String zpcd) {

		
		firstname.sendKeys(frstnme);
		lastname.sendKeys(lstnme);
		zipcode.sendKeys(zpcd);
}
		public void contnbtn() {
		continuebtn.click();
		
	}
}