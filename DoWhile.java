package Day7;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int total=0;
		int distinction = 0;
		int pass = 0;
		int fail = 0;
		int invalid = 0;
		
		int userIn;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			
			System.out.print("Please enter the mark. Enter -1 to exit.");
			
			userIn = sc.nextInt();
			
			if (userIn>=70 && userIn <=100) {
				distinction +=1;
				total +=1;
			} else if (userIn>=50 && userIn <=69){
				pass +=1;
				total +=1;
			} else if (userIn>=0 && userIn <=49){
				fail +=1;
				total +=1;
			} else {
				invalid+=1;
			}
			
		} while (userIn !=-1);
		
		
		System.out.println("There are " + total +" students: "+ distinction+ " distinctions, "+ pass +" pass, "+ fail+ " fails (plus " + invalid+ " invalid).");
		
	}

}
