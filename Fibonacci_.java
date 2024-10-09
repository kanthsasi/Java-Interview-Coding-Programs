package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Fibonacci_ {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
			int num1=0;
			int num2=1;
			int nextnum;
			System.out.print("Enter The Value:");
			int l_of_s=scan.nextInt();
			for(int i=1;i<=l_of_s;i++) {
				System.out.print(num1+",");
				nextnum=num1+num2;
				num1=num2;
				num2=nextnum;
			}
		
		

	}

}
