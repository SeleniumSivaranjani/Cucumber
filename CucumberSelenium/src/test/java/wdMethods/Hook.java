package wdMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends SeMethods{
	
	@Before
	public void before(Scenario sc){
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getName());
		test.assignCategory("Sanity");
		test.assignAuthor("Sivaranjani");
		startApp("chrome");		
	}

	@After
	public void after(){
		closeAllBrowsers();
		endResult();
	}
}