import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner749B{
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(Test749B.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}	
}