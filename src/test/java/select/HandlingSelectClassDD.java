package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectClassDD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement DD=driver.findElement(By.id("searchDropdownBox"));
		
		//Create the object for select class
		Select s= new Select(DD);
		
		//select an option by index
		s.selectByIndex(4);
		Thread.sleep(1000);
		
		//select an option by using selectByValue()
		s.selectByValue("search-alias=amazon-devices");
		
		Thread.sleep(1000);
		
		//select an option by using selectByVisibleText()
		s.selectByVisibleText("Amazon Fresh Meat");
		
		//get selected options
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		
		for (WebElement option : selectedoptions) {
			System.out.println(option.getText());
		}
		
		System.out.println();
		
		//get all options in dropdown
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		System.out.println();
		//get the first select option
		WebElement firstSelected=s.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
