package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_HardAssert {
	
	@Test
	public void Scenario(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		String title=driver.getTitle();	
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		//Assertions  methods
		Assert.assertEquals(title,ExpectedTitle);	
		Assert.assertTrue(title.contains(ExpectedTitle));
		Assert.assertNotNull(ExpectedTitle);
		
		//intentionally we are failing the script
		Assert.fail();
		
		
		driver.quit();
	}

}
