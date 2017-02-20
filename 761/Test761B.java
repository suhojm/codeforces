import java.util.ArrayList; // since using ArrayList for solution and input

import java.util.Arrays;
import java.util.Collection; // Arrays and Collections for returning parameters

import org.junit.Test; // for testing
import org.junit.Before; // for initialization of solution class

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith; // have to import this for run with Suite.class or Parameterized.class
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test761B{
	private Integer n;
	private Integer l;
	private ArrayList<Integer> s;
	private ArrayList<Integer> k;
	private String expectedResult;
	private Solution761B solution;

	// run before test .. intialization of the solution class
	@Before
	public void initialize(){
		solution = new Solution761B();
	}

	// constructor
	public Test761B(Integer n, Integer l, ArrayList<Integer> s, ArrayList<Integer> k, String expectedResult){
		this.n = n;
		this.l = l;
		this.s = s;
		this.k = k;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][] {
			{3,8,new ArrayList<>(Arrays.asList(2,4,6)), 
				new ArrayList<>(Arrays.asList(1,5,7)),"YES"},
			{4,9,new ArrayList<>(Arrays.asList(2,3,5,8)),
				new ArrayList<>(Arrays.asList(0,1,3,6)),"YES"},
			{2,4,new ArrayList<>(Arrays.asList(1,3)), 
				new ArrayList<>(Arrays.asList(1,2)),"NO"},
			{5,60,new ArrayList<>(Arrays.asList(7,26,27,40,59)), 
				new ArrayList<>(Arrays.asList(14,22,41,42,55)), "YES"},
			{35,41,new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,9,10,11,12,13,14,18,19,20,21,22,23,24,25,26,28,30,31,32,33,34,35,36,37,38,39,40)),
				new ArrayList<>(Arrays.asList(0,1, 2, 3, 4, 5, 7, 8, 9, 10,11, 12, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40)),"YES"},
			{40,63,new ArrayList<>(Arrays.asList(0, 2, 3, 4, 5, 6, 9, 10, 12, 15, 17, 19, 23, 25, 26, 27, 28, 29, 30, 31, 33, 34, 36, 37, 38, 39, 40, 43, 45, 49, 50, 52, 53, 54, 55, 57, 58, 60, 61, 62)), 
				new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 8, 10, 14, 15, 17, 18, 19, 20, 22, 23, 25, 26, 27, 28, 30, 31, 32, 33, 34, 37, 38, 40, 43, 46, 47, 51, 53, 54, 55, 56, 57, 58, 59, 61, 62)), "NO"},
			{5,10,new ArrayList<>(Arrays.asList(0,1,3,5,7)), 
				new ArrayList<>(Arrays.asList(0,1,2,4,7)), "NO"},
			{5,8,new ArrayList<>(Arrays.asList(0,2,4,6,7)),
				new ArrayList<>(Arrays.asList(0,2,3,5,7)), "NO"}
		});
	}

	@Test
	public void testAnswer(){
		assertEquals(expectedResult, solution.getAnswer(n,l,s,k));
	}
}