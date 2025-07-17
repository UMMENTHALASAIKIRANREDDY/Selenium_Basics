package webElements;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Point;

public class Using_Getter_Methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement login_link = driver.findElement(By.xpath("//a[@href='/login']"));
		
		//fetch the text from tag
		String text=login_link.getText();
		System.out.println("text is : "+text);
		
		//fetch the tag name 
		String tagname=login_link.getTagName();
		System.out.println("tag name: "+tagname);
		
		//fetch the attribute value from tag
		String attri=login_link.getAttribute("class");
		System.out.println("attribute of tag: "+attri);
		
		//geting the size of the element
		Dimension size = login_link.getSize();
		System.out.println("size: "+size);
		System.out.println("width: "+size.width);
		System.out.println("height: "+size.height);
		
		//getting the position/location of element 
		org.openqa.selenium.Point loc=login_link.getLocation();
		System.out.println("location: "+loc);
		System.out.println("X-Axis: "+loc.x);
		System.out.println("Y-axis: "+loc.y);
		
		//getting the position and size at a time
		Rectangle rect = login_link.getRect();
		System.out.println("width: "+rect.height);
		System.out.println("height: "+rect.width);
		System.out.println("x-axis: "+rect.x);
		System.out.println("y-axis: "+rect.y);
		
		
		//getting the css value by css name of the element
		String css = login_link.getCssValue("padding-left");
		System.out.println(css);
		
		
		driver.quit();
		

	}

}
