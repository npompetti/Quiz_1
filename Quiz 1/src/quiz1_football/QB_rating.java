//Nicholas Pompetti
package quiz1_football;
import java.util.Scanner;

public class QB_rating {
	
	public static double Rating(float attempts, float completions
			,float p_yards, float td_passes, float interceptions){
		
		double a = ((completions/attempts) - .3)*5;
		
		double b = ((p_yards/attempts) - 3)*.25;
		
		double c = ((td_passes/attempts)*20);
		
		double d = (2.375 - ((interceptions/attempts) * 25));
		
		double mm_a= (Math.max(0, Math.min(a, 2.375)));
		
		double mm_b= (Math.max(0, Math.min(b,2.375)));
		
		double mm_c= (Math.max(0, Math.min(c,2.375)));
		
		double mm_d= (Math.max(0, Math.min(d,2.375)));
		
		if(a < 0){
			mm_a = 0;
		}
		else if (a > 2.375){
			mm_a = 2.375;
		}
		
		if(b < 0){
			mm_b = 0;
		}
		else if (b > 2.375){
			mm_b = 2.375;
		}
		
		if(c < 0){
			mm_c = 0;
		}
		else if (c > 2.375){
			mm_c = 2.375;
		}
		
		if(d < 0){
			mm_a = 0;
		}
		else if (a > 2.375){
			mm_d = 2.375;
		}
		
				
		
				
		
		double passer_rating = ((mm_a + mm_b + mm_c + mm_d) / 6) * 100;
		
		return passer_rating;
		
		
	}	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		//Asking User for number of passing attempts
		System.out.print("Enter the number of passing attempts: ");
		float att = input.nextInt();
		
		//Asking user for number of completions
		System.out.print("Enter the number of completions: ");
		float cmplt = input.nextInt();
		
		//Asking user for number of passing yards
		System.out.print("Enter the number of passing yards: ");
		float passing= input.nextInt();
		
		//Asking user for number of Touchdown passes
		System.out.print("Enter the number of touchdown passes: ");
		float tds= input.nextInt();
		
		//Asking user for number of Interceptions
		System.out.print("Enter the number of interceptions: ");
		float intercept= input.nextInt();
		
		input.close();
		
		double rating = Rating(att, cmplt, passing, tds, intercept);
		
		System.out.printf("The quarterbacks passing rating was " + "%-10.1f", rating);
		
		
	}
		
	
	
}
