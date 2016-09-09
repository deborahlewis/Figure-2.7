/*
 * Deborah Lewis
 * Figure 2.7 Deitel: How to Program (Early Ojects)
 * Addition program that inputs two numbers then displays their sum
 */
package deitel_figure2_7;

import java.util.Scanner; //import to accept user input

public class Deitel_Figure2_7 {

    public static void main(String[] args) {
        //create scanner to accept user input from command window
        Scanner input = new Scanner(System.in);
        
        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of number1 and number2
        
        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //read first integer fromm user
        
        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //read second integer from user
        
        sum = number1 + number2; //add numbers then store total in sum
        
        System.out.printf("Sum is %d%n", sum); //display sum
    } //end main
    
} //end class
