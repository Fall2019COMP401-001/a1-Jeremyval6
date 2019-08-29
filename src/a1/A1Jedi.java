package a1;

import java.util.Scanner;

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
	
	//Every iteration, adds the number of a specific item bought by this customer to
	//the numItems element that corresponds to the item name in itemNames
	for(int j = 0; j < foodAmount; j++) {
		
		//Records the number of that specific item bought by this customer
		int itemCount = s.nextInt();
		
		//Records the name of this specific item
		String foodName = s.next();
		
		//Searches for the item in itemNames, and adds the number of items bought
		//to the corresponding element in numItems, as well as increasing the
		//number of people who bought that item by one in the corresponding
		//element in numPeople
		for(int k = 0; k < foodNames.length; k++) {
			
			if(foodName.equals(foodNames[k])) {
				
				foodCount[k] += itemCount;
				numPeople[k]++;
				
				break;
				
			}
			
		}
		
	}
	
}

//Prints out the information for each item
for(int i = 0; i < foodNames.length; i++) {
	
	//If nobody bought an item, the message is slightly different
	if(numPeople[i] == 0) {
		
		System.out.println("No customers bought " + foodNames[i]);
		
	}
	else {
	
		System.out.println(numPeople[i] + " customers bought " + foodCount[i] + " " + foodNames[i]);
	
	}
	
}

s.close();

}
}



		
		
		