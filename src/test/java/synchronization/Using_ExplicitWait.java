package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
		
		//explicit wait 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//titleContains()
		wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box"));
		
		//visibilityOf()
		WebElement nameTF=driver.findElement(By.xpath("//input[@type='text']"));
		wait.until(ExpectedConditions.visibilityOf(nameTF));
		
		nameTF.sendKeys("Selenium");
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		//elementToBeClickable()
		WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
		wait.until(ExpectedConditions.elementToBeClickable(register));
		
		register.click();
	
		Thread.sleep(3000);
		
		driver.quit();
	}
}
