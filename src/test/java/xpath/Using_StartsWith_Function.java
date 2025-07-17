package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_StartsWith_Function {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//Maximuize the window
		driver.manage().window().maximize();
		
		//navigate to website
		driver.get("https://www.facebook.com/");
		
		//identify email Text feild
		driver.findElement(By.xpath("//input[starts-with(@name,'e')]")).sendKeys("facebook@gmail.com");
		
		//identify password text field
		driver.findElement(By.xpath("//input[starts-with(@name,'p')]")).sendKeys("facebook@gmail.com"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
