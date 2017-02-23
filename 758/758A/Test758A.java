import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test758A{
	private ArrayList<Integer> a;
	private int expectedResult;
	private Solution758A solution;

	@Before
	public void initialize(){
		solution = new Solution758A();
	}

	public Test758A(ArrayList<Integer> a, int expectedResult){
		this.a = a;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{new ArrayList<>(Arrays.asList(0,1,2,3,4)), 10},
			{new ArrayList<>(Arrays.asList(1,1,0,1,1)), 1},
			{new ArrayList<>(Arrays.asList(1,3,1)), 4},
			{new ArrayList<>(Arrays.asList(228503)), 0},
			{new ArrayList<>(Arrays.asList(842556, 216391, 427181, 626688, 775504, 168309, 851038, 
										448402, 880826, 73697, 593338, 519033, 135115, 20128, 424606, 
										939484, 846242, 756907, 377058, 241543, 29353)), 9535765},
			{new ArrayList<>(Arrays.asList(32576, 550340)), 517764},
			{new ArrayList<>(Arrays.asList(910648, 542843, 537125)), 741328},
			{new ArrayList<>(Arrays.asList(751720, 572344, 569387, 893618)), 787403},
			{new ArrayList<>(Arrays.asList(433864, 631347, 597596, 794426, 713555, 231193)), 1364575}
		});
	}

	@Test
	public void testAnswer(){
		System.out.println("getAnswer Test");
		assertEquals(expectedResult, solution.getAnswer(a));
	}
}