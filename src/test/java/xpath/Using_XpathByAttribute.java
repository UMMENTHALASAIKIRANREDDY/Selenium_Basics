package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		//Lauch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximuize the window
		driver.manage().window().maximize();
		
		//navigate to website
		driver.get("https://www.flipkart.com/");
		
		//identify the TF using 'X-path by Attribute'
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobile"+Keys.ENTER);
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
