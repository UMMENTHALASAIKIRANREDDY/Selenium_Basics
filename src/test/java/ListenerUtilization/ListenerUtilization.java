package ListenerUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

//@Listeners(ListenersUtility.Listeners.class)
public class ListenerUtilization extends BaseClass {

	@Test
	public void demo() {
		System.out.println("scenario");
	}

}
