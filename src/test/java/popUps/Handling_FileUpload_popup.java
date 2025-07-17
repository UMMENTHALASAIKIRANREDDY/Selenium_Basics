package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUpload_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin:admin@the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\LENOVO\\Downloads\\Vadlapudi Om Prakash (2).pdf");

		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
