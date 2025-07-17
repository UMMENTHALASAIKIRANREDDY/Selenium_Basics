package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterTheText_ClickOnElementUsingJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		WebElement un=driver.findElement(By.id("email"));
		WebElement pswd=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.name("login"));
		
		//pass the text to TF
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", un,"selenium");
		js.executeScript("arguments[0].value=arguments[1]", pswd,"selenium@123");
		
		//click on login button
		js.executeScript("arguments[0].click()", login);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
