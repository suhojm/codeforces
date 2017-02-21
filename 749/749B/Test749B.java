import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test749B{
	private Integer x1;
	private Integer y1;
	private Integer x2;
	private Integer y2;
	private Integer x3;
	private Integer y3;
	private ArrayList<String> expectedResult;
	private Solution749B solution;

	@Before
	public void initialize(){
		solution = new Solution749B();
	}

	// constructor
	public Test749B(Integer x1, Integer y1, 
				   Integer x2, Integer y2, 
				   Integer x3, Integer y3, 
				   ArrayList<String> expectedResult){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{0,0,1,0,0,1, new ArrayList<>(Arrays.asList("1 1", "-1 1", "1 -1"))},
			{0,-1,-1,0,1,1, new ArrayList<>(Arrays.asList("-2 -2", "2 0", "0 2"))},
			{-1,-1,0,1,1,1, new ArrayList<>(Arrays.asList("2 3", "0 -1", "-2 -1"))},
			{1000,1000,-1000,-1000,-1000,1000, new ArrayList<>(Arrays.asList("-3000 -1000", "1000 3000", "1000 -1000"))},
			{-4,-5,7,10,3,-10, new ArrayList<>(Arrays.asList("14 5", "-8 -25", "0 15"))},
			{-114,-28,532,573,766,931, new ArrayList<>(Arrays.asList("1412 1532", "120 330", "-348 -386"))},
			{-6,2,-10,-7,9,-6, new ArrayList<>(Arrays.asList("5 -15", "13 3", "-25 1"))},
			{1,-1,1,7,2,9, new ArrayList<>(Arrays.asList("2 17", "2 1", "0 -3"))},
			{1000,-1000,1000,1000,-1000,0, new ArrayList<>(Arrays.asList("-1000 2000", "-1000 -2000", "3000 0"))},
			{-1000,1000,1000,-1000,0,1, new ArrayList<>(Arrays.asList("2000 -1999", "-2000 2001", "0 -1"))}
		});
	}

	@Test
	public void testAnswers(){
		ArrayList<String> answer = solution.getAnswer(x1, y1, x2, y2, x3, y3);
		Collections.sort(answer);
		Collections.sort(expectedResult);
		assertEquals(3, answer.size());
		for(int i = 0; i < 3; ++i){
			assertEquals(expectedResult.get(i), answer.get(i));
		}
	}
}