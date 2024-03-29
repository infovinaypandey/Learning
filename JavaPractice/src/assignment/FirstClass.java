package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class FirstClass {

	public void getWebDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Aanavi\\bestJavaDeveloper\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("q"));

		String actualTitle = "Selenium - Web Browser Automation";
		String expectedTitel = "Selenium - Web Browser Automation1";

		SoftAssert sf = new SoftAssert();
		sf.assertEquals(actualTitle, expectedTitel);

		// Assert.assertEquals(actualTitle, expectedTitel);
		driver.findElement(By.linkText("Support")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success");
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass objDriver = new FirstClass();
		objDriver.getWebDriver();
	}

}
