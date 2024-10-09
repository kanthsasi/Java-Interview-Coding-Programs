package INTERVIEW_QUESTIONS;

import java.util.Arrays;
import java.util.HashSet;

public class Sort_an_array {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		int[] arr= {95,6,45,3,8,6,73};
		Arrays.sort(arr);
		for(int num:arr)
		{
			set.add(num);
		}
		System.out.println(set);
		

	}

}
