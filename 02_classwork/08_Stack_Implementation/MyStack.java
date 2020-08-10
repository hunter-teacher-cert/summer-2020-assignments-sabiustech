import java.io.*;
import java.util.*;

public class MyStack {

      private ArrayList<String> stack; //instance variable of string arrayList

      public MyStack(){
          stack = new ArrayList<String>(); //create arrayList object
      } //end constructor method


      //Size methods

      public int size() {
          return stack.size(); //number of items on the stack
      } //end size method

      public boolean isEmpty(){
          return stack.size() == 0;  //returns true if the arrayList has no length
      } //end isEmpty method



      //Push (add), Pop (remove), and Peek (add w/out remove)

      public void push(String data) {
          stack.add(0, data); //add data to the head of the stack (top = 0 index)
          //System.out.println("Item successfully added to the top of the stack! \n");
      }//end push method


      public String pop(){
          if(this.isEmpty()) //check if index is empty
            throw new IndexOutOfBoundsException("Nothing available to remove!\n");
            //if true, throw exception
          return stack.remove(0); //remove the item at the top of the stack
      } //end pop method


      public String peek(){
        if(stack.size() == 0){ //check if there are no itmes
          throw new IndexOutOfBoundsException("Nothing available to build stack!\n");
          //if true, throw exception
        } else {
        return stack.get(0); //returns item on top of stack w/o removing item like pop
        } //end if else statement
      } //end peek Method


      //print to see itmes

      public String toString() {
        if(this.isEmpty()){   //check to see that stack is not empty
          return "404: Empty stack! \n"; //return message
        } else {
          String print = "";
          for(String go : stack){ //add each item to print
            print += go + "\n";
          } //end for loop
          return print; //return complete string
        } //end if else statement
      } //end toString method
} //end MyStack class
