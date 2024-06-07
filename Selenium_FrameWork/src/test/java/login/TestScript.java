package login;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ListenersUtility;

@Listeners(ListenersUtility.class)
public class TestScript extends BaseClass
{
	@Test
	public void execute()
	{
		Reporter.log("webpage launched",true);
	}

}
