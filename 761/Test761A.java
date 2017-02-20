import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

// using parameterized junit test for different value of inputs
@RunWith(Parameterized.class)
public class Test761A{
	private Integer a;
	private Integer b;
	private String expectedResult;
	private Solution761A solution;

	@Before
	public void initialize(){
		solution = new Solution761A();
	}

	public Test761A(Integer a, Integer b, String expectedResult){
		this.a = a;
		this.b = b;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][] {
			{2,3,"YES"},
			{3,1,"NO"},
			{5,4,"YES"},
			{9,9,"YES"},
			{85,95,"NO"},
			{0,1,"YES"},
			{100,99,"YES"},
			{0,0,"NO"}
		});
	}

	@Test
	public void testAnswer(){
		assertEquals(expectedResult, solution.getAnswer(a,b));
	}
}