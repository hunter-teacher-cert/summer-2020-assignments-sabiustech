import java.io.*;
import java.util.*;

public class Boogle{


      public static void main( String[] args ){

          Scanner input = new Scanner(System.in);
          int counter = 0;
          while(true){

            int num = (int)(Math.random() * 11);

            ArrayList <Integer> newList = prestoSortedArrayListo(num, 0, 20);
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
            counter += 1;
          }//end while loop
      }//end main



      //return index of first occurence of target, or -1 if not found
      public static int linSearch( ArrayList al, int target ){

        for( int pos = 0; pos < al.size(); pos += 1){
          if (al.get(pos).equals(target)){
            return pos;
          }//end if statement
        } //end for loop
        return -1; //to avoid berzerk
      }//end linSearch method



      //return index of target, or -1 if not found (recur)
      public static int binSearchRecur(ArrayList al, int target, int lo, int hi){

          if (lo > hi){ //left bigger than right
            return -1;
          } else {

            int mid = (lo + hi) / 2; //select the mid point
            //int mid = lo + ((hi - lo) / 2); //prevent integer overflow

            if((int)al.get(mid) == target){ //if we find the midpoint value
              return mid;
              } else if (target < (int)al.get(mid)) { //if target is on the left side of the mid value
              return binSearchRecur(al, target, lo, mid - 1); //target on left side, search there
              } else { //target then is on the right side, so
              return binSearchRecur(al, target, mid + 1, hi); //target on right side, search there
              }
          } //end main else statement
        } //end binSearchRecur



        //return index of target, or -1 if not found (iter)
        public static int binSearch( ArrayList al, int target ){

          int lo = 0; //left-most
          int hi = al.size() - 1; //right-most (array length - 1)

          while (lo <= hi){

            int mid = lo + ((hi - lo) / 2); //prevent integer overflow

            if((int)al.get(mid) == target){
              return mid;
              } else if(target < (int)al.get(mid)){
                hi = mid - 1;
              } else {
                lo = mid + 1;
            } //end if else statement
          } //end while loop
          return -1;
        } //end binSearch method



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

        //populate index 0 w/ rn
        retArr.add( (int)(lo * Math.random()) );

        //populate rest of indices, each one greater than last
        for(int i = 1; i < numItems; i += 1) {
          retArr.add( (int)retArr.get(i - 1) + lo + (int)(hi * Math.random()));
        } //end for loop
        return retArr;
      }//end prestoSortedArrayListo method

}//end Boogle class
