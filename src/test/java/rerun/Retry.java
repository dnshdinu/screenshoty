package rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry extends Base implements IRetryAnalyzer {
		int count=0;
		int i=2;
	public boolean retry(ITestResult arg0) {

		if (count<i) {
			count++;
			return true;
		}
		return false;
	}

}
