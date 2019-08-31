package a1;

import java.util.Scanner;
//import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] foodNames = new String[s.nextInt()];
		int[] foodCount = new int[foodNames.length];
		int[] numPeople = new int[foodNames.length];
		
			for(int i = 0; i < foodNames.length; i++) {
				foodNames[i] = s.next();
				s.next();
													  }		
		int peopleNum = s.nextInt();
					
			for(int i = 0; i < peopleNum; i++) {
				s.next();
				s.next();
				int foodAmount = s.nextInt();
				int[] custItemAmount = new int[foodAmount];
				String[] custFoodName = new String[foodAmount];
					
					for(int j = 0; j < foodAmount; j++) {
						int itemCount = s.nextInt();
						String foodName = s.next();
						custItemAmount[j] = itemCount;
						custFoodName[j] = foodName;
							
							for(int k = 0; k < foodNames.length; k++) {
								if(foodName.equals(foodNames[k])) {
									foodCount[k] += itemCount;
									numPeople[k]++;
									break;
																  }
								
																	   }
		
															}
					
					int[] repeats = new int[foodAmount];
					
						for(int x=0; x<foodAmount; x++) {
							
							for(int y= x+1; y < foodAmount; y++) {
								if(custFoodName[x].equals(custFoodName[y])) {
									repeats[x] += 1;
																			}
																 }	
							
							if(repeats[x] == custFoodName.length-1) {
									repeats[x] = repeats[x] -1;
															}
														}
						
							for(int x=0;x < foodNames.length; x++) {
								if(custFoodName.length == 1) {
								if(custFoodName[0].equals(foodNames[x])){
																		
																	}
															 }
								else {
									
									for(int y=0; y < foodAmount; y++) {
										if(custFoodName[y].equals(foodNames[x])) {
											numPeople[x] = numPeople[x] - repeats[y];
																				 }
																		}
									
									 }
																	}

												}//this is the end of the big for loop that extracts what the people ordered (foodName) 
												 //and how much of the food the people ordered(foodAmount). This also had to extract how
												//many instances that the unique food name was presented, which cant be confused with the 
												//amount of unique customers that ordered the food. I next had to create a for loop for 
												//repeaters that accrued amount customers.



for(int a = 0; a < foodNames.length; a++) {
	
	
	if(numPeople[a] == 0) {
		
		System.out.println("No customers bought " + foodNames[a]);
		
	}
	else {
	
		System.out.println(numPeople[a] + " customers bought " + foodCount[a] + " " + foodNames[a]);
	
	}
	
}
//System.out.println(Arrays.toString(foodNames));
//System.out.println(Arrays.toString(foodCount));
//System.out.println(Arrays.toString(numPeople));
s.close();


}}



		
		
		