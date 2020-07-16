import java.io.*;
import java.util.*;


public class ArrayExample{

    public static void main(String[] args) {

      double [] numGen = new double [10];
      for (int i = 0; i < numGen.length; i += 1){
        System.out.println(i);

      } //end forloop



    } //end main



    //Exercise 1 Method
    /**
    * A method that returns a new array that contains the elements of "a" to a given power
    *
    * @param a array
    * @return new elements
    */

    public static double [] powArray (double [] a, int expo){

        double [] ans = new double[a.length];
        for (int i = 0; i < ans.length; i += 1){

          ans[i] = Math.pow(a[i], expo);
        }
        return ans;
    } //end powArray method


} //end class
