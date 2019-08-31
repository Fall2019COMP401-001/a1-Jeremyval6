package a1;

import java.util.Scanner;
//import java.util.Arrays;

public class A1Novice {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		String[] peopleNames = new String[s.nextInt()];
		double[] payments = new double[peopleNames.length];
		
		
		
		for(int i=0; i <peopleNames.length; i++) {
			
			peopleNames[i] = s.next().substring(0,1) + ". " + s.next() + ": ";
			int items = s.nextInt();
			for(int k=1; k <= items; k++) {
				int multiplier = s.nextInt();
				s.next();
				payments[i] = payments[i] + (s.nextDouble() * multiplier);
				//String.format("%.2f", payments[i]);
			//System.out.println(peopleNames[i] + payments[i]);
		}
			System.out.println(peopleNames[i] + String.format("%.2f", payments[i]));
		}
		
		
			s.close();
		
		}}
		
	    //How to perform operations on acquired s.nextDoubles? Tries initializing by "double s.nextDouble", didnt work.

