package practice_tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AjioSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//mouse hover on tab
		Actions act = new Actions(driver);
		//
		WebElement hoverElement=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		act.moveToElement(hoverElement).perform();
		
		WebElement hoverElement1=driver.findElement(By.xpath("//a[text()=\"Men's Casual Shirts\"]"));
		act.click(hoverElement1).perform();
		WebElement dd1 = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		WebElement dd2 = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
		//dropdown
		Select DD1=new Select(dd1);
		Select DD2=new Select(dd2);
		DD2.selectByIndex(3);
		DD1.selectByIndex(1);
		
		WebElement product1=driver.findElement(By.xpath("//div[text()='Newest First']"));
		product1.click();
	
		//Thread.sleep(3000);
		
		WebElement product=driver.findElement(By.xpath("//div[text()='₹288']"));
		System.out.println(product.getText());
		
		driver.quit();
		
		

	}

}
