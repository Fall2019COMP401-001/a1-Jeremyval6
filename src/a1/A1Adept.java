package a1;

import java.util.Scanner;

public class A1Adept {


	public static void main(String[] args) {
		
Scanner s= new Scanner(System.in);
		
		// Your code follows here.

String[] itemNames = new String[s.nextInt()];
double[] itemPrices = new double[itemNames.length];
for(int i=0; i <itemNames.length; i++) {
	
	itemNames[i] = s.next();
	itemPrices[i]= s.nextDouble();
}
	      //
        int peopleCount=s.nextInt();
		int itemCount;int number;
		double max=0.0;
		double min=1000.0;
		String Max=" ";
		String Min=" ";
		String name;
		String itemName;
		double price = 0.0;
		double total=0.0;
		
       for(int i=0;i<peopleCount;i++) {
    	name=s.next()+" "+s.next();
    	itemCount=s.nextInt();
    	double purchase=0.0;
    	
    			for(int j=0;j<itemCount;j++) {
    				number=s.nextInt(); 
    				itemName=s.next();
    			for(int k=0;k<itemNames.length;k++) {
    		          if(itemNames[k].equals(itemName))  
    		           {         
    		    	  price=itemPrices[k];
    		    	  purchase+=price*number;
       		           }
    		   }
    	              }
    			if(purchase>max) {
     		    	 Max=name;
     		    	 max=purchase;}
     		    	if(purchase<min) {
     		    		min=purchase;
     		    		Min=name;}
     		    	total+=purchase;
       }
       System.out.println("Biggest"+":"+" "+Max+" ("+String.format("%.2f",max)+")");
       System.out.println("Smallest: "+Min+" ("+String.format("%.2f",min)+")");
	   System.out.println("Average: "+String.format("%.2f",total/peopleCount));
	   
	   s.close();
	}
    		     
    
           
				
				

}
				
				
				
				
				
			
		
			
			
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		