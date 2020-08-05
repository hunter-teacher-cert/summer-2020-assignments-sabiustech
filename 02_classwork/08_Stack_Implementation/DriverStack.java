import java.io.*;
import java.util.*;

public class DriverStack {

    public static void main(String[] args){


        MyStack newStack = new MyStack(); //create a new stack


        Scanner choice = new Scanner (System.in);
        System.out.println("Please select the method you would like to test: \n\n1. push \n2. pop \n3. peek\n");
        String num = choice.nextLine(); //store integer in variable


        if(num.equals( "1" )){
          while(true){
              Scanner userInput = new Scanner (System.in);

              System.out.println("To run push again, press Enter. \nEnter 'Q' to Exit Program.");
              if(userInput.nextLine().toLowerCase().equals("q")){   //make q lowercase to avoid issues
                break; //break while loop when 'q' is entered
              }
              System.out.println("Please enter the string you want to push to the stack: ");
              String ans = userInput.nextLine();
              newStack.push(ans);
              System.out.println(newStack);
          } //end while loop

          System.out.println( "Here what is in the stack: \n" + newStack);

          Scanner userPop = new Scanner (System.in);
          System.out.println("Would you like to pop any items? ");
          String answer = userPop.nextLine();

          if(answer.equals( "y" )){
            System.out.println(newStack.pop());
            System.out.println( "Here what is in the stack: \n" + newStack);
          } else {
            System.out.println("Thank you for testing!");
          }
          System.out.println("Have a nice day!");
        } //end num if statement



        if(num.equals( "2" )){
          while(true){
              Scanner userInput = new Scanner (System.in);

              System.out.println("To run pop again, press Enter. \nEnter 'Q' to Exit Program.");
              if(userInput.nextLine().toLowerCase().equals("q")){   //make q lowercase to avoid issues
                break; //break while loop when 'q' is entered
              }
              System.out.println(newStack.pop());
          } //end while loop

          System.out.println( "Here what is in the stack: \n" + newStack);
        } //end num if statement


        if(num.equals( "3" )){

          newStack.push("You");
          newStack.push("are");
          newStack.push("awesome");

          System.out.println(newStack.peek());
          System.out.println(newStack.peek());
          System.out.println(newStack.peek());

          System.out.println( "Here what is in the stack: \n" + newStack);
        } //end num if statement

    } //end main method





        // /* Testing pop*/
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // /* This should print me! push Don't" */
        //
        // //Should throw an exception when uncommented.
        // // System.out.println(s.pop());
        //
        // //Should throw an exception when uncommented.
        // // System.out.println(s.top());
        //
        // /* Add some more words to the stack */
        // s.push("yoink");
        // s.push("yeet");
        // s.push("boomer");
        // s.push("meme words");
        // System.out.println(s);
        //
        // /* Test top */
        // System.out.println(s.peek());
        // System.out.println(s.peek());
        // /* Should print meme words twice*/


} //end DriverStack class
