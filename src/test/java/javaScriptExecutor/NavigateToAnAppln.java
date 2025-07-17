package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToAnAppln {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://www.facebook.com/";
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", url);
		
		Thread.sleep(3000);
		
		//Fetch the url and title
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		
		Thread.sleep(2000);
		
		//Refresh the webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		driver.quit();

	}

}
