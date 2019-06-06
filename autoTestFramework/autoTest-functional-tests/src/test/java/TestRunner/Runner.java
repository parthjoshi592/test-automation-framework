package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Personal\\Automation\\autoTestFramework\\autoTest-functional-tests\\src\\main\\resources\\Features",glue={"StepDefinitions"})
public class Runner
{

}