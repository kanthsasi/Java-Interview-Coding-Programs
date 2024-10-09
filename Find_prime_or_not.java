package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Find_prime_or_not {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("This number is a prime number:"+num);
		}
		else
		{
			System.out.println("This number is not a prime number:"+num);
		}
	}

}
