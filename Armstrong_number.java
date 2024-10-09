package INTERVIEW_QUESTIONS;

public class Armstrong_number {

	public static boolean arms(int num) {
		
		int original=num;
		int temp;
		int check=0;
		
		while(num>0)
		{
			temp=num%10;
			check=check+(temp*temp*temp);
			num=num/10;
		}
		if(original!=num) {
			return false;
		}
	
			return true;
			}

	
public static void main(String args[]) {
	int num=153;
	System.out.println(arms(num));
}
}
