package runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/DeleteLead.feature"}, glue= {"pages", "wdMethods"},monochrome=true)
//monochrome is used to get the perfect time taken for execution
//features and glue are tags.

public class runCreateLead {
	
}
