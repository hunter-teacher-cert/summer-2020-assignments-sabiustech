import java.io.*;
import java.util.*;

public class Loops{

    public static void main(String[] args) {

        // //intitial functional program test
        // System.out.println("Hello World!");


        //Exercise 3 setup
        System.out.println("Get ready to start Exercise 3!\n");
        Scanner userInput = new Scanner(System.in);   //new Scanner object
        System.out.println("Enter the base number: ");  //ask for base
        double base = userInput.nextDouble();
        System.out.println("Great! Now provide the exponent value: "); //get expo
        int expo = userInput.nextInt();
        System.out.println(power(base, expo)); //call function & print return



        //Exercise 4 setup
        System.out.println("\nGet ready to start Exercise 4!\n");
        Scanner userFact = new Scanner(System.in);   //new Scanner object
        System.out.println("Enter the number you wish to factor: ");  //# to factor
        int factor = userFact.nextInt();
        System.out.println(factorial(factor)); //call function & print return


        //Exercise 5 setup
        System.out.println("\nGet ready to start Exercise 5!\n");
        Scanner userExp = new Scanner(System.in);   //new Scanner object
        System.out.println("Enter the number of terms: ");  //number of terms
        int term = userExp.nextInt();

        //check to Exercise 5, numbers 3 and 4
        check(1, term);

        //check to Exercise 5, number 5
        for (double i = 0.1; i < 1001; i *= 10) {
          check(i, term);
        } //end for loop

        //response to Exercise 5, number 6
        double newTerm = (double) term;  //myExp is expecting num of terms to be a double, so convert here.
        for (double i = -0.1; i > -1001; i *= 10) {
          System.out.println(myExp(i, newTerm));
        } //end for loop



    } //end main method



    //Exercise 3 Method
    /**
    * An iterative method that returns x^n
    *
    * @param x is the base number (double)
    * @param n is the power (int)
    * @return x^n (int)
    */

    public static int power(double x, int n){

      int ans = 1; //if int n == 0, returns a 1 in line 19 since loop will not run

      for (int i = 0; i < n; i += 1){
        ans *= x; //multiply ans by x with each iteration
      }
      return ans; //return ans once loop is complete

    } //end power method




    //Exercise 4 Method
    /**
    * An iterative method that computes factorial
    *
    * @param n is the number to be factored
    * @return factorial computation
    */

    public static int factorial(int n){

      int ans = 1;

      for (int i = n; i > 1; i -= 1){
        System.out.printf("%d\n", ans); //make visible each factor in the loop
        ans *= i; //multiply ans by i with each iteration

      }
      return ans; //return ans once loop is complete

    } //end factorial method




    //Exercise 5 Method
    /**
    * Factorial method to calculate the sum of terms
    *
    * @param x is a double number
    * @param n is the number of terms in series
    * @return computation of all values
    */

    public static double myExp(double x, double n){   //takes in two dobules x (number) and n (# of terms)

      double ans = 1.0;  //initialize ans to 1
      double num = 1.0;  //initialize num to 1

      for (int i = 1; i < n; i += 1){  //for loop running while i is less the number of terms in the series
        num = (num * x )/ i;  //update num's value to num * exponent value provided divided by the value of i as the loop iterates
        ans += num; //add num to the current value of ans
      }
      return ans;  //after loop exits, return the value of ans

    } //end myExp method


    //Exercise 5 Check method
    public static void check (double x, int terms) { //takes in a double and the number of terms (int) so that multiple tests can be run easier

      System.out.println(x + "\t" + myExp(x, terms) + "\t" + Math.exp(x)); //prints the value of the double used when called, the value of my expo with x and terms, and the value returned by math.exp with x as an argument
    } //end check1

} //end loops class
