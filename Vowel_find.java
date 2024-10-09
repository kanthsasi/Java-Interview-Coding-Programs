package INTERVIEW_QUESTIONS;

public class Vowel_find {

	public static void main(String[] args) {
		String str="Automation";
		int vowels=0,consonants=0;
		for(char c:str.toCharArray())
		{
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels++;
			}
			else {
				consonants++;
			}
		}
			System.out.println("vowels:"+vowels+",consonants:"+consonants);
		

	}

}
