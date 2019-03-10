package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class CucumberHooks extends SeMethods{
	
	@Before
	public void begin(){
		startResult();
		test = startTestCase("Login", "Login to Leaftaps");
		test.assignCategory("smoke");
		test.assignAuthor("Cijo");
		startApp("chrome");
	}
	
	@Before(value = "@sanity")
	public void beginSanity(){
		startResult();
		test = startTestCase("Login", "Login to Leaftaps");
		test.assignCategory("sanity");
		test.assignAuthor("Cijo");
		startApp("chrome");
	}

	@After//(value = "@smoke")
	public void end(){
		closeAllBrowsers();
		endTestcase();
		endResult();
	}
}







