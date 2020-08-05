import java.io.*;
import java.util.*;

public class Boogle{

//keep getting this error and have no idea how to fix
//Note: Boogle.java uses unchecked or unsafe operations.
//Note: Recompile with -Xlint:unchecked for details.

  public static void main( String[] args )
    {
      Scanner input = new Scanner(System.in);
      int counter = 0;
      while(true){

        int num = (int)(Math.random() * 11);

        ArrayList<Integer> newList = prestoSortedArrayListo(num, 0, 20);
        int target = (int)(Math.random() * 20);

        //print results
        System.out.println(" Test #: " + counter);
        System.out.println(newList);
        System.out.println("Target: " + target);
        System.out.println("linSearch: " + linSearch(newList, target));
        System.out.println("binSearch: " + binSearch(newList, target));
        System.out.println("binSearch (recursion): " + binSearchRecur(newList, target,0,20));


        System.out.println("\nEnter to run more tests or 'q' to quit");
        String ans = input.nextLine();
        if(ans.equals("q")){
          break;
        }
        counter+=1;
      }//end while loop
    }//end main



      //return index of first occurence of target, or -1 if not found
      public static int linSearch( ArrayList al, int target ){

        for( int pos = 0; pos < al.size(); pos += 1){
          if (al.get(pos).equals(target))
            return pos;
        } //end for loop
        return -1; //to avoid berzerk
      }//end linSearch method


      //return index of target, or -1 if not found
      public static int binSearch( ArrayList al, int target ){

        int lo = 0;
        int hi = al.size() - 1;
        int mid = (lo + hi) / 2;

        while (lo <= hi){
          if((int)al.get(mid) == target){
            return mid;
          } else if((int)al.get(mid) < target){
            lo = mid + 1;
            mid = (hi + lo) / 2;
          } else {
            hi = mid -1;
            mid = (hi + lo) / 2;
          } //end if else statement
        } //end while loop
        return -1;
      } //end binSearch method


      //return index of target, or -1 if not found
      public static int binSearchRecur(ArrayList al, int target, int lo, int hi){

          if (lo > hi){
            return -1;
          } else {
            int mid = (lo + hi) / 2;

            if((int)al.get(mid) == target){
              return mid;
            } else if ((int)al.get(mid) <  target){
              return binSearchRecur(al, target, mid + 1, hi);
            } else {
              return binSearchRecur(al, target, lo, mid - 1);
            } //end internal if else
          } //end if else
        } //end binSearchRecur


      //return ArrayList of random ints on range [lo,lo+hi)
      public static ArrayList prestoArrayListo(int numItems, int lo, int hi){

        ArrayList retArr = new ArrayList();

        for(int i = 0; i < numItems; i += 1) {
          retArr.add(lo + (int)(hi * Math.random()));
        } //end for loop
        return retArr;
      }//end prestoArrayListo method


      //return ArrayList of random ints, sorted in ascending order
      public static ArrayList prestoSortedArrayListo(int numItems, int lo, int hi){

        ArrayList retArr = new ArrayList();

        if (numItems < 1){
          return retArr;
        } //end if statement

        //populate index 0
        retArr.add( (int)(lo * Math.random()) );

        //populate rest of indices, each one greater than last
        for(int i = 1; i < numItems; i += 1) {
          retArr.add( (int)retArr.get(i-1) + lo + (int)(hi * Math.random()));
        } //end for loop
        return retArr;
      }//end prestoSortedArrayListo method


      /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
    System.out.println("\n"+"al000"+":");
    ArrayList al000 = prestoArrayListo(0,0,0);
    System.out.println(al000);
    System.out.println(linSearch(al000,3));
    System.out.println("\n"+"al01"+":");
    ArrayList al01 = prestoArrayListo(5,0,100);
    System.out.println(al01);
    System.out.println(linSearch(al01,3));
    System.out.println("\n"+"al02"+":");
    ArrayList al02 = prestoArrayListo(5,3,10);
    System.out.println(al02);
    System.out.println(linSearch(al02,3));
    System.out.println("\n"+"al05"+":");
    ArrayList al05 = prestoArrayListo(20,1,5);
    System.out.println(al05);
    System.out.println(linSearch(al05,3));
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


    // test battery using sorted ArrayLists as search space
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
    System.out.println("\n"+"sal000"+":");
    ArrayList sal000 = prestoSortedArrayListo(0,0,0);
    System.out.println(sal000);
    System.out.println(linSearch(sal000,3));
    System.out.println(binSearch(sal000,3));
    System.out.println("\n"+"sal00"+":");
    ArrayList sal00 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal00);
    System.out.println(linSearch(sal00,3));
    System.out.println(binSearch(sal00,3));
    System.out.println("\n"+"sal01"+":");
    ArrayList sal01 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal01);
    System.out.println(linSearch(sal01,3));
    System.out.println(binSearch(sal01,3));
    System.out.println("\n"+"sal02"+":");
    ArrayList sal02 = prestoSortedArrayListo(5,3,100);
    System.out.println(sal02);
    System.out.println(linSearch(sal02,3));
    System.out.println(binSearch(sal02,3));
    System.out.println("\n"+"sal03"+":");
    ArrayList sal03 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal03);
    System.out.println(linSearch(sal03,3));
    System.out.println(binSearch(sal03,3));
    System.out.println("\n"+"sal04"+":");
    ArrayList sal04 = prestoSortedArrayListo(20,0,3);
    System.out.println(sal04);
    System.out.println(linSearch(sal04,3));
    System.out.println(binSearch(sal04,3));
    System.out.println("\n"+"sal05"+":");
    ArrayList sal05 = prestoSortedArrayListo(20,1,5);
    System.out.println(sal05);
    System.out.println(linSearch(sal05,3));
    System.out.println(binSearch(sal05,3));
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

}//end Boogle class
