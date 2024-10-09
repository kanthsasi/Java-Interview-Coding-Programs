package INTERVIEW_QUESTIONS;

public class Palindrome_find {

	public static void main(String[] args) {
		String str="nun";
		String reversed=new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed));
	}

}
