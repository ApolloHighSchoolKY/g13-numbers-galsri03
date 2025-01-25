//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		out.println(test);
		out.println("odd count = " + test.countOdds());
		out.println("even count = " + test.countEvens());
		out.println("perfect count = " + test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test2 = new NumberAnalyzer("1 7 852 912 655 43 5 11 57");
		out.println(test2);
		out.println("odd count = " + test2.countOdds());
		out.println("even count = " + test2.countEvens());
		out.println("perfect count = " + test2.countPerfects());
	}
}