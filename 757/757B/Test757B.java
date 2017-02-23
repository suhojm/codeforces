import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test757B{
	private ArrayList<Integer> s;
	private int expectedResult;
	private Solution757B solution;

	@Before
	public void initialize(){
		solution = new Solution757B();
	}

	public Test757B(ArrayList<Integer> s, int expectedResult){
		this.s = s;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{new ArrayList<>(Arrays.asList(2,3,4)), 2},
			{new ArrayList<>(Arrays.asList(2,3,4,6,7)), 3},
			{new ArrayList<>(Arrays.asList(5,6,4)), 2},
			{new ArrayList<>(Arrays.asList(41,74,4,27,85,39,100,36)), 4},
			{new ArrayList<>(Arrays.asList(89,20,86,81,62,23)), 3},
			{new ArrayList<>(Arrays.asList(1)), 1},
			{new ArrayList<>(Arrays.asList(10,10,6,10,9,1,8,3,5)), 5},
			{new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1)), 1},
			{new ArrayList<>(Arrays.asList(3,6)), 2},
			{new ArrayList<>(Arrays.asList(541,541)), 2}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(s));
	}
}