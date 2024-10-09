package INTERVIEW_QUESTIONS;

public class Reverse_a_number {

	public static void main(String[] args) {
		int a=12345;
		int reveresed=0;
		while(a!=0) {
			reveresed=reveresed*10+a%10;
			a/=10;
		}
		System.out.println(reveresed);
		

	}

}
