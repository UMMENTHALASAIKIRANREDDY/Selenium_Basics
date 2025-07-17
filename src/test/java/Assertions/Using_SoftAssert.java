package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Using_SoftAssert {
	
	@Test
	public void Soft() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.flipkart.com/";
		
		//Soft Assertion methods2
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualURL,ExpectedURL);
		soft.assertFalse(ActualURL.contains(ExpectedURL));
		soft.assertNotNull(ActualURL);
		
		
		driver.quit();
		soft.assertAll();
	}

}
