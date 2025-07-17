package TestNG_task;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipKart {
	
	//fetching browser from xml file
	@Parameters("browser")
	//the above browser will pass the value to BROWSER
	@Test
	public void login(String BROWSER) throws InterruptedException {

		// Launch the browser
		WebDriver driver = null;
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("unable to launch");
		}

		// Maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to application
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.quit();

		Reporter.log("FlipKart Opened Successfully", true);

	}

}
