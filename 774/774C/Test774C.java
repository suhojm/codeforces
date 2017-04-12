import java.util.Collection;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test774C{
	private int n;
	private String expected;
	private Solution774C solution;

	@Before
	public void initialize(){
		solution = new Solution774C();
	}

	public Test774C(int n, String expected){
		this.n = n;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{2,"1"},
			{3,"7"},
			{4,"11"},
			{5,"71"},
			{6,"111"}
		});	
	}

	@Test
	public void testAnswers(){
		assertEquals(expected, solution.getAnswer(n));
	}


}