package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Handlings_notification_popups {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions opt=new EdgeOptions();
		
		opt.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		driver.findElement(By.id("browNotButton")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
