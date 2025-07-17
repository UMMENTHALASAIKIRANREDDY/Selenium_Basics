package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Drag')]")).click();
		
		
		//Perfoming Right click
		Actions act=new Actions(driver);
		WebElement D_Amount=driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		WebElement D_AmountPlace=driver.findElement(By.id("amt7"));
		WebElement D_Account=driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		
		WebElement C_AmountPlace=driver.findElement(By.id("amt8"));
		WebElement C_AccountPlace=driver.findElement(By.id("bank"));
		WebElement C_Account=driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
		
		
		//drag and drop

		act.dragAndDrop(D_Amount, D_AmountPlace).perform();
		act.dragAndDrop(D_Amount, C_Account).perform();
		Thread.sleep(3000);
		//driver.quit();

	}

}
