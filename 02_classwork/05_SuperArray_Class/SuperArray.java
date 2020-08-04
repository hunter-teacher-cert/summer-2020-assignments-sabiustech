import java.io.*;
import java.util.*;


public class SuperArray {

    //instance variables
    private int[] data; //will hold new array object
    private int numberElements; //will hold integer value


    //constructor with no parameters
    public SuperArray(){

      data = new int [10]; //create new array object with 10 indexes
      numberElements = 0; //initialize numberElements to 0
    } //end constructor 1



    //constructor with int parameter
    public SuperArray(int newNum){

      data = new int [newNum]; //create new array object with newNum indexes
      numberElements = 0; //initialize numberElements to zeor
    } //end constructor 2



    //method to new value to array index
    private void addStuff(int newVal){

      data[numberElements] = newVal; //adding new value to specific index of array
      numberElements += 1; //after adding value, the count of elements (also length) will be increased by 1
    } //end addStuff



    //method to add new value to array AND grow the array if necessary
    public void add(int value){

      if(numberElements!= data.length){  //Checks to see if the array is NOT full
        addStuff(value); //if not full, add a value to end of array
      } else {
        grow(); //if the array is full, then call grow function
        addStuff(value); //After calling the grow function call addStuff
      }
    }  //end add



    //method reports the value/element in an index
    public int get(int index) {

      if(index >= data.length){ //checks to see if the index value provided exceeds the capacity of the array.
        return -1; //if it does return -1
      }else{
        return data[index]; //if it does not, then return the element / value
      }
    } //end get


    //method to check if the array is empty
    public boolean isEmpty(){

      if(numberElements == 0){ //checks to see if no elements have been added to array
        return true; //returns true if condition is met
      }else{
        return false; //returns false if condition is not met
      }
    }//end isEmpty



    //method to create a string representation of the array
    public String toString() {

      String viewableArray = ""; //initialize a string variable to store values in array

      for (int i=0; i<numberElements; i+=1){
        viewableArray += data[i] + " " ; //each element in the array will be added to the string variable separated by a space
      }
      return  viewableArray; //after loop runs, return the string variable
    } //end toString



    //method to create a new a rray and point it to original array variable
    private void grow(){

      int [] extendArray = new int [data.length * 2]; //create new new array object with a length twice that of the original array in data

      for(int i = 0; i < data.length; i += 1){
        extendArray[i] = data[i]; //copy each element in data to the corresponding index in extendArray
      }//end for loop
      data = extendArray; //point data to new array, extendArray
    } //end grow



    //overloaded add method with replacement feature
    public void add(int index, int value){

      if(index >= data.length){ //check if index entered is part of the array
        //do nothing
      } else{
        if(numberElements == data.length){ //is array already full?
          grow(); //expand array to double the length of the current array in data
        }
        for(int i = numberElements; i > index; i -= 1){ //start with the total # of elements, while the counter is less than the given index #, decrement counter by 1
          data[i] = data[i-1]; //for each index value in data (beginning at the end), insert/shift the element into the next (lower) index
        }
        data[index] = value; //insert the value the user provided into the specific index the user identified
        numberElements += 1; //increment the number of elements to reflect the addition
      }
    } //end add



    //method to remove an item from the array
    public void remove(int index) {

        for(int i = index; i < numberElements; i += 1){  //starting at the index provided, while the counter is less than the total number of elements, in the array, keep incrementing.
          data[i] = data[i + 1]; //insert each element in the current array (at current index plus one) into the array
        }
        numberElements -= 1; //since the array was reinitialized with all elements minus one, decrease the number elements by one to keep the count accurate
    } //end remove
    

} //end SuperArray class
