package chap99_homework.hw231019.middle;

import java.util.Arrays;

public class UseArrayUtility {
	public static void main(String[] args) {
		
		ArrayUtility array = new ArrayUtility();
		
		int source1[] = {1,2,3,4,5};
		double source2[] = {6.8,7.5,8.2,9.0,10.0};
		
		System.out.println("Int -> Double");
		System.out.println(Arrays.toString(array.intToDouble(source1)));
		
		System.out.println("Double -> Int");
		System.out.println(Arrays.toString(array.doubleToInt(source2)));
		
		ArrayUtility.intToDouble(source1);
		
		
	}

}
