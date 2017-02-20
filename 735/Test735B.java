//importsa
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test735B{
	private Integer n;
	private Integer n1;
	private Integer n2;
	private ArrayList<Integer> a;
	private Double expectedResult;
	private Solution735B solution;

	@Before
	public void initialize(){
		solution = new Solution735B();
	} 

	public Test735B(Integer n, Integer n1, Integer n2, ArrayList<Integer> a, Double expectedResult){
		this.n = n;
		this.n1 = n1;
		this.n2 = n2;
		this.a = a;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{2,1,1, new ArrayList<>(Arrays.asList(1, 5)), 6.0},
			{4,2,1, new ArrayList<>(Arrays.asList(1, 4, 2, 3)), 6.5},
			{3,1,2, new ArrayList<>(Arrays.asList(1, 2, 3)), 4.5},
			{10,4,6, new ArrayList<>(Arrays.asList(3, 5, 7, 9, 12, 25, 67, 69, 83, 96)), 88.91666667},
			{19,7,12, new ArrayList<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 100000, 100000)), 47052.1071429}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(n,n1,n2,a), 0.01);
	}
}