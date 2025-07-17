package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		// step 01: converting physical prop file to java obj
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		//ste[ 02 create an obj of properties
		Properties p= new Properties();
		
		//step 03 Load the prop obj
		p.load(fis);
		
		//Add new data
		p.put("Animal", "Ranbir Kapoor");
		
		p.remove("Animal");
		
		p.put("Tiger", "NTR");
		//convert prop obj to physical file and save the file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonData.properties");
		
		p.store(fos, "Updated");

	}

}
