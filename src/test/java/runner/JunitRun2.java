package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/java/tcsFeatures"},
				 glue={"page","hook"}
//,tags= {
				 )

public class JunitRun2 {
	
	

}





