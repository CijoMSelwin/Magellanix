package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class CucumberHooks extends SeMethods{
	

	@And("Start Test Case(.*)")
	public void startTestCases(String UrlDetails) {
		startApp("chrome",false,UrlDetails.trim());  
	}
	
	@Before
	public void begin(){
		startResult();
		test = startTestCase("Coke test cases", "Login to coca cola");
		test.assignCategory("smoke");
		test.assignAuthor("Cijo");
		
	}
	
	@Before(value = "@sanity")
	public void beginSanity(){
		startResult();
		test = startTestCase("Coke test cases", "Login to coca cola");
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








