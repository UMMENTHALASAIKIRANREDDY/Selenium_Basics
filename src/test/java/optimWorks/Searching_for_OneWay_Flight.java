package optimWorks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Searching_for_OneWay_Flight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		
		//------------------Step 1---------------------------------------------

		
		//removing the login 
		driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
		
		//click on from
		driver.findElement(By.xpath("(//p[@class=\"sc-12foipm-6 erPfRs\"])[1]")).click();
		
		//enter the data
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("DEL");
		
		//submit
		driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']")).click();
		
		//enter the 'to'
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HYD");
		
		//submit
		driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
		
		//select the departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//select the date
		driver.findElement(By.xpath("//div[@aria-label=\"Wed Jul 16 2025\"]")).click();
		
		//select the adult section
		driver.findElement(By.xpath("//p[text()='1 Adult']")).click();
		
		//choose 2 adults, 1 child
		driver.findElement(By.xpath("(//span[@class=\"sc-12foipm-51 kZvHQU\"])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"sc-12foipm-51 kZvHQU\"])[4]")).click();
		
		// submit teh adult section
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
		//click on 'search flights'
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
			
		//-------------------Step 1 Completed -----------------------------------------
		
		//-------------------Step 2 ---------------------------------------------------
		
		//handling the "compare"
		driver.findElement(By.xpath("//span[text()='GOT IT']")).click();
		//selecting the departure.
		driver.findElement(By.xpath("(//div[text()=\"After 6 pm\"])[1]")).click();//only option provided in departure time are "After 6 pm & 12pm-6pm
		
		//selecting "air india" "indigo" 
		driver.findElement(By.xpath("(//p[text()=' IndiGo   '])[1]")).click();
		driver.findElement(By.xpath("(//p[text()=' Air India   '])[1]")).click();
		
		//Thread.sleep(3000);
		
		//driver.quit();

	}

}
