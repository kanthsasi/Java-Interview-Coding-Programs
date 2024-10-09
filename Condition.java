package INTERVIEW_QUESTIONS;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		       Scanner scan=new Scanner(System.in);
		       int jan, feb, mar;
		       jan=scan.nextInt();
		       feb=scan.nextInt();
		       mar=scan.nextInt();
		        int tot = jan + feb + mar;
		        int avg = tot / 3;
		        System.out.println("Total:" + tot);
		        System.out.println("Average:" + avg);
		        
		        
		        
		        int inc = 0;
				if (jan >= 15 && feb >= 15 && mar >= 15)
		        {
		            if (avg > 75)
		            {
		                inc = tot * 10 / 100;
		                System.out.println(inc);
		            }
		            else if (avg > 45)
		            {
		                inc = tot * 5 / 100;
		            }
		            else if (avg >=25)
		            {
		                inc = tot * 2 / 100;
		            }
		        }
		        else
		        {
		           inc = 0;
		        }
		        System.out.println(inc);
		       
		        
		    }

		
		    

	}


