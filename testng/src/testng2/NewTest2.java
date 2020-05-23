package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void f() {
		System.setProperty("webdriver.firefox.driver", "firefoxdriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
}
