import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test757A{
	private String s;
	private int expectedResult;
	private Solution757A solution;

	@Before
	public void initialize(){
		solution = new Solution757A();
	}

	public Test757A(String s, int expectedResult){
		this.s = s;
		this.expectedResult = expectedResult;
	}	

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{"Bulbbasaur", 1},
			{"F", 0},
			{"aBddulbasaurrgndgbualdBdsagaurrgndbb", 2},
			{"BBBBBBBuuuuuuuullllllllllllbbbbaaaaaassssssssssssssssaaaaauuuuuuuuuuuuurrrrrrrrrrrrrrrr", 4},
			{"BBuullbbaassaarr", 1},
			{"BulbasauBulbasauBulbasauBulbasauBulbasauBulbasauBulbasauBulbasau", 0},
			{"BBuuuullbbbbbbbbbbbbbbbaassrr", 1},
			{"Blbasaur", 0}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(s));
	}
}