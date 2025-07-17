package xpath;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIndependantAndDependantXpath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("toys"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//a[contains(@title,'SABIRAT')]/../a[contains(@class,'DMMoT0')]/div/div[contains(@class,'Nx9bqj')]"));
		
		System.out.println(price.getText());
		
		driver.quit();
		

	}

}
