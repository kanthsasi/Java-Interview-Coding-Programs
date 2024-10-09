package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Count_the_spaces_in_a_given_sentences {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		int spacecount=arr.length;
		System.out.println(spacecount);
		
	}

}
