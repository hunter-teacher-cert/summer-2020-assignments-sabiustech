
import java.io.*;
import java.util.*;

public class Guess {

    public static void main(String[] args) {

        //Exercise #4

        // pick a random number
        Random randomNum = new Random();
        int newNumber = randomNum.nextInt(100) + 1;

        //ask user to guess my number
        Scanner guess = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 0 and 100 \n(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int userGuess = guess.nextInt();
        System.out.printf("Your guess is: %d\n", userGuess);

        //inform them of their number and my newNumber
        System.out.printf("The number I was thining of is: %d\n", newNumber);

        //computation and displaying of the difference
        int diffGuess =  newNumber - userGuess;
        System.out.printf("You were off by: %d", diffGuess);

    } //end main

}//end Guess class
