package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			{
			sum=sum+i;
			}
		}
			if(num==sum) {
				System.out.println("It is a Perfect Number");
			}
			else
			{
				System.out.println("It is not a Perfect Number");
			}
		}

	}


