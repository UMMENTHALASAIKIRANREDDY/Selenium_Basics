package TestNG;

import org.testng.annotations.Test;

public class Using_DependsOnMethod {
	
	@Test(invocationCount = 1,groups="smoke")
	public void login() {
		System.out.println("login");
	}
	@Test(invocationCount = 1,priority=1,groups="regression")
	public void register() {
		System.out.println("register");
	}
	@Test(invocationCount = 2,dependsOnMethods ="login")
	public void create() {
		System.out.println("create");
	}

}
