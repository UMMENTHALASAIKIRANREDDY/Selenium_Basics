package TestNG;

import org.testng.annotations.Test;

public class UsingPriorityFlag {

	@Test(priority=2,groups="smoke")
	public void login() {
		System.out.println("login");
		
	}
	
	@Test(priority=1,groups="regression")
	public void register() {
		System.out.println("register");
	}
	
	@Test(priority=3)
	public void create() {
		System.out.println("create");
		
	}
}
