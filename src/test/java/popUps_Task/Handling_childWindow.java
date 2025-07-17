package popUps_Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Handling_childWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		//launch the browser
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
//		maximize the window 
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
//		navigate to an appln
		
		driver.get("https://shoppersstack.com/");
		
		
//		crate a object of action class
		
		Actions act =new Actions(driver);
		
//		identify the men click on it
		
		  WebElement kidsMenu = driver.findElement(By.xpath("//a[text()='Kids']"));
	        act.moveToElement(kidsMenu).perform();
	        
	        Thread.sleep(3000);
	        
//	        click on t-shirts
	        
	        driver.findElement(By.xpath("//a[@href=\"/sub-category/girls-top\"]")).click();
	        //driver.navigate().refresh();
	        
//	        click on first element
	        
	        Thread.sleep(3000);
	        
	        WebElement empty=driver.findElement(By.xpath("//a[text()='girls top']"));
	        act.moveToElement(empty).perform();
	        
	         WebElement card = driver.findElement(By.xpath("//span[contains(text(),'apple group ')]"));
	         act.moveToElement(card).click().build().perform();
	        
	        Thread.sleep(3000);
	        
	        //get the parent window id
	        String pwid = driver.getWindowHandle();
	        
//	        click on  description
	        
	        
	        driver.findElement(By.xpath("//*[name()='svg'][@data-testid=\"InfoOutlinedIcon\"]")).click();
	        
	        Set<String> wids = driver.getWindowHandles();
	        for(String s:wids) {
	        	driver.switchTo().window(s);
	        	String url=driver.getCurrentUrl();
	        	
	        	if(url.contains("https://www.amazon.in/")) {
	        		break;
	        	}
	        }
	        
	        driver.manage().window().maximize();
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File src=ts.getScreenshotAs(OutputType.FILE);
	        
	        FileHandler.copy(src, new File("C:\\Users\\LENOVO\\eclipse-workspace\\selenium_basic\\ScreenShot\\s3.png"));
	    
	        
	        Thread.sleep(3000);
	        
	        driver.switchTo().window(pwid);
	        
	        Thread.sleep(3000);
	        
	        driver.quit();
		
		//driver.quit();
		

	}

}
