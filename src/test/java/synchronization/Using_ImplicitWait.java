package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Experience')]")).click();
		driver.findElement(By.id("name")).sendKeys("selenium");
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		//login
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
