import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Test749A{
	private Integer n;
	private String expectedResult;
	private Solution749A solution;

	@Before
	public void intialize(){
		solution = new Solution749A();	
	}

	public Test749A(Integer n, String expectedResult){
		this.n = n;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{5, "2\n2 3"},
			{6, "3\n2 2 2"},
			{2, "1\n2"},
			{3, "1\n3"},
			{7, "3\n2 2 3"},
			{4, "2\n2 2"},
			{8, "4\n2 2 2 2"},
			{9, "4\n2 2 2 3"},
			{10, "5\n2 2 2 2 2"},
			{11, "5\n2 2 2 2 3"},
			{12, "6\n2 2 2 2 2 2"},
			{13, "6\n2 2 2 2 2 3"}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(n));
	}
}