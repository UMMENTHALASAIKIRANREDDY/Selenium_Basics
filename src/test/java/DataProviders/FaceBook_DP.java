package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook_DP {
	
	
	@DataProvider
	public Object[][] dataProviders() {
		
		Object[][] obj = new Object[2][2];
		obj[0][0]="saikiranreddy";
		obj[0][1]="saireddy";
		obj[1][0]="saikiranreddy7547";
		obj[1][1]="123456789";
		
		return obj;
	}
	
	@Test(dataProvider="dataProviders")
	public void fbLogin(String un,String pass) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate to web page
		driver.get("https://www.facebook.com/");
		
		//enter user name from data providers
		driver.findElement(By.id("email")).sendKeys(un);
		//enter pswd from data providers
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		driver.quit();

		
	}

}
