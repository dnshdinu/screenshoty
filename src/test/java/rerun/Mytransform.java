package rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Mytransform extends Base implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testmethod) {
		annotation.setRetryAnalyzer(Retry.class);
		
	}

}
