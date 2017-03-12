import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test764A{
	private int n;
	private int m;
	private int z;
	private Solution764A solution;
	private int expectedResult;

	@Before
	public void initialize(){
		solution = new Solution764A();
	}

	public Test764A(int n, int m, int z, int expectedResult){
		this.n = n;
		this.m = m;
		this.z = z;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{1,1,10,10},
			{1,2,5,2},
			{2,3,9,1},
			{4,8,9,1},
			{7,9,2,0},
			{24,22,9235,34},
			{74,8,417,1},
			{972,1,203,0},
			{33,6,3005,45},
			{1,2,10,5},
			{5,1,20,4},
			{8,12,12,0},
			{10,20,10000,500}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(n,m,z));
	}
}