package TestNG_task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBook {
	@Parameters("browser")
	@Test(groups="smoke")
	public void login(String BROWSER) throws InterruptedException {
 
		// Launch the browser
		WebDriver driver= null;
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();	
		}else if(BROWSER.equals("edge")) {
			driver= new EdgeDriver();
		}else {
			System.out.println("unable to launch");
		}

		// Maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to app
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.quit();
		
		Reporter.log("Facebook Opened Successfully",true);

	}


}
