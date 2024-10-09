package INTERVIEW_QUESTIONS;
import java.util.HashSet;

public class Remove_duplicate_in_a_array {

	public static void main(String[] args) {
		int[] arr= {1,1,2,3,4,4,5,5,6};
		HashSet<Integer> set=new HashSet<>();
		for(int num:arr)
		{
			set.add(num);
		}
		System.out.println(set);

	}

}
