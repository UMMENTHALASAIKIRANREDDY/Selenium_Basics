package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu");
		
		//Perfoming Right click
		Actions act=new Actions(driver);
		WebElement rightClickElement=driver.findElement(By.xpath("//span[contains(text(),'right cli')]"));
		
		act.contextClick(rightClickElement).perform();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement doubleClickElement=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		act.doubleClick(doubleClickElement).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
