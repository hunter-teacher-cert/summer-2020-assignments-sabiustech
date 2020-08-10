import java.io.*;
import java.util.*;

public class Craps {


      public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);  //create new scanner object

        System.out.print("Welcome to ULTIMATE CRAPS!\n\nHow many rounds do you want to play? ");  //ask how many rounds user wants to play
        int numRounds = userInput.nextInt();
        System.out.println();

        int numWins = 0;    //set wins count to 0

        for (int i = 0; i < numRounds; i += 1) {

          System.out.printf("\nRound Number: " + (i + 1) + "\n---------------\n");  //indicate the round number to distinguish each set of results

          if(round()){            //check if round method returned a true value
            numWins++;            //if true, increment wins count
          } //end if statement

        }  //end for loop

      } //end main method




      //ROLL METHOD
      /**
      * A method that takes in an integer and returns a random number
      *
      * @param x an integer
      * @return a random number between 1 and that number, incl.
      */

    	public static int roll (int x) {

        int num = (int) (Math.random() * x); //generate a random number, cast it, and store in variable.
    		return num + 1; //return num and add 1 to make it inclusive

    	} //end roll method


      //SHOOT METHOD
      /**
      * A method that accepts two parameters and returns the result of rolling the dice
      *
      * @param diceRolls number of dice
      * @param maxValue maximum value of the dice
      * @return total value of dice roll
      */

      public static int shoot (int diceRolls, int maxValue) {

        int total = 0;  //initialize total to 0

        System.out.print("\nRoll: ");
        for (int i = 0; i < diceRolls; i += 1) {     //for each roll of the dice

          int rollValue = roll(maxValue);            //store each value
          System.out.print(rollValue + " ");         //print each value
          total += rollValue;                        //add values to total

        } //end for loop

        return total;

      } //end shoot method




      //ROUND METHOD
      /**
      * A method that returns whether the player has one or lost
      *
      * @return true for win or false for lose
      */

    	public static boolean round () {

    		int sum = shoot(2, 6);

    		if (sum == 2 || sum == 3 || sum == 12) { //check for a craps situation

          System.out.println("You got " + sum + ". Result: CRAPS!");
          System.out.println("You lose this round! Maybe you'll be luckier next time!"); //inform user
    			return false; //return false to indicate loss

    		} else if (sum == 7 || sum == 11) {  //check for a natural situation

          System.out.println("You got " + sum + ". Result: NATURAL!");
          System.out.println("You have some real skills! You win this round!");
    			return true; //return true to indicate win

    		} else {

    			System.out.println("You got " + sum +", which means you got point.  TRY AGAIN!!!"); //inform user of point situation

          while(true){

            int sumTwo = shoot(2,6);                                      //shoot again

            if(sumTwo == sum){                                            //check if this result is equal to original result
              System.out.println("You got " + sumTwo + ". YOU WIN!!!");   //let user know they won
              return true;                                                //return true to increment win count
            } //end if statement

            if(sumTwo == 7){                                              //check if the second result is 7
              System.out.println("You got " + sumTwo + ". YOU LOSE!!!");  //if true let user know they lost
              return false;                                               //return false so win count does not increment
            } //end if statement

            System.out.println("You got " + sumTwo + ". Please shoot again!"); //let user know what they got and tell them you are rolling again
          } //end while loop

    		}//end else statement
    	} //end round method


}  //end craps class
