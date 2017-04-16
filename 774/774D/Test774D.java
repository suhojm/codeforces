import java.util.Arrays;
import java.util.Collection;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test774D{
	private int n;
	private int l;
	private int r;
	private ArrayList<Integer> a;
	private ArrayList<Integer> b;
	private String expected;
	private Solution774D solution;

	@Before
	public void initialize(){
		solution = new Solution774D();
	}

	public Test774D(int n, int l, int r, ArrayList<Integer> a, ArrayList<Integer> b, String expected){
		this.n = n;
		this.l = l;
		this.r = r;
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{5,2,4,new ArrayList<>(Arrays.asList(3,4,2,3,1)), new ArrayList<>(Arrays.asList(3,2,3,4,1)),"TRUTH"},
			{3,1,2,new ArrayList<>(Arrays.asList(1,2,3)), new ArrayList<>(Arrays.asList(3,1,2)),"LIE"},
			{4,2,4,new ArrayList<>(Arrays.asList(1,1,1,1)), new ArrayList<>(Arrays.asList(1,1,1,1)),"TRUTH"},
			{5,1,3,new ArrayList<>(Arrays.asList(2,2,2,1,2)), new ArrayList<>(Arrays.asList(2,2,2,1,2)),"TRUTH"},
			{7,1,4,new ArrayList<>(Arrays.asList(2,5,5,4,3,4)), new ArrayList<>(Arrays.asList(2,5,5,4,3,4)),"TRUTH"},
			{10,1,10,new ArrayList<>(Arrays.asList(6,7,6,1,10,10,9,5,3,9)), new ArrayList<>(Arrays.asList(7,10,9,6,1,5,9,3,10,6)),"TRUTH"},
			{8,3,6,new ArrayList<>(Arrays.asList(5,3,1,1,1,1,3,5)), new ArrayList<>(Arrays.asList(3,3,1,1,1,1,5,5)),"LIE"}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expected, solution.getAnswer(n,l,r,a,b));
	}
}