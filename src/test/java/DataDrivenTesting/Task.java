package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws IOException, InterruptedException {
		// step 01: converting physical prop file to java obj
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData1.properties");
		
		//ste[ 02 create an obj of properties
		Properties p= new Properties();
		
		//step 03 Load the prop obj
		p.load(fis);
		
		//step 04 fetch the data
		String url = p.getProperty("url");
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		String time=p.getProperty("timesout");
		Long t=Long.parseLong(time);
		
		//open the selenium
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//type casting
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		
		driver.findElement(By.id("email")).sendKeys(un);
		
		
		
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
