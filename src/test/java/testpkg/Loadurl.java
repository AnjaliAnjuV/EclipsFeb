package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loadurl {
	WebDriver  driver;
	String url = "https://www.google.com";
	
	@Test
	public void urlload() {
		driver = new ChromeDriver();
		driver.get(url);
	}
}
