package org.howard.edu.lsp.assignment5.javadocs;



public @interface JavaDocs {
	
	

	//Creates exception area

	public class IntegerSetException extends Exception
	{
		 IntegerSetException(String message)
		{
			super(message);
		}
	}

}
