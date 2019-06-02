package testrunner;

import junit.*;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
features="D:\\PracticingSelenium\\cucumbertesting\\src\\main\\java\\feature\\testing.feature",
glue= {"stepdefinations"}
//format= {"pretty","html:test-output"}
)


public class TestRunner_CLS {

}
