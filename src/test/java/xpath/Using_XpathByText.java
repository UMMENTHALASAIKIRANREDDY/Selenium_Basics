package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByText {

	public static void main(String[] args) throws InterruptedException {
		//Lauch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximuize the window
		driver.manage().window().maximize();
		
		//navigate to website
		driver.get("https://www.flipkart.com/");
		
		//identify the TF using Xpath by Attribute because input won't have 'text' for implemented Xpath 
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobile"+Keys.ENTER);
		
		Thread.sleep(3000);
		//identify the "Popularity" using X-path by Text'
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Nokia 130 Music Dual Sim, Music Player, Wireless FM Radio and Dedicated Music Buttons']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
