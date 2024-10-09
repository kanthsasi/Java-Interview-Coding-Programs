package INTERVIEW_QUESTIONS;

public class Find_the_Missing_number_in_a_array {

	public static void main(String[] args) {
		int[] num= {101,102,103,105};
		int l=num.length;
		int sum1=0,sum2=0;
		for(int i=101;i<=105;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		for(int i=0;i<l;i++) {
			sum2=sum2+num[i];
		}
		System.out.println(sum2);
		int m=sum1-sum2;
		System.out.println(m);
		

	}

}
