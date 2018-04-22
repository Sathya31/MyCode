package wdMethods;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{

	@Before
	public void beforeSuite(Scenario sc){
		System.out.println(sc.getName());
		startResult();
		startTestModule("testCaseName", "testDescription");
		test = startTestCase("testNodes");
		test.assignCategory("category");
		test.assignAuthor("authors");
		startApp("chrome");		
	}
	@After
	public void afterSuite(Scenario sc){
		System.out.println(sc.getStatus());
		endResult();
		closeAllBrowsers();
	}
	
}
