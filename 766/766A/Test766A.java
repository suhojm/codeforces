import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test766A{
	private String a;
	private String b;
	private int expectedResult;
	private Solution766A solution;

	@Before 
	public void initialize(){
		solution = new Solution766A();
	}

	public Test766A(String a, String b, int expectedResult){
		this.a = a;
		this.b = b;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{"abcd", "efghi", 5},
			{"a", "a", -1},
			{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaacccccccccccccccccccccccccccccccccccccccccccccccccc", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddddddd", 100},
			{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbbb", 99},
			{"abcde", "fghij", 5},
			{"abc", null, 3},
			{"abcde", "abcdf", 5},
			{"ab", "c", 2},
			{"ab", "abcd", 4}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(a, b));
	}


}