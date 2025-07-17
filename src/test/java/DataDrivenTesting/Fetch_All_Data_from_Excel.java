package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Fetch_All_Data_from_Excel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/Book.xlsx");
		
		//creating a workbook
		Workbook wb= WorkbookFactory.create(fis);
		
		//Fetch the sheet
		Sheet sh = wb.getSheet("Data");
		
		Row r=sh.getRow(1);
		
		Cell c=r.getCell(0);
		
		String data=c.getStringCellValue();
		
		System.out.println(data);
		
		
		

	}

}
