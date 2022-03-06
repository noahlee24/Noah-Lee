package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

public class Driver 
{
	public static void main(String[] args) throws Exception
    {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

       
        //ISEMPTY? METHOD BEFORE INSERTION
        System.out.println("isEmpty Method (Before Insertion):\n");
        System.out.println("Currently is the Set1 Empty ? (true/false): " + set1.isEmpty());
        System.out.println("Currently is the Set2 Empty ? (true/false): " + set2.isEmpty());
        //ADD METHOD BEFORE INSERTION
        System.out.println("Add Method:\n");
        System.out.println("Set1:"); //set 1 insertion
        {
	    	System.out.println("\t" + "Inserting '1' into Set1.");
	        set1.add(1);
	        System.out.println("\t" + "Inserting '2' into Set1.");
	        set1.add(2);
	        System.out.println("\t" + "Inserting '4' into Set1.");
	        set1.add(3);
	        System.out.println("\t" + "Inserting '3' into Set1.");
	        set1.add(4);
	        System.out.println("\t" + "Inserting '4' into Set1.");
	        set1.add(5);
        }
         //ISEMPTY? METHOD AFTER INSERTION
        System.out.println("isEmpty Method (After Insertion):\n");
        System.out.println("Currently is the Set1 Empty ? (true/false): " + set1.isEmpty());
        System.out.println("Currently is the Set2 Empty ? (true/false): " + set2.isEmpty());
 
        System.out.println("Set2:");  //set 2 insertion
        {
        	 System.out.println("\t" + "Inserting '6' into Set2.");
	    	 set2.add(6);
	    	 System.out.println("\t" + "Inserting '7' into Set2.");
	         set2.add(7);
	         System.out.println("\t" + "Inserting '8' into Set2.");
	    	 set2.add(8);
	    	 System.out.println("\t" + "Inserting '9' into Set2.");
	    	 set2.add(9);
	    	 System.out.println("\t" + "Inserting '10' into Set2.");
	    	 set2.add(10);
	    	
        }
      
        
        
        //LENGTH METHOD
        System.out.println("Length Method:\n");
        System.out.println("The length of Set1 is: " + set1.length());
        System.out.println("The length of Set2 is: " + set2.length());
        //TOSTRING METHOD AFTER INSERTION
        System.out.println("toString Method:\n");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        //LARGEST METHOD
        System.out.println("Largest Method:\n");
        try 
    	{
        	  System.out.println("The Largest Number Set1 is: " + set1.largest()); 
              System.out.println("The Largest Number Set2 is: " + set2.largest());
            
    	}
    	catch(Exception error)
    	{
    		System.out.println("Error!" + error);
    	}
        
        
        //SMALLEST METHOD
        System.out.println("Smallest Method:\n");
        try
        {
        System.out.println("The Smallest Number Set1 is: " + set1.smallest());
        System.out.println("The Smallest Number Set2 is: " + set2.smallest());
        }
 
       
        catch(Exception error)
    	{
    		System.out.println(error);
    	}
      
        
        
        //REMOVE METHOD
        System.out.println("Remove Method:\n");
        System.out.println("Removing '1' From Set1");
        set1.remove(1);
        System.out.println("Removing '9' From Set2");
        set2.remove(9);
        //CONTAINS METHOD 
        System.out.println("Contains Method:\n");
        System.out.println("Does Set1 contain '9' (true/false): " + set1.contains(9));
        System.out.println("Does Set2 contain '6' (true/false): " + set2.contains(6));
        //TOSTRING METHOD AFTER REMOVING 1 ELEMENT FROM EACH SET
        System.out.println("toString Method (After Removal of an Element):\n");
        System.out.println("Value of Set1 is: " + set1.toString());
        //EQUALS METHOD
	        System.out.println("Equals Method:\n");
	        System.out.println("Does Set1 equal Set2(true/false): " + set1.equals(set2));
	        System.out.println("Does Set2 equal Set3(true/false): " + set2.equals(set1));
        //UNION METHOD
	        System.out.println("Union Method:\n");
	        System.out.println("Union of Set1 and Set2");
	        System.out.println("Value of Set1 is: " + set1.toString());
	        System.out.println("Value of Set2 is: " + set2.toString());
	        set1.union(set2);	// union of set1 and set2
	        System.out.println("Result of union of Set1 and Set2: " + set1.toString());	// result of union of set1 and set2
        //INTERSECTION METHOD
	        System.out.println("Intersection Method:\n");
	        System.out.println("The Intersect of Set1 and Set2 are the following values:" ); 
	        set1.intersect(set2);
        //DIFFERENCE METHOD
	        System.out.println("Difference Method:\n");
	        System.out.println("The Difference of Set1 from Set2 are the following values:" ); 
	        set1.diff(set2);
        //CLEAR METHOD
	        System.out.println("Clear Method:\n");
	        System.out.println("Clearing Set1:" );
	        set1.clear();
	        System.out.println(" Set is: " + set1.toString());
	        
   
      
 
        
   
    }
}