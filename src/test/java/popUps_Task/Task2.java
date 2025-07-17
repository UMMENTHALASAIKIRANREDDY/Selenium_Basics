package popUps_Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {



	public static void main(String[] args) throws IOException {
		

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");

		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String un = p.getProperty("un");
		String psw = p.getProperty("psw");



		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		// navigate to app
		driver.get(url);



		driver.findElement(By.id("name")).sendKeys(un);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);



		//Thread.sleep(3000);



		driver.quit();



	}



}