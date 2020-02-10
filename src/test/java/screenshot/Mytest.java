package screenshot;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Customlistener.class)
public class Mytest extends Base {
	@BeforeMethod
	public void initilization() {
   	  launch("https://www.google.com/");	

	}
	public void teardown() {
		driver.close();

	}
	@Test
	public void test() {
		assertEquals(false, true);

	}

	@Test
	public void test1() {
		assertEquals(false, true);
	}
}
