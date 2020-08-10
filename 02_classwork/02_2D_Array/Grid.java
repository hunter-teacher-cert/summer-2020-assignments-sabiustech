import java.io.*;
import java.util.*;


public class Grid{


      public static void main(String[] args) {

          start();

      }  //end main method





      public static void start(){

          Scanner userInput = new Scanner( System.in );
          System.out.println( "Which method would you like to run? \n1. rowPop \n2. colPop \n3. invert \n4. diagonal " );
          int selection = userInput.nextInt(); //store integer in variable

          if (selection == 1 ){

            Scanner input = new Scanner( System.in );
            System.out.println( "Enter the row you wish to alter: " );
            int rowCol = input.nextInt(); //store integer in variable

            System.out.println( "Enter the value you wish to input into the row: " );
            int value = input.nextInt(); //store integer in variable

            int [] [] myArray  =  new int [20] [20];  //create 2D array with 20 columns and 20 rows

            rowPop(myArray, rowCol, value);  //call rowPop with row to be altered and value to be inputed

            print2d(myArray);         //use provided print2d method to print the array

            restart();                //call restart method to offer ability to run more tests on other methods


          } else if (selection == 2 ) {

            Scanner input = new Scanner( System.in );
            System.out.println( "Enter the column you wish to alter: " );
            int rowCol = input.nextInt(); //store integer in variable

            System.out.println( "Enter the value you wish to input into the row: " );
            int value = input.nextInt(); //store integer in variable

            int [] [] myArray  =  new int [20] [20]; //create 2D array with 20 columns and 20 rows

            colPop(myArray, rowCol, value);  //call rowPop with row to be altered and value to be inputed

            print2d(myArray);         //use provided print2d method to print the array

            restart();                //call restart method to offer ability to run more tests on other methods


          } else if (selection == 3 ) {

            int [] [] myArray  =  new int [20] [20];  //create 2D array with 20 columns and 20 rows

            invert(myArray);  //call method with array to be inverted

            print2d(myArray);         //use provided print2d method to print the array

            restart();                //call restart method to offer ability to run more tests on other methods


          } else if (selection == 4 ){

            Scanner input = new Scanner( System.in );
            System.out.println( "Enter the row on which you wish to begin: " );
            int row = input.nextInt(); //store integer in variable

            System.out.println( "Enter the column on which you wish to begin: " );
            int col = input.nextInt(); //store integer in variable

            System.out.println( "Enter the direction you wish to go (\n0-Up/Left \n1-Up/Right \n2-Down/Left \n3-Down/Right): " );
            int dir = input.nextInt(); //store integer in variable

            System.out.println( "Enter the value you wish to input: " );
            int value = input.nextInt(); //store integer in variable

            int [] [] myArray  =  new int [20] [20];  //create 2D array with 20 columns and 20 rows

            diagonal(myArray, row, col, dir, value);  //call rowPop with row to be altered and value to be inputed

            print2d(myArray);         //use provided print2d method to print the array

            restart();                //call restart method to offer ability to run more tests on other methods

          } else {
            System.out.println("You must make an appropriate selection. Please try again.");
            start();
          }

            System.out.println("Have a nice day!");
      }




      public static void rowPop(int[][] d2, int r, int value){

          for(int c = 0; c < d2[r].length; c += 1){      //for each column in row r insert the value from the actual argument
            d2 [r] [c] = value;
          //array [1] [c]

          }  //end c for loop
      } //end rowPop method




      public static void colPop(int[][] d2, int c, int value){

          for(int r = 0; r < d2.length; r += 1){      //for each row in column c insert the value from the actual argument
            d2 [r] [c] = value;
          }  //end r for loop
      } //end colPop method





      public static void invert(int[][] d2){

        for(int r = 0; r < d2.length; r += 1){
          for(int c = 0; c < d2[r].length; c += 1){
            if(d2 [r] [c] == 0){                      //check if the value is 0
              d2 [r] [c] = 255;                       //if so, change that value to 255
            } else {
              d2 [r] [c] = 0;                         //if not, all other values change to 0
            } //end if else
          } //end c for loop
        } // end r for loop
      } //end invert method





      public static void diagonal(int[][]d2, int r, int c, int direction, int value){

          int upDown = 0;         //initialize vertical value to 0
          int sideWays = 0;       //initialize horizontal value to 0

          if(direction  == 0 || direction == 1){      //test if direction value is 0 or 1
            upDown = -1;                              //if true update upDown value to -1
          } else {
            upDown = 1;                               //if false update upDown value to 1 (if direction is 2 or 3, updown =1)
          } //end if/else statment


          if(direction  == 0 || direction == 2){      //test if direction value is 0 or 2
            sideWays = -1;                            //if true update sideWays value to -1
          } else {
            sideWays = 1;                             //if false update sideWays value to 1 (if direction is 1 or 3, sideWays = 1)
          } //end if/else statment


          int row = r;                                //store actual parameter r in row
          int col = c;                                //store actual parameter c in col

          for(int d = 0; row >= 0 && col >= 0 && row < d2.length && col < d2[row].length; d += 1){

            d2[row][col] = value;   //replace the value at this row with the actual parameter value value
            row += upDown;          //update row number
            col += sideWays;        //update column number

          }  //end d for loop

      }  //end diagonal method





      public static void print2d(int[][] d2) {              //stolen from gitHub

          for (int r=0; r < d2.length; r++) {
            for (int c=0; c < d2[r].length; c++) {

              System.out.printf("%03d ", d2[r][c]);
            } //end c for

              System.out.println();
          }//end r for
      }//end print2d




      public static void restart() {

        Scanner input = new Scanner( System.in );
        System.out.println( "\nWould you like to try another method? y/n" ); //to allow for multiple tests, ask user if they want to try another method
        input.nextLine(); //clear the value in memory
        String restart = input.nextLine(); //store string data in variable
        System.out.println();

        if (restart.equals( "y" )){ //test variable to determine control flow output
          start();

        } else {
          System.out.println( "Thanks for testing this program!" );
        }

      }  //end restart method


} //end Grid class
