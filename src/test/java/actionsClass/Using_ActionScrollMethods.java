package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_ActionScrollMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//Scroll to webpage using corrdnates
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1700).perform();
		
		Thread.sleep(3000);
		
		//Scroll using webelement
		WebElement helpElement=driver.findElement(By.linkText("Help"));
		act.scrollToElement(helpElement).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
