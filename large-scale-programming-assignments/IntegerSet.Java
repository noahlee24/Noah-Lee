package org.howard.edu.lsp.assignment5.implementation;
	import java.util.*;

	import java.util.ArrayList;


	/** 
	 * This class IntegerSet conntains @ functions {clear(), length(), equals(IntegerSet) , contains(int) , 
	 * largest(), smallest(), add(int), remove(int), union(IntegerSet),  intersect(IntegerSet), 
	 * diff (IntegerSet), isEmpty() , and toString()	.  
	 * Each function will be broken down into comments below. 
	 *  *@author Noah Lee
	 */ 


public class IntegerSet  {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer>set = new ArrayList<Integer>();
	// Default Constructor
	public IntegerSet() {
		//this.set = set;
	}
	


	// Clears the internal representation of the set
	public void clear() {
		set.clear() ;
		}

	// Returns the length of the set
	public int length() {
		return set.size();
		} // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
	public boolean equals(IntegerSet b) {
		boolean set2 = true;
		Collections.sort(set);
        Collections.sort(b.set);  
		if(set.size() == b.set.size()) {
        
			return true;
		}
	else
		
	{
		
		 for(int i = 0; i < length() ; i++)
         {
             if(set.get(i) == b.set.get(i))
             {
             	
             }
             else
             {
                 set2 = false;
             }
         }
     }
    return set2;	
	}

// Returns true if the set contains the value, otherwise false
	 public boolean contains(int value) {
	 boolean full = set.contains(value) ;
	        return full;
	    }

	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	    public int largest() throws IntegerSetException 
	    {
	    	
	        if(set.size() == 0)
	        {
	            throw new IntegerSetException ("ERROR: Set is Empty");
	           // return 0 ;
	        }
	        else
	        {
	            Collections.sort(set);
	            int i = set.get(set.size());
	            return (i-1);
	        }
	    } 

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	   public int smallest() throws IntegerSetException 
	    {
	        if(set.size() == 0)
	        {
	            throw new IntegerSetException ("ERROR: Set is Empty");
	            //return 0 ;
	        }
	        else
	        {
	            Collections.sort(set);
	            return set.get(0);
	        }
	    }
	    


	// Adds an item to the set or does nothing it already there
    public void add(int item) 
    {
        if (contains(item))
        
        
        {
        	// do nothing
        }
        else
        {
            set.add(item);
        }
    } 
 // adds item to the set or does nothing if it is in set

    // Removes an item from the set or does nothing if not there
    public void remove(int item) throws IntegerSetException
    {
        if(set.size() == 0)
        
        {
        	
        }
     
        else
        {
        	int num = set.indexOf(item);
            set.remove(num);
        }
    }//  Throws a IntegerSetException of the set is empty
	// Set union
	public void union(IntegerSet intSetb) {
	List<Integer> Uset = new ArrayList<Integer>();
    for(int i = 0; i < set.size(); i++)
	{
		int value = set.get(i);
		Uset.add(value);
	}
	
   if (equals(intSetb))
   {
        // do nothing because they are the same
        //System.out.println("The Union is the same");
   }
   else
   {
       
     
            for(int i = 0; i < intSetb.set.size(); i++)
            {
                int value = intSetb.set.get(i);
                add(value);  
                Uset.add(value);       
            }
       
   }
}
	

	// Set intersection
	public void intersect(IntegerSet intSetb) {List<Integer> Sector = new ArrayList<Integer>();

    if(isEmpty() || intSetb.isEmpty())
    {
        System.out.println("One Of The Set Are Empty .");
    }
    else
    if(length() < intSetb.length())
    {
        for(int i = 0; i < length() ; i++)
        {
            int value = set.get(i);
            if(intSetb.contains(value))                
            {
            //ans = true
               Sector.add(value);
            
            }

        }
        if (Sector.size()==0)
        {
            System.out.println("There is no intersection between the sets.");
        }
        else
        {
            System.out.print("[ ");
            //returns the intersecting list
            for(int i = 0; i < Sector.size() ; i++)
            {
              System.out.print(Sector.get(i)+ " ");
            }
            System.out.println("]");    
        }
    }
    
    else
    {
        for(int i = 0; i < intSetb.set.size() ; i++)
        {

            int value = intSetb.set.get(i);
            
            if(set.contains(value))                 
            {
            Sector.add(value);
            }
        }
        if (Sector.size()==0)
        {
            System.out.println("There is no intersection between the sets.");
        }
        else
        {
            System.out.print("[ ");
            //returns the intersecting list
            for(int i = 0; i < Sector.size() ; i++)
            {
                System.out.print(Sector.get(i) + " ");
            }
            System.out.println("]");
        }        
    }
}

	// Set difference, i.e., s1 –s2
	 public void diff(IntegerSet intSetb) throws IntegerSetException
	    {
	        // The difference is all the elms in set a (our first set in the testcase) without any elms from set b (our second set in the testcase)
	    	if(isEmpty() || intSetb.isEmpty())
	        {
	            System.out.println("One or more sets are empty");
	        }
	        else
	        if(set.size() < intSetb.set.size())
	        {
	        	for(int i = 0; i <  intSetb.set.size() ; i++)
	            {
	                int value = intSetb.set.get(i);
	                if(contains(value))                
	                {
	                   remove(value);
	                }
	            }
	            if (set.size()==0)
	            {
	                System.out.println("There is no difference between the sets.");
	            }
	            else
	            {
	                System.out.print("[ ");
	                //returns the set a list
	                for(int i = 0; i < length() ; i++)
	                {
	                  System.out.print(set.get(i)+ " ");
	                }
	                System.out.println("]");    
	            }
	        }
	        else
	        {
	            for(int i = 0; i <  set.size() ; i++)
	            {
	                int value = set.get(i);
	                if(intSetb.contains(value))                
	                {
	                   remove(value);
	                }
	            }
	            if (set.size()==0)
	            {
	                System.out.println("There is no difference between the sets.");
	            }
	            else
	            {
	                System.out.print("[ ");
	                //returns the set a list
	                for(int i = 0; i < set.size() ; i++)
	                {
	                  System.out.print(set.get(i)+ " ");
	                }
	                System.out.println("]");
	            
	            
	            
	            }     
	     }
	    } 
public boolean isEmpty()
{
	if (set.size() <= 0)
	{
		return true;
	}
	else
		
	{
		return false;
	}
}
	    
	// Return String representation of your set
	
	public String toString() {
		
		if(isEmpty()) {
			return "[]";
		}
		else{
			
			String nums = " ";
		for (int i = 0 ; i < set.size(); i++) {
			nums += set.get(i) + " ";
		}
		return nums;
		}
		
	}	// return String representation of your set
	


}