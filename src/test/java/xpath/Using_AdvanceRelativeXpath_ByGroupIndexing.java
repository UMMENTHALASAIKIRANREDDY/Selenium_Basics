package xpath;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_AdvanceRelativeXpath_ByGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		//Lauch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximuize the window
		driver.manage().window().maximize();
		
		//navigate to website
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(3000);
		//identify the TF using Xpath by Attribute because input won't have 'text' for implemented Xpath 
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("selenium");
		
		Thread.sleep(3000);
		//identify the "Popularity" using X-path by Text'
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("selenium@gmail.com");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("12345678");
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
