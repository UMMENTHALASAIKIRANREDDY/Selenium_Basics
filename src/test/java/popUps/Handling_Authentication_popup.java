package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Authentication_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//link: https://the-internet.herokuapp.com/basic_auth
		//add the https://admin:admin@the-internet.herokuapp.com/basic_auth
		//username:admin, password: admin
		
		Thread.sleep(3000);
		driver.quit();
	}

}
