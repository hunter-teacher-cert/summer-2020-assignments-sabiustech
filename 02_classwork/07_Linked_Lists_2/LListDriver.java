import java.io.*;
import java.util.*;

public class LListDriver {


    public static void main(String[] args) {

        LList g = new LList();  //create new linked list g


        //Tests
        System.out.println("Test Empty list print & isEmpty:");
        System.out.println(g);  //print list
        System.out.println(g.isEmpty()); //print boolean test
        System.out.println("Length = " + g.length()); //print length


        System.out.println("\nTest addFront 3x & isEmpty():");
        g.addFront("good");   //add string data to head
        g.addFront("news");   //now add this string data to head
        g.addFront("everyone!"); //now add this string data to head
        System.out.println(g);  //print list
        System.out.println("Length = " + g.length()); //print list length

        System.out.println(g.isEmpty()); //print boolean test

        System.out.println("\nTest get 0, 1, 5:");
        System.out.println(g.get(0)); //print first object
        System.out.println(g.get(1)); //print second object
        try{
          System.out.println(g.get(5)); //try to print sixth object
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Error. There is no object at this index location."); //print message
        }//end try catch


        System.out.println("\nTest set 0, 1, 5:");
        g.set(0, "me!"); //update first object
        g.set(1, "job"); //update second object
        try{
          g.get(5); //update  sixth object
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Error. There is no object at this index location."); //print message
        } //end try catch
        g.set(5, "wow"); //update sixth object
        System.out.println(g); //print current list

        System.out.println("\nTest insert 0, 2, 5, 10:");
        g.insert(0, "woo!"); //insert new string data in head
        System.out.println(g); //print current list
        System.out.println("Length = " + g.length()); //print length


        g.insert(2, "go");   //insert new string data as third object
        System.out.println(g); //print current list
        System.out.println("Length = " + g.length()); //print list length


        g.insert(5, "cool"); //insert new string data as sixth object
        System.out.println(g); //print current list
        System.out.println("Length = " + g.length()); //print current length
        try{
          g.insert(10, "too far"); //insert new string data as eleventh object
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Error. Unable to insert data at non-existent index location."); //print message
        } //end try catch

        System.out.println(g); //print current list
        System.out.println("Length = " + g.length()); //print current list length


        System.out.println("\nTest search \"woo!\", \"cool\", \"too far\"");
        System.out.println(g.search("woo!")); //print object index of this string data
        System.out.println(g.search("cool")); //print object index of this string data
        System.out.println(g.search("too far")); //print object index of this string data (does not exist so returns -1)

        System.out.println("\nTest remove 0, 2:");
        g.remove(0); //remove head
        System.out.println(g); //print list
        System.out.println("Length = " + g.length()); //print list length


        g.remove(2); //remove third object from list
        System.out.println(g); //print list
        System.out.println("Length = " + g.length()); //print list length

    }//end main method
}// end LListDriver class
