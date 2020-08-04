import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args)
    {
      Time newTime1 = new Time();    //create new time object with no parameters
      Time newTime2 = new Time(11, 59, 59.9); //create new time object with parameters

      System.out.println(newTime2);  //print newTime2 value
      Time.printTime(newTime2);      //call printTime method with newTime2 as actual parameter

      Time time1 = new Time(7, 15, 0.9);  //create new time object with parameters
      Time time2 = time1;                 //assign time1 to time2
      Time time3 = new Time(7, 15, 0.9);  //create new time object with parameters

      System.out.println("time1.equals(time3): " + time1.equals(time3));  //print boolean
      System.out.println("time1 == time3: " + (time1 == time3));          //print boolean

      Time startTime = new Time(14, 45, 0.0);     //create new object and assign to startTime
      Time runTime = new Time(5, 12, 0.0);        //create new object and assin to runtime
      Time endTime1 = Time.add(startTime, runTime); //assing return of add to endTime1

      System.out.println("Start: " + startTime);      //print startTime
      System.out.println("Run Time: " + runTime);     //print runTime
      System.out.println("End: " + endTime1);         //print endTime

      Time endTime2 = startTime.add(endTime1);        //assingn return to endTime2

      System.out.println("End2: " + endTime1);        //print end2
    }
}
