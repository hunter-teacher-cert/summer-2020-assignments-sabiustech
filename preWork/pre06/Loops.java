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

    } //end main



    //Exercise 3 Method
    /**
    * An iterative method that returns x^n
    *
    * @param x is the base number (double)
    * @param n is the power (int)
    * @return x^n (int)
    */

    public static int power(double x, int n){

      int ans = 1; //if int == 0, returns a 1 in line 32 since loop will not run

      for (int i = 0; i < n; i += 1){
        ans *= x; //multiply ans by x with each iteration
      }
      return ans; //return ans once loop is complete

    } //end power




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

    } //end factorial




    //Exercise 5 Method  *******Need Help Completing this Exercise****

    public static double myExp(int x, int n){

      double ans = 1;
      int numerator = 1;
      int denominator = 1;

      for (int i = 1; i <= n; i += 1){
        numerator *= x;
        denominator *= i;
        ans += (double)(numuerator/denominator);
      }
      return ans;

    } //end factorial


} //end program
