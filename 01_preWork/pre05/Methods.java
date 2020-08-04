import java.io.*;
import java.util.*;

public class Methods{


      public static void main(String[] args){

          // //initial functional test program
          // System.out.println("Hello World!");


          //Exercise 2 setup
          System.out.println("Get ready to start Exercise 2!\n");
          Scanner userInt = new Scanner(System.in);   //new Scanner object
          System.out.println("Enter a numerator: ");  //ask for two ints
          int intNum = userInt.nextInt();
          System.out.println("Great! Now provide the denominator: ");
          int intDenom = userInt.nextInt();
          System.out.println(isDivisible(intNum, intDenom)); //call function & print return



          //Exercise 3 setup
          System.out.println("\nGet ready to start Exercise 3!\n");
          Scanner userSide = new Scanner(System.in);   //new Scanner object
          System.out.println("Enter side 1 length: ");  //ask for three side lengths
          int sideA = userInt.nextInt();
          System.out.println("Enter side 2 length: ");
          int sideB = userInt.nextInt();
          System.out.println("Enter side 3 length: ");
          int sideC = userInt.nextInt();
          System.out.println(isTriangle(sideA, sideB, sideC)); //call function & print return



          //Exercise 8 setup
          System.out.println("\nGet ready to start Exercise 8!\n");
          Scanner userNums = new Scanner(System.in);   //new Scanner object
          System.out.println("Enter the first integer: ");  //ask for two ints
          int ackOne = userNums.nextInt();
          System.out.println("Enter the second integer: ");
          int ackTwo = userNums.nextInt();
          System.out.println(ack(ackOne, ackTwo)); //call function & print return

      } //end main method



      //Exercise 2 Method
      /**
      * Tests whether n is divisble by m
      *
      * @param n is the numerator
      * @param m is the denominator
      * @return true if n is divisble by m, false otherwise
      */

      public static boolean isDivisible(int n, int m){    //takes in two integers

          return n % m == 0;  //return true only if n mod m is 0
      } //end isDivisible method




      //Exercise 3 Method
      /**
      * Tests whether a triangle can be formed given three lengths
      *
      * @param a is the first length
      * @param b is the second length
      * @param c is the third length
      * @return true if a triangle is vialbe based on the lengths
      */


      public static boolean isTriangle(int a, int b, int c){    //takes in three integers

          if (a > (b + c)) {          //return false if the sum of b & c is less than a
            return false;
          } else if (b > (a + c)){    //return false if the sum of a & c is less than b
            return false;
          } else if (c > (a + b)){    //return false if the sum of a & b is less than c
            return false;
          } else{
            return true;              //if none of the above conditions are met, return true
          }
      } //end isTriangle method




      //Exercise 8 Method
      /**
      * Tests two integers and returns the value of the Akerman function
      *
      * @param m is the first length
      * @param n is the second length
      * @return value of the Ackermann function
      */


      public static int ack(int m, int n){  //takes in two integers

          if (m == 0){                        //check if m is equal to 0 and if true, return n + 1
            return n + 1;
          }
          if (m > 0 && n == 0){               //check if m is greater than 0 AND n is equal to 0
            return ack(m - 1, 1);             //if both conditions are true, return value of the function with m -1 and 1 as arguments
          }
            return ack(m - 1, ack(m, n - 1));  //in all other cases, return the value of  m -1, and another call of the function with m and n-1 as the arguments
                                                //continue until no function calls remain (until you return n + 1 for the final time)
      } //end ack method

} //end Methods class
