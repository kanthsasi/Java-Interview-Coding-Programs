package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		int num=scan.nextInt();
		int spaces=num;
		int number=1;
		for(int i=0;i<=num-1;i++) {
			for(int s=1;s<=spaces;s++) {
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+ " ");
				number=number*(i-j)/(1+j);
			}
			spaces--;
			System.out.println();
			
		}
		
	}

}
