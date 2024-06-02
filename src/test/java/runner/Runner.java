package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuresfiles", glue=
{"stepDefinition"},tags = "@login")
public class Runner {

	
	
	
}
