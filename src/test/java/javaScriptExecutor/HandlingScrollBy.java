package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBy {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//Using hardcoded co-ordinates
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
		
		//Scroll the webpage using Element coordinates
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile"+Keys.ENTER);
		
		WebElement camera=driver.findElement(By.xpath("//span[text()='Camera Modes']"));
		
		int x_axis = camera.getLocation().x;
		int y_axis = camera.getLocation().y;
		
		js.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
		
		//Scroll the Webpage using element reference
		js.executeScript("arguments[0].scrollIntoView(true)", camera);
		
		//Scroll till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		Thread.sleep(3000);
		//Scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
