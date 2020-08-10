/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Foogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Foogle {

    public static void main( String[] args ){

      // test battery for randomAlOne()
      // System.out.println("\n"+"al000"+":");
      // ArrayList al000 = randomAlOne(0,0,0);
      // System.out.println(al000);
      // System.out.println(positionSearch(al000,3));
      // System.out.println("\n"+"al01"+":");
      // ArrayList al01 = randomAlOne(5,0,100);
      // System.out.println(al01);
      // System.out.println(positionSearch(al01,3));
      // System.out.println("\n"+"al02"+":");
      // ArrayList al02 = randomAlOne(5,3,10);
      // System.out.println(al02);
      // System.out.println(positionSearch(al02,3));

      // System.out.println("\n"+"al05"+":");
      // ArrayList al05 = randomAlOne(20,1,5);
      // System.out.println(al05);
      // System.out.println(positionSearch(al05,3));


      // test battery for randomAlTwo()

      // System.out.println("\n"+"sal000"+":");
      // ArrayList sal000 = randomAlTwo(0,0,0);
      // System.out.println(sal000);
      // System.out.println(positionSearch(sal000,3));
      // System.out.println("\n"+"sal00"+":");
      // ArrayList sal00 = randomAlTwo(5,0,100);
      // System.out.println(sal00);
      // System.out.println(positionSearch(sal00,3));


      // System.out.println("\n"+"sal01"+":");
      // ArrayList sal01 = randomAlTwo(5,0,100);
      // System.out.println(sal01);
      // System.out.println(positionSearch(sal01,3));

      // System.out.println("\n"+"sal02"+":");
      // ArrayList sal02 = randomAlTwo(5,3,100);
      // System.out.println(sal02);
      // System.out.println(positionSearch(sal02,3));
      // System.out.println("\n"+"sal03"+":");
      // ArrayList sal03 = randomAlTwo(5,0,100);
      // System.out.println(sal03);
      // System.out.println(positionSearch(sal03,3));
      // System.out.println("\n"+"sal04"+":");
      // ArrayList sal04 = randomAlTwo(20,0,3);
      // System.out.println(sal04);
      // System.out.println(positionSearch(sal04,3));
      // System.out.println("\n"+"sal05"+":");
      // ArrayList sal05 = randomAlTwo(20,1,5);
      // System.out.println(sal05);
      // System.out.println(positionSearch(sal05,3));


      // System.out.println("\n"+"al"+":");
      // ArrayList al = randomAlOne(,0,100);
      // System.out.println(al);

    }//end main()


    //search for an int target in ArrayList al and returns the first found position of the target
    public static int positionSearch( ArrayList al, int target ){

      for( int pos = 0; pos < al.size(); pos += 1) {
        if (al.get(pos).equals(target))
          return pos;
      } //end for loop
      return -1;
    }//end positionSearch()


    //returns an ArrayList of random numbers from int lo (inc) to lo + hi (excl)
    public static ArrayList randomAlOne(int numItems, int lo, int hi){

      ArrayList retArr = new ArrayList();

      for(int i = 0; i < numItems; i += 1) {
        //System.out.println(i);  //diagnostic under-the-hood view
        //retArr.add( Math.random() ); // [0,1)
        //retArr.add( (int)Math.random() ); //0
        //retArr.add( (int)(hi * Math.random()) ); // [0,rnd)
        retArr.add( lo + (int)(hi * Math.random()) ); // [lo, rnd)
      } //end for loop
      return retArr;
    }//end randomAlOne()


    //returns ArrayList of numbers based on the originally selected number
    public static ArrayList randomAlTwo(int numItems, int lo, int hi){

      ArrayList retArr = new ArrayList();

      //if no items, then return the empgy arr.
      if (numItems < 1){
        return retArr;
      }
      //add a number between 0 and lo
      retArr.add( (int)(lo * Math.random()) );

      //add a random # greater than/equal to previous index value
      for(int i=1; i<numItems; i++) {
        //System.out.println(i);  //diagnostic under-the-hood view
        //retArr.add( Math.random() ); // [0,1)
        //retArr.add( (int)Math.random() ); //0
        //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
        //retArr.add( lo + (int)(hi * Math.random()) ); // [lo , lo + hi)
        //System.out.println(retArr.get(i-1));  //diag.
        retArr.add( (int)retArr.get(i-1) + lo + (int)(hi * Math.random()) ); //value of previous element + lo + hi (excl)
      } //end for loop

      return retArr;
    }//end randomAlTwo()



}//end Foogle class
