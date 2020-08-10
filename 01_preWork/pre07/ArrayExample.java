import java.io.*;
import java.util.*;


public class ArrayExample{

    public static void main(String[] args) {


      //Exercise 1.1 Set Up
      double [] numGen = new double [10]; //new double array

      for (int i = 0; i < numGen.length; i += 1){  //generate random num & populate array
        double num = (int) (Math.random()*10);
        numGen[i] = num;
      } //end forloop

      System.out.print("Here is the original array: "); //print original array with random #
      System.out.println(Arrays.toString(numGen));

      System.out.print("Here is the new, squared array: "); //print the squared array from original array
      System.out.println(Arrays.toString(powArray(numGen, 2)));

      System.out.print("Here is the new, array to the fourth power: "); //print the original array elements to the fourth value
      System.out.println(Arrays.toString(powArray(numGen, 4)));



      //Exercise 1.2 Set Up

      int [] grades = new int [100]; //new int array object

      for (int i = 0; i < grades.length; i += 1){  //generate random num & populate array
        int num = (int) (Math.random()*100);
        grades[i] = num;
      } //end forloop

      System.out.print("Here are the scores: "); //print original scores
      System.out.println(Arrays.toString(grades)); //check to see that # generator algorithm was successful (100 values)

      System.out.print("The length of this array is: ");
      System.out.println(grades.length);

      int[] hist = histogram(grades,100); //histogram Array
      System.out.println("The length of hist, is: " + hist.length);
      for(int i = 0; i < hist.length; i++){
        System.out.printf("Score: %d, Frequency: %d\n", i, hist[i]);

      } //end forloop




      //Exercise 4 Set Up

      int [] randNums = new int [50]; //new int array object

      for (int i = 0; i < randNums.length; i += 1){  //generate random num & populate array
        int num = (int) (Math.random()*100);
        randNums[i] = num;
      } //end forloop

      System.out.print("Here are the numbers in the original array: "); //print original values
      System.out.println(Arrays.toString(randNums)); //check to see that # generator algorithm was successful

      System.out.println("The highest element value is located at index: " + indexOfMax(randNums));




      //Exercise 5 Set Up
      Scanner primus = new Scanner (System.in);

      System.out.println("I would like a list of prime numbers from 1 to :______");
      int newNum = primus.nextInt(); //initialized newNum to a number

		  boolean[] reorganized = sieve(newNum);
		  for (int i = 0; i < newNum; i += 1) {
			     if (reorganized[i]) {
				      System.out.print(i + " "); //print the index of any item that is a prime number (contains a true)
			     } //end if stament
      } //end for loop

    } //end main



    //Exercise 1.1 Method
    /**
    * A method that returns a new array that contains the elements of "a" to a given power
    *
    * @param a double array
    * @param exp integer representing the exponent value for the base # from the array
    * @return new array with new elements based on exponent math
    */

    public static double [] powArray (double [] a, int expo){

        double [] ans = new double[a.length];     //create new array with the same length as the array passed through
        for (int i = 0; i < a.length; i += 1){

          ans[i] = Math.pow(a[i], expo);          //for each element in the array, store the value to the exponent value passed through when called.
        }
        return ans;                               //return newly populated array
    } //end powArray




    //Exercise 1.2 Method
    /**
    * A method that returns a histogram of a given number of counters
    *
    * @param scores an int array
    * @param counter number of counters
    * @return a histogram (array)
    */

    public static int [] histogram (int [] scores, int counter){

        int [] gram = new int[counter + 1];
        for (int score: scores){
          gram[score]++;
        }
        return gram;
    } //end histogram




    //Exercise 4 Method
    /**
    * A method that takes an array of integers and returns the index of the largest element
    *
    * @param arrayInt an int array
    * @return the index value of the highest element in the array
    */

    public static int indexOfMax (int [] arrayInt){

      int high = arrayInt[0];        //store the value of the element in index 0 to start
      int index = 0;                //set the initial index value to 0

      for (int i = 1; i < arrayInt.length; i += 1){

          if (arrayInt[i] > high){         //check each to see if  each element in the array is greater what is stored in high

            high = arrayInt[i];            //if that element is greater, then reset the value of high to that larger value
            index = i;                     //if that element is greater, then store its index value in index

          }//end if statement
      } //end for loop

      System.out.println("The highest element value is : " + high); //print the element value

      return index;                       //after loop runs, return the last value of index

    } //end indexOfMax method             //no enhanced for loop because you need all three parts of the loop to be able to get the correct data




    //Exercise 5 Method
    /**
    * A method that takes an integer parameter and returns a boolean array that indicates prime numbers only
    *
    * @param n an integer
    * @return boolean array of prime numbers
    */


    public static boolean [] sieve (int n){

      boolean [] primeNums = new boolean[n]; //create new array with a length of n

      for (int i = 1; i < primeNums.length; i += 1){ //start loop at 1 to avoid 0

        primeNums[i] = true; //set all values to true to later only flip those that are not to false

      } //end for loop

      primeNums[1] = false; //1 is not a prime number

      for (int x = 2; x < n; x += 1){  //starting @ 2, increment the full lenght of the array
        for (int y = x; (x * y) < n; y += 1){ //for each element in the array (starting at 2), check if less than n when multiplied
          if (primeNums[x]){
            primeNums[x * y] = false; //any number that is not a prime is flipped to false
          } //end if statement
        } //end y for loop
      } //end x for loop
      return primeNums;   //return the new array
    } //end sieve method


} //end class
