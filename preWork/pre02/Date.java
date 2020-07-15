import java.io.*;
import java.util.*;

public class Date { //should this be public Date or public class Date?


    public static void main(String[] args){

      //tester code to ensure program works
      System.out.print("Hello, World! ");
      System.out.println(" (again)");

      String day, date, month; //declare similar data types simultaneously
      int year = 2020;
      day = "Monday";
      date = "29";
      month = "June";

      //print space in between
      System.out.println();

      //display value of each variable on a line by itself
      System.out.println(day);
      System.out.println(date);
      System.out.println(month);
      System.out.println(year);

      //print space in between
      System.out.println();

      //display concatenated output (standard American format)
      System.out.println("Today's date is " + day + ", " + month + " " + date + ", " + year);

      //print space in between
      System.out.println();

      //display concatenated output (standard American format)
      System.out.println("American format: \n" + day + ", " + month + " " + date + ", " + year);

      //print space in between
      System.out.println();

      //display concatenated output (standard American format)
      System.out.print("European format: \n" + day + " " + date + " " + month + " " + year);

      

    }


}
