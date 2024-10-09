package INTERVIEW_QUESTIONS;
import java.util.Arrays;

public class Find_second_largest_number {

	public static void main(String[] args) {
		int[] arr= {1,34,5,678,99,78,87,65};
		Arrays.sort(arr);
		int l=arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);

	}

}
