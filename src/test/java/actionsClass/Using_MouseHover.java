package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//performing mouseovering on element
		Actions act=new Actions(driver);
		
		WebElement overElement=driver.findElement(By.xpath("//span[text()='Prime']"));
		act.moveToElement(overElement).perform();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
