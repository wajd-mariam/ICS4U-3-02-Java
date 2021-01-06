/*
* Copyright (c) 2021
*
* The Factorial.java program calculates the factorial of an 
* entered a number and printed it to the user.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/05
*/

// Importing Scanners
import java.util.Scanner; 

public class Factorial {
  
  /**
   * This function reverses the string passed in using recursion.
   */
  static int factorialCalculation(int number) {
    if (number == 1) {
      return (1);
    } else {
      return (number * factorialCalculation(number - 1));
    }
  }
  
  /**
   * This function prints a string, calls a function to reverse it, and print the 
   * reversed string.
   */
  public static void main(String[] args) {
    // Variables used:
    int intInput;
    int factorial;
    
    // Try Catch Statement:
    try {
      // Getting input from user:
      final Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to get factorial of: ");
      intInput = input.nextInt();
     
      // Calling function "factorialCalculation" to find factorial:
      factorial = factorialCalculation(intInput);
    
      // Printing the factorial to the user.
      System.out.println("The factorial of " + intInput + " is " + factorial);
    } catch (Exception e) {
      System.out.print("");
      System.out.println("ERROR."); 
    }
  }
}