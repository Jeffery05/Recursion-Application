/**
 * This program has two methods that together are used to convert an inputted number in base 10 to base 2. 
 * 
 * @author Akshar Barot
 * @author Jeffery Hu
 * @since 2021-03-26
 * Teacher: Ms. Krasteva
 */

import java.util.*;

public class Binary{   
   
   /**
     * This method calculates the binary representation of a base 10 number. It uses recursion to do this.
     * The recursive method calls itself but reduces the exponent parameter in half so that
     * eventually the exponent value becomes 1 and then 0 gets returned. to calculate what gets returned when n is not 0
     * it multiplies what is returned from the previous toBinary() cakk and multiply it be 10. Then it adds the remainer of n 
     * divided by 2. It is multiplied by 10 to move back the decimal place so the next binary digit can be stored at the end of 
     * the current binary number. Then, it adds the next binary digit to the end. (1 becomes (1*10) 10 becomes (10+1) 11).
     *
     * @param n, the number in base 10
     * @return The binary representation of the inputted number
     */   
   public static int toBinary (int n)
   {  
      if (n!=0){
         int fact = n%2;
         return 10 * toBinary(n/2) + fact;
      }
      else{
         return 0;
      }
   }
   
   /**
     * This is the main method, which controls the flow of the program. This main method first takes user input
     * for a number in base 10 that they want to convert to base 2. Then, the method calls the toBinary() method with 
     * the user inputted number as the parameter. Finaly, it prints out a final statement with the user inputted
     * number in base 2 (using what is returned from tobinary()).
     */ 
   public static void main (String args[]){
      Scanner in = new Scanner (System.in);
      System.out.println("Enter any positive integer in base 10:");
      int number = in.nextInt();
      System.out.println(number + " is equal to " + toBinary(number) + " in base 2.");
   }

}