package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Using_FrameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/india");
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//switching to frame using ID
		driver.switchTo().frame("auth-login-ui");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("6305304979");
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		
		//switch to home page 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
