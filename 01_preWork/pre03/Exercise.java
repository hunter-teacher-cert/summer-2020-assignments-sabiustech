import java.io.*;
import java.util.*;


public class Exercise {

    public static void zoop() {  //second method to run
        baffle(); //calls baffle method
        System.out.print("You wugga "); //prints "you wugga "
        baffle(); //calls baffle method for a second time
    } //end zoop method

    public static void main(String[] args) { //first method to run
        System.out.print("No, I "); //prints "No, I"
        zoop();                     //calls zoop
        System.out.print("I "); //prints "I "
        baffle(); //calls baffle method
    } //end main method

    public static void baffle() {//third method to run
        System.out.print("wug"); //prints "wug"
        ping(); //calls ping method

    } //end baffle method

    public static void ping() {
        System.out.println("."); //prints a period

    }  //end ping method

} //end Exercise class
