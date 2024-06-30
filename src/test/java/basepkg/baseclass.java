package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().back();
}
	@AfterMethod
	public void postCondition() {
		
	}
}

