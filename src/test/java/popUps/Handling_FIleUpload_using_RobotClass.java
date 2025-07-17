package popUps;

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

public class Handling_FIleUpload_using_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select the file and copy the file to clipboard
		StringSelection str=new StringSelection("C:\\Users\\LENOVO\\Downloads\\Vadlapudi Om Prakash (2).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//Navaigate to an webpage
		driver.get("https://admin:admin@the-internet.herokuapp.com/upload");
		
		//Identify choose file button
		WebElement upload=driver.findElement(By.id("file-upload"));
		
		
		//click on choose file button using actions class
		Actions act=new Actions(driver);
		act.moveToElement(upload).click().build().perform();
		
		Thread.sleep(3000);
		
		//paste the file using control+v and click on enter
		Robot r=new Robot();
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
