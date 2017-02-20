import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner761B{
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(Test761B.class);

		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}