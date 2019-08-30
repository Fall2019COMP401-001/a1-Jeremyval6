package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] foodNames = new String[s.nextInt()];
		//String of size s.nextInt of that many food items
		int[] foodCount = new int[foodNames.length];
		int[] numPeople = new int[foodNames.length];
;

//Create 3 arrays, one for the food names, one for number of that food bought,
//and one for number of people who bought that item. Elements with the same index
//correspond to each other


//Fill the arrays with the item names
for(int i = 0; i < foodNames.length; i++) {
			
	foodNames[i] = s.next();
	
	//Skip the item price
	s.next();
			
}		

//Records the number of customers
int peopleNum = s.nextInt();

//Every iteration, adds the number of items bought by one customer to the numItems element
//that corresponds to the correct item name in itemNames
for(int i = 0; i < peopleNum; i++) {
	
	//Skip the first and last names
	s.next();
	s.next();
	
	//Records the number of items bought by this customer
	int foodAmount = s.nextInt();
	int[] custItemAmount = new int[foodAmount];
	String[] custFoodName = new String[foodAmount];
	
	//Every iteration, adds the number of a specific item bought by this customer to
	//the numItems element that corresponds to the item name in itemNames
	for(int j = 0; j < foodAmount; j++) {
		
		//Records the number of that specific item bought by this customer
		int itemCount = s.nextInt();
		
		//Records the name of this specific item
		String foodName = s.next();
	
		custItemAmount[j] = itemCount;
		custFoodName[j] = foodName;
	
		for(int k = 0; k < foodNames.length; k++) {
			
			if(foodName.equals(foodNames[k])) {
				
				foodCount[k] += itemCount;
				numPeople[k]++;
				//How to handle one person buying the same food on multiple lines
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
		//nada
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

}


//Prints out the information for each item
for(int a = 0; a < foodNames.length; a++) {
	
	//If nobody bought an item, the message is slightly different
	if(numPeople[a] == 0) {
		
		System.out.println("No customers bought " + foodNames[a]);
		
	}
	else {
	
		System.out.println(numPeople[a] + " customers bought " + foodCount[a] + " " + foodNames[a]);
	
	}
	
}
System.out.println(Arrays.toString(foodNames));
System.out.println(Arrays.toString(foodCount));
System.out.println(Arrays.toString(numPeople));
s.close();


}}



		
		
		