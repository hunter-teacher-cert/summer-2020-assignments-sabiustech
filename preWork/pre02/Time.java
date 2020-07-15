import java.io.*;
import java.util.*;

public class Time{

    public static void main(String[] args) {


      //Q1. functional initial program
      System.out.println("My time program...\n");



      //Q2. declare & assign variables
      int hour = 15;
      int minute = 45;
      int second = 25;
      int time = 60;

      //display current Time
      System.out.println("The current time is: " + hour + ":" + minute + ":"+ second + "\n");




      //Q3. calculae hours, minutes, and seconds, since midnight
      int hourSince = hour * (time * time);
      int minuteSince = minute * time;

      //calculate total time
      int totalTimeSince = hourSince + minuteSince + second;

      //display result
      System.out.println("There have been  " + totalTimeSince + " seconds since midnight!\n");




      //Q4. calculate hours, minutes, and seconds to midnight
      int hourTo = (24 - hour) * (time * time);
      int minutesTo = (time - minute) * time;
      int secTo = time - second;

      //add values
      int totalTimeRemain = hourTo + minutesTo + secTo;

      //display result
      System.out.println("There are  " + totalTimeRemain + " seconds remaining in the day!\n");




      //Q5. number of seconds in a day &  original time data (dobule)
      double timez = 60.0;
      double hourDouble = 15.0;
      double minuteDouble = 45.0;
      double seconDouble = 25.0;
      double totalSecInDay = 24.0 * (timez * timez);
      double totalSecD = (hourDouble * (timez * timez)) + (minuteDouble * timez) + seconDouble;

      //calculate percentage
      double finalTimePerc = (totalSecD/totalSecInDay) * 100.00;

      //display result
      System.out.printf("The total percentage of the day that has elapsed is:  %.2f", finalTimePerc );




      //Q6. declare & assign variables
      int hourNew = 16;
      int minuteNew = 30;
      int secondNew = 15;

      //time calculations for new time
      int hourUpdate = hourNew * (time * time);
      int minuteUpdate = minuteNew * time;

      //calculate total values
      int totalTimeUpdate = hourUpdate + minuteUpdate + secondNew;

      //display result
      System.out.println((totalTimeUpdate - totalTimeSince) + " seconds have elapsed since I started this assingment!\n");
    }

} //end
