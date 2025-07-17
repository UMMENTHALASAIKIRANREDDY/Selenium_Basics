package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_Action_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		search.sendKeys("selenium");
		
		Thread.sleep(3000);
		
		search.clear();
		
		Thread.sleep(3000);
		
		search.sendKeys("mobiles");
		
		Thread.sleep(3000);
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Advanced search']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
