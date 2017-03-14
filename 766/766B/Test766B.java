import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test766B{
	private ArrayList<Integer> a;
	private String expected;
	private Solution766B solution;

	@Before
	public void initialize(){
		solution = new Solution766B();
	}

	public Test766B(ArrayList<Integer> a, String expected){
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{new ArrayList<>(Arrays.asList(1,5,3,2,4)), "YES"},
			{new ArrayList<>(Arrays.asList(4,1,2)), "NO"},
			{new ArrayList<>(Arrays.asList(1,100000000,100000000,100000000,100000000)), "YES"},
			{new ArrayList<>(Arrays.asList(1,10000000,1)), "NO"},
			{new ArrayList<>(Arrays.asList(1,10,100,1000,10000,100000,1000000)), "NO"},
			{new ArrayList<>(Arrays.asList(2,3,4,10,20)), "YES"},
			{new ArrayList<>(Arrays.asList(18,23,40,80,160,161)), "YES"},
			{new ArrayList<>(Arrays.asList(1,1,2,3)), "NO"}
		});
	}

	@Test
	public void testAnswer(){
		assertEquals(expected, solution.getAnswer(a));
	}
}