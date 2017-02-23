import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestGetMax758A{
	private ArrayList<Integer> a;
	private int expectedMax;
	private Solution758A solution;

	@Before
	public void intialize(){
		solution = new Solution758A();
	}

	public TestGetMax758A(ArrayList<Integer> a, int expectedMax){
		this.a = a;
		this.expectedMax = expectedMax;
	}

	@Parameterized.Parameters
	public static Collection maxAnswers(){
		return Arrays.asList(new Object[][]{
			{new ArrayList<>(Arrays.asList(0,1,2,3,4)), 4},
			{new ArrayList<>(Arrays.asList(1,1,0,1,1)), 1},
			{new ArrayList<>(Arrays.asList(1,3,1)), 3},
			{new ArrayList<>(Arrays.asList(32576, 550340)), 550340},
			{new ArrayList<>(Arrays.asList(910648, 542843, 537125)), 910648},
			{new ArrayList<>(Arrays.asList(751720, 572344, 569387, 893618)), 893618}
		});
	}

	@Test
	public void testGetMax(){
		System.out.println("getMax Test");
		assertEquals(expectedMax, solution.getMax(a)); 
	}
}
