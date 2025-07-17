package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectClassDD2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		WebElement DD=driver.findElement(By.id("select-multiple-native"));
		
		//Create the object for select class
		Select s= new Select(DD);
		
		//select an option by index
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		//select an option by using selectByValue()
		s.selectByValue("Mens Cotton Jacket");
		
		Thread.sleep(1000);
		
		//select an option by using selectByVisibleText()
		s.selectByVisibleText("BIYLACLESEN Women's ...");
		
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		System.out.println();
		
		//select all options in dropdown
		List<WebElement> Alloptions = s.getOptions();
		for(WebElement option:Alloptions) {
			System.out.println(option.getText());
		}
		System.out.println();
		
		//print "first selected option"
		WebElement firstSelected=s.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		//deselect the option by index
		s.deselectByIndex(1);
		
		//deselect by value
		s.deselectByValue("Mens Casual Slim Fit");
		
		//deselect by Visible Text
		s.deselectByVisibleText("BIYLACLESEN Women's ...");
		
		Thread.sleep(3000);
		
		
		
		driver.quit();

	}

}
