import java.util.ArrayList;

public class Solution749B{
	public String getOneCoordinate(int x1, int y1, int x2, int y2, int x3, int y3){
		
		return new String((int)(x1 + x2 - x3) + " " + (int)(y1 + y2 - y3));
	}

	public ArrayList<String> getAnswer(int x1, int y1, int x2, int y2, int x3, int y3){
		ArrayList<String> result = new ArrayList<String>();

		result.add(getOneCoordinate(x1,y1,x2,y2,x3,y3));
		result.add(getOneCoordinate(x1,y1,x3,y3,x2,y2));
		result.add(getOneCoordinate(x2,y2,x3,y3,x1,y1));

		return result;
	}
}