package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_Validation_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement sub_tf = driver.findElement(By.id("newsletter-email"));
		
		if(sub_tf.isDisplayed()) {
			sub_tf.sendKeys("selenium@gmail.com");
			if(sub_tf.isEnabled()) {
				Thread.sleep(3000);
				driver.findElement(RelativeLocator.with(By.tagName("input")).below(sub_tf)).click();
			}
			else {
				System.out.println("button is disable");
			}
		}
		else {
			System.out.println("Element not found");
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
