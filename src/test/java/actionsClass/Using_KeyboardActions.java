package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://flipkart.com/");
		WebElement searchTF=driver.findElement(By.name("q"));
		
		//performing the action
		Actions act=new Actions(driver);
		act.moveToElement(searchTF).click(searchTF).keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
