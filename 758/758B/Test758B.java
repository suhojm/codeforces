import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test758B{
	private String s;
	private String expectedResult;
	private Solution758B solution;

	@Before
	public void initialize(){
		solution = new Solution758B();
	}

	public Test758B(String s, String expectedResult){
		this.s = s;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection answers(){
		return Arrays.asList(new Object[][]{
			{"RYBGRYBGR", "0 0 0 0"},
			{"!RGYB", "0 1 0 0"},
			{"!!!!YGRB", "1 1 1 1"},
			{"!GB!RG!Y!", "2 1 1 0"},
			{"RYBG", "0 0 0 0"},
			{"!Y!!!Y!!G!!!G!!B!!R!!!!B!!!!!Y!!G!R!!!!!!!!!!!!B!!!!GY!B!!!!!YR!G!!!!!!B!Y!B!!!!!!R!G!!!!!!!G!R!!!!B", "20 18 19 18"},
			{"!R!GBRYG!RYGB!!G!!YG!!Y!!", "3 5 2 1"},
			{"RBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGYRBGY", "0 0 0 0"},
			{"GYRB!", "0 0 0 1"},
			{"!B!!!B!!!B!!!B!!!B!!!B!G!B!!!B!!!B!!!B!!!B!!!B!!!BR!!B!!!B!!!B!!!B!!!B!!YB!!!B!!!B!!!B!!!B!!!B!!!B!!", "24 0 24 24"},
			{"!!!!!R!!!!G!!!!B!!!!!!!!Y!!!!!!!!!", "8 7 8 7"},
			{"!!!!!!!!R!!!!!!!!B!!!!!!!!G!!!!!!!!Y!!!!!!!!", "10 10 10 10"}
		});
	}

	@Test
	public void testAnswers(){
		assertEquals(expectedResult, solution.getAnswer(s));
	}
}