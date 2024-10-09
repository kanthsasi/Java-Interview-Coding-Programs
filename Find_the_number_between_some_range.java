package INTERVIEW_QUESTIONS;

public class Find_the_number_between_some_range {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count=count+1;
				System.out.println("This are Prime Numbers:"+i);
			}
			
		}
		System.out.println(count);
	}

}
