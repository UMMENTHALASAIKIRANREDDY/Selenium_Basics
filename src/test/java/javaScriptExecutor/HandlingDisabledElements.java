package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDisabledElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/sample.html");
		
		WebElement un_TF=driver.findElement(By.id("user"));
		
		//Handling Disabled TF
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", un_TF,"selenium" );
		
		//Handling disable Button
		WebElement cancel=driver.findElement(By.id("cancel"));
		js.executeScript("arguments[0].disabled=false", cancel);
		cancel.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
