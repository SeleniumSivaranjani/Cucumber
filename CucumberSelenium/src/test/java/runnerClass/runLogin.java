package runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, 
glue= {"pages","wdMethods"},dryRun=true, 
strict=true,
//plugin= {"preety","html:target/report"},//target report path
tags= {"@smoke","@sanity"}, monochrome=true)
//monochrome is used to get the perfect time taken for execution
//features and glue are tags.
//tags is similar to groups
//dryRun is to check if any steps are not mapped 
//strict is used to fail the test case even if one step is failed.
//plugin is to generate the html report in cucumber.If step level definition is not needed use "preety".
public class runLogin {
	
}
