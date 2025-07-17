package autoSuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sel");
		
		Thread.sleep(3000);
		
		
		
		
		WebElement sugg=driver.findElement(By.xpath("(//span[contains(text(),'sel')])[5]"));
		
		System.out.println(sugg.getText());
		sugg.click();
		
		driver.quit();
		

	}

}
