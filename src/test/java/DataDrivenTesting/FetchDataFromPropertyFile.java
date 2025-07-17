package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		// step 01: converting physical prop file to java obj
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		//ste[ 02 create an obj of properties
		Properties p= new Properties();
		
		//step 03 Load the prop obj
		p.load(fis);
		
		//step 04 fetch the data
		String browser = p.getProperty("browser");
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		String time=p.getProperty("timesout");
		
		System.out.println(browser+"->"+url+"->"+un+"->"+pwd+"->"+time);
		
		

	}

}
