package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		// Your code follows here.
		
		
		
		String[] itemNames = new String[s.nextInt()];
		double[] itemPrices = new double[itemNames.length];
		
		
		for(int i=0; i <itemNames.length; i++) {
			
			itemNames[i] = s.next();
			itemPrices[i]= s.nextDouble();
		}
		
		System.out.println(Arrays.toString(itemNames));
		System.out.println(Arrays.toString(itemPrices));
		
		
		String[] custNames = new String[s.nextInt()];
		double[] custPay = new double[custNames.length];
	
		
		for(int j=0; j < custNames.length; j++) {
			// every iteration, a name is being added onto the list of names custNames
			
			custNames[j] = s.next() + " " + s.next();
			//name is copied down
		
			//number of items that that specific person bought, will be used to run through that many iterations of item adder
			for(int a=0; a < s.nextInt(); a++) {
				//goes as many times as there are items
				int specificFoodCount = s.nextInt();
				//first input is how much of that first food the person bought. Stored for a multiplier for total price
				String specificFood = s.next();
				// gets the name of the specific food that the person purchased
					for(int k = 0; k < itemNames.length; k++) {
					//running through all the food options gathered to find which one it is and get its price
						if(specificFood.equals(itemNames[k])) {
							//If the item matches, then that customers pay is increased by the price of that item times the amount that person purchased
							double thatPay = (itemPrices[k] * specificFoodCount);
							custPay[j] = custPay[j] + thatPay ;
							break;   
					}
						//still in the for loop for finding food
				}
					//getting food counts and food names for each food
			}
			//getting peoples names
		}										
		
			
		System.out.println(Arrays.toString(custNames));
		//System.out.println(Arrays.toString(custPay));
		
		s.close();
		
	}}
		
	
				
				
				
				
				
			
		
			
			
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		