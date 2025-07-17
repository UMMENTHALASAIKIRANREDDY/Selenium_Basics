package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("toys");
		
		//clicking the search button which is developed using "svg"
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		
		//find the window id of parent window
		String pwid = driver.getWindowHandle();
		
		//click on the product
		driver.findElement(By.xpath("//a[contains(@title,\"AR\")]")).click();
		
		Set<String> wids = driver.getWindowHandles();
		
		for(String s:wids) {
			if(driver.getTitle().contains("ARIZON DIY Plastic Building Blocks for Kids 100+ pcs - DIY Plastic Building Blocks for Kids 100+ pcs . Buy  Any toys in India. shop for  ARIZON products in India. | Flipkart.com")) {
				Thread.sleep(3000);
				driver.switchTo().window(s);
				
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				
				Thread.sleep(3000);
			}
		}
		
		driver.switchTo().window(pwid);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
