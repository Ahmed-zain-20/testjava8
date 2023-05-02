package testJava8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestFunctionalProgramming {
	
	public static void main(String[] args) {
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
//		  Predicate<String> stringLen  = (s)-> s.length() < 10;
//	        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");
	}


}
