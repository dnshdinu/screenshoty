package rerun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\screenshot\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	

}
