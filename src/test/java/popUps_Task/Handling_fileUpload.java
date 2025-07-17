package popUps_Task;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_fileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload");
		
		//driver.findElement(By.id("resume")).sendKeys("C:\\Users\\psubb\\OneDrive\\Desktop\\html.txt");
		
		
//		select the file and copy the file to clipboard
		
		StringSelection str= new StringSelection("C:\\Users\\LENOVO\\OneDrive\\Desktop\\dddd.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
//		identify the choose file button k
		WebElement upload=driver.findElement(By.id("resume"));
		   
//		   click on choose file button using action class
		   
		   Actions act =new Actions(driver);
		   
		   act.moveToElement(upload).click(upload).build().perform();
		   
		   Thread.sleep(3000);
		
//paste the file using control +v and click on enter
		   
		   Robot r= new Robot();
		   
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_V);
		   
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_V);
		   
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		   
		   Thread.sleep(3000);
		   
		   driver.quit();
	}

}
