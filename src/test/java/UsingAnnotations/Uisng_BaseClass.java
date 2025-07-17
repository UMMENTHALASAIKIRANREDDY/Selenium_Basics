package UsingAnnotations;

import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class Uisng_BaseClass extends BaseClass{
	
	@Test
	public void demotest() {
		System.out.println("Test Scenario");
	}
	
	@Test
	public void demotest1() {
		System.out.println("Test scenarios 2");
	}

}
