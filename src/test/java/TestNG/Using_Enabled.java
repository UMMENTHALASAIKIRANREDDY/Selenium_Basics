package TestNG;

import org.testng.annotations.Test;

public class Using_Enabled {

	@Test(invocationCount = 1,priority=2,groups="smoke")
	public void login() {
		System.out.println("login");
	}
	@Test(invocationCount = 1,priority=1,groups="regression")
	public void register() {
		System.out.println("register");
	}
	@Test(invocationCount = 2,priority=3,enabled=true)
	public void create() {
		System.out.println("create");
	}
}
