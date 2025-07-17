package BaseClassUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void bs() {
		System.out.println("BS-Connetcion with database");
	}
	@AfterSuite
	public void as() {
		System.out.println("AS-Close the connection with the data base");
	}
	@BeforeTest
	public void bt() {
		System.out.println("BT-Paralle Execution");
	}
	@AfterTest
	public void at() {
		System.out.println("At-closing Parallel execution");
	}
	@BeforeClass
	public void bc() {
		System.out.println("BC-launching the browser");
	}
	@AfterClass()
	public void ac() {
		System.out.println("AC-closing the browser");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("BM-loggin");
	}
	@AfterMethod
	public void am() {
		System.out.println("AM-logout");
	}

}
