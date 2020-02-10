package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
  static WebDriver driver;
  public void launch(String url) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\screenshot\\driver\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get(url);
	  }
	public void failure(String name) {
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(source,new File("C:\\Users\\Dineshkumar\\eclipse-workspace\\screenshot\\screenshots"+name +".jpg"));
	} catch (IOException e) {

		e.printStackTrace();
	}
		
		
	}
	
}
