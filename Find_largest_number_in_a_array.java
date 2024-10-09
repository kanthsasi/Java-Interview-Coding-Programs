package INTERVIEW_QUESTIONS;

import java.util.Arrays;

public class Find_largest_number_in_a_array {

	public static void main(String[] args) {
		int[] arr= {1,2,111,34,45,67,89,99,678};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		//int max=Arrays.stream(arr).max().getAsInt();
		//System.out.println(Arrays.toString(arr));
		//System.out.println(max);
	}

}
