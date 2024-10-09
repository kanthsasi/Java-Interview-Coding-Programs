package INTERVIEW_QUESTIONS;

public class Pramid_ {
	private static void printpramid(int rows) {
		for(int i=1;i<=rows;i++) 
		{
			int numberofWhitespaces =rows-1;
			printString(" ",numberofWhitespaces);
			printString("* ",i);
			System.out.println("");
		}
	}

	private static void printString(String string, int numberofWhitespaces) {
		// TODO Auto-generated method stub
		
	}

}
