package rerun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass extends Base {

	@BeforeMethod
 public void initialization() {
	launch("https://www.google.com/");
}
 	@AfterMethod
 	
 	public void teardown() {
	driver.close();
}
 	@Test            //(retryAnalyzer=Retry.class)         // -----test method
 	public void test() {
	assertEquals(false, true);

	}
 
}
