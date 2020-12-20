package ControlFlow;

import java.util.Scanner;

import java.util.Random;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
    	//System.out.printf("Hello World!\n");
		
		
/* This is the assignment for printing ASCII characters numbers and letters...	*/	
				 
		//for (int x=0; x<51; x++) {
			//System.out.println(x);		
		//}
		
		//for (int x=97; x<123; x++) {
			//System.out.println((char)x);		
		//}
		
		//for (int x=65; x<91; x++) {
			//System.out.println((char)x);
		//}
		
		
/* This is the assignment portion for asking interactive questions... */
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is your name?");
		
/*User types in name */
		
//	      String firstName = input.nextLine();
//	      System.out.printf("Hello %s!\n", firstName);
	      
/*Ask the user a different question after Name prompt */  
	      
//	      System.out.println("Would you like to continue on to the interactive portion?");
	      
/*User types in the response y/n */ 
	      
//	      Scanner userInput = new Scanner(System.in);
//	      char userChoice = userInput.next().charAt(0);
//	      
//	      switch (userChoice) {
//	      case 'y':
//	      System.out.printf("Continue on to take the survey");
//	      break;
//	      
//	      case 'n':
//	      System.out.println("Please return later to take our survey");
//	      break;
//	      	      
//	      default:
//              System.out.println("Please enter a valid response of yes or no.");
//              
//	      }
//		      	      
/* This is the assignment for picking the winning lottery and power ball numbers.. */


	      Scanner input = new Scanner(System.in);
	      System.out.println("Do you have a red car?, (Yes or No)");
	      String userinput = input.nextLine();
	      char again = 0;
	      
	      do {
	    	  System.out.println("What is the name of your favorite pet?");
	    	  String petName = input.nextLine();
	    	
	    	  
	    	  System.out.println("What is the age of your favorite pet?");
	    	  Scanner scanner = new Scanner(System.in);	    	  
	    	  int i = scanner.nextInt();
	    	 
	    	  
	    	  System.out.println("What is your lucky number?");
	    	  //Scanner number = new Scanner(System.in);
	    	  int n = scanner.nextInt();
	    	  
	    	 
	    	  System.out.println("What is your favorite quaterback's number?");
	    	  Scanner userInput = new Scanner(System.in);
	    	  String someNumber = input.next();
	    	  
	    	  System.out.println ("What is the two-digit model year of your car?");
	    	  int y = scanner.nextInt();
	    	  	    	  		      		     
	    	  System.out.println("What is the first name of your favorite actor or actress?");
	    	  String firstName = input.next();
	    	  
	    	  
	    	  System.out.println("Enter a random number between 1 and 50.");
	    	  int r = scanner.nextInt();
	    	  
	    	  System.out.println ("Here are your winning numbers!");
	    	  
	    	  
	    	  
/* Generate 3 random numbers between 1 and 50 */
	    	  
	    	  
	    		      Random rand = new Random(); 
	    		      int rand_int1 = rand.nextInt(51);
	    		      int rand_int2 = rand.nextInt(51);
	    		      int rand_int3 = rand.nextInt(51);
//	    		      System.out.println("Random Integers: "+rand_int1);
//	    		      System.out.println("Random Integers: "+rand_int2);
//	    		      System.out.println("Random Integers: "+rand_int3);
	    		     
/* Generate magic ball number */
	    		      
	    		      
	
	      
	      }
	      
	      while (again =='Y' || again == 'y'); {
	    	  System.out.println("What is the name of your favorite pet?");
	      }
	}
}

	    	 
	      
	      
	

	      

	      
	    
	      
	      
	   
	   
	
	



	          
	          
	      
	      
	     
	


