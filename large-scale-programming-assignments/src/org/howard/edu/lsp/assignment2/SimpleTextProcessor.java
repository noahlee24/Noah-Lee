package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

/**
 * SimpleTextProcessor
 * 
 * @author Noah Lee
 *
 */
public class SimpleTextProcessor {




    public static void main(String[] args) 
    {
        while(true)
        {
            int sum = 0;
            int product = 1;
            
            System.out.println("String?");
            Scanner scan = new  Scanner(System.in); //System.in is a standard input
            String [] Tokens = scan.nextLine().split(" "); //stores nextline in string and splits newline characters
            System.out.println("Tokens:");

            for(int i = 0; i < Tokens.length; i++)
            {
                if(Tokens[i] == "Goodbye") // terminates code if user type "goodebye"
                {
                    break;
                }
                else
                {
                    System.out.println(Tokens[i]);
                }
            }

            for(int i = 0; i < Tokens.length; i++)
            {
                sum += Integer.parseInt(Tokens[i]);// converts strings to int multiply products
                product *= Integer.parseInt(Tokens[i]);// converts strings to int and multiply products
            }

            System.out.println("Sum: "+sum);
            System.out.println("Product: "+product);
        }
    }
}