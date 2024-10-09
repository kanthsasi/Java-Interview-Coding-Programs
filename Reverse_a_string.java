package INTERVIEW_QUESTIONS;
import java.util.Scanner;


public class Reverse_a_string {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter The String:");
		String str=scan.nextLine();
		StringBuilder reversed=new StringBuilder(str).reverse();
		System.out.println(reversed);
		

	}

}
