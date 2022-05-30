	import java.util.Scanner;

	public class DoWhileTest {
	  public static void main(String[] args) {
	     Scanner scnr = new Scanner(System.in);
	     String fill;
	    
	     fill = "q";
	    
	     int menuchoice = 0;
	     
	     do {
	    // while (!fill.equals("q")) {
	   System.out.println(" print menu choices here");// fill + fill + fill);
	   System.out.println(" click 1- add a new post  to this click \n 2 viewallposts \n 3- delete a post ");// fill + fill + fill);
	   //TODO read from the user menuchoice 
	   
	   switch(menuchoice) {
	   case 1: //TODO   add post will read a string from the user and add it to the user's posts.  addPost(input);
		   
		   break;
	   case 2:   //TODO viewPosts();
		   break;
	   case 3: // TODO 
		   break;
		   
	   case 9: //TODO print out a good bye message to the user 
		   break;
	default: //TODO print out wrong menu option for the user 
		
		
	   }
	   
	   
	         //System.out.println(fill + fill + fill);
	         //System.out.println(fill + fill + fill);
	    
	      //   System.out.print("Enter char (q to quit): ");
	       //  fill = scnr.next();
	       //  System.out.println("");
	     } while (menuchoice!=9);
	     System.out.println("all done!");
	  }
	}
