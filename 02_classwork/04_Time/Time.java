
import java.io.*;
import java.util.*;


public class Time{


      private int hour;         //hour instance variable
      private int minute;       //minute instance variable
      private double seconds;   //seconds instance varible



      public Time(){
        this.hour = 0;          //set class hour to 0
        this.minute = 0;        //set class minute to 0
        this.seconds = 0.0;     //set class seconds to 0.0
      } //end Time constructor



      public Time(int hour, int minute, double seconds){
        this.hour = hour;       //set class hour to actual parameter
        this.minute = minute;   //set class minute to actual parameter
        this.seconds = seconds; //set class seconds to actual parameter
      } //end Time overload constructor



      public int getHour(){
        return this.hour;       //return current hour value
      } //end getHour method



      public int getMinute() {
          return this.minute;   //return current minute value
      } //end getMinute method



      public double getSeconds(){
          return this.seconds;  //return current seconds value
      } //end getSeconds method



      public void setHour(int hour){
          this.hour = hour;     //update hour value
      }//end setHour method



      public void setMinute(int minute){
          this.minute = minute; //update minute value
      } //end setMinute method



      public void setSeconds(int seconds){
          this.seconds = seconds;  //update seconds value
      } //end setSeconds method



      public static void printTime(Time t){
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.seconds); //print string method to print object values
      } //end printTime method



      public String toString(){
        return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.seconds); //print string method to print object values
      } //end toString method



      public boolean equals(Time that){
        return this.hour == that.hour && this.minute == that.minute && this.seconds == that.seconds;  //return time values
      }  //end equals method



      public static Time add(Time t1, Time t2){
        Time sum = new Time();                  //new time object
        sum.hour = t1.hour + t2.hour;           //assign sum of two hour values to sum.hour
        sum.minute = t1.minute + t2.minute;     //assign sum of two minute values to sum.minute
        sum.seconds = t1.seconds + t2.seconds;  //assign sum of two seconds values to sum.seconds

        if (sum.seconds >= 60.0) {  //check if value is grater or equal to 60
            sum.seconds -= 60.0;    //if true, subtract 60 from value
            sum.minute += 1;        //if true, add one to minute value
        }  //end if statment

        if (sum.minute >= 60) {     //check if value is greater or equal to 60
            sum.minute -= 60;       //if true, subtract 60 from value
            sum.hour += 1;          //if true, add one to hour value
        } //end if statement

        return sum;                 //return updated sum
      } //end add



      public Time add(Time t2){
        Time sum = new Time();                    //create new time object
        sum.hour = this.hour + t2.hour;           //assign sum of two hour values to sum.hour
        sum.minute = this.minute + t2.minute;     //assign sum of two minute values to minute.hour
        sum.seconds = this.seconds + t2.seconds;  //assign sum of two seconds values to sum.seconds

        if (sum.seconds >= 60.0) {    //check if value is greater or equal to 60
            sum.seconds -= 60.0;      //if true, subtract 60 from value
            sum.minute += 1;          //if true, add one to minute value
        } //end if statement

        if (sum.minute >= 60) {       //check if value is greater or equal to 60
            sum.minute -= 60;         //if true, subtract 60 from value
            sum.hour += 1;            //if true, add one to hour value
        } //end if statement

        return sum;                   //return updated sum
      }  //end add

}//end Time class
