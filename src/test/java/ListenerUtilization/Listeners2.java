package ListenerUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseClassUtility.BaseClass;

//@Listeners(ListenersUtility.Listeners.class)
public class Listeners2 extends BaseClass {

	@Test
	public void demo1() {
		System.out.println("scenario");
	}

}
