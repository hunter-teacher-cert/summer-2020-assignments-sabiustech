import java.io.*;
import java.util.*;


public class LList {


      private Node head;
      private int length;


      // create an empty linked list
      public LList() {
          head = null; //no value at head
          length = 0;  //since empty, no length
      } //end constructor


      // creates an object (node) that will be placed at head
      public void addFront(String data){
          Node newN = new Node(data, head); //create new Node
          head = newN; //point node to front
          length++; //update length instance variable to indicate list is no longer empty, etc.
      } //end addFront method


      //return the lenght of the list
      public int length() {
          return length;
      }//end length method


      // Returns true if the list is empty
      public boolean isEmpty() {
          return head == null;
      } //end isempthy method



      // Returns the value (not the Node) at index.
      // If index is out of bounds, return null.
      public String get(int index) {

          int first = 0; //head

          Node pointer = head;

          while (pointer != null && first != index){ //while within the list, or until index is identified
            first += 1;         //go to the next node
            pointer = pointer.getNext();
          } //end while loop

          if(pointer != null){        //if a node is present
            return pointer.getData(); //return string data in that index
          } else {
            return null;              //if false, return null value
          }//end if statement

      } //end get method



      //insert node in a specific index with specific string data
      public void insert(int index, String value) {
          Node oldIndex;

          if (index == 0) { //if the index provided is 0, re-add the value to the head
              addFront(value);
          } //end if statement

          oldIndex = getNode(index - 1); //search to get the index prior to the one desired
          if(oldIndex == null){ //if the index is out of bounds, escape method
            return;
          } //end if statment

          Node newNode = new Node(value, oldIndex.getNext()); //create new node
          oldIndex.setNext(newNode); //set new node in the indicated index
          length++; //adjust the length of the list after the insertion.
        }  // end insert method (got help from classmate with this method)



        // Removes the Node at index from the list &
        // Returns the String at that node if it existed
        // If index is invalid, do nothing.
        public String remove(int index) {
            Node prev;
            String oldData = null;

            // Special case if index is 0. If head is null
            // return null. Otherwise, get the node's data
            // then point head to node's next.
            if (index == 0) {
                if (head != null) {
                    oldData = head.getData();
                    head = head.getNext();
                    length--;
                }

                return oldData;
            }  // end special case

            // Strategy: Traverse LList up to index - 1.
            // If tmp == null, index is invalid. Else,
            // remove data from tmp.next if it's not null.
            // Point tmp to tmp.next.next.
            prev = getNode(index - 1);
            if (prev == null)
                return null;

            Node cur = prev.getNext();
            if (cur != null) {
                oldData = cur.getData();
                prev.setNext( cur.getNext() );
                length--;
            }

            return oldData;
        }  // end remove method  (got help from classmate on this one)



        // Returns a String representation of the list
        public String toString(){
            String s = "";
            Node tmp = head;

            // avoids space at the end
            if (tmp != null) {
                s = tmp.getData();
                tmp = tmp.getNext();
            } //end if statement

            while (tmp != null){
                s += " " + tmp.getData();
                // how can we now move tmp to the next node
                // this is the magic linked list idiom!!!!
                // this moves a pointer to the next node!!!
                // It's analagous to i=i+1 for an array (for loop)
                tmp = tmp.getNext();
            } //end while loop

            s = "<" + s + ">";
            return s;
        }  //end toString method


        //returns specific node at specific index as long as index not null
        private Node getNode(int index) {
            Node temp = head;
            for(int i = 0; i < index && temp!= null; i += 1) {
                temp = temp.getNext();
            }
            if( temp != null){
              return temp;
            } else {
              return null;
            }//end if else statement
        }  // end getNode method


        // Returns the index of the first time key occurs in the list.
        public int search(String key) {
            Node tmp = head;
            for (int i=0; tmp!=null; i++) {
                if ( tmp.getData().equals(key) )
                    return i;

                tmp = tmp.getNext();
            } //end i for loop

            return -1; // Returns -1 if key is not found.
        }  //end search method



        // Set the Node at index to contain value.
        // Returns value currently at index
        // If index is invalid, do nothing.
        public String set(int index, String value) {
            String s = null;  // return value

            if (index==0) {
                s = remove(0);
                addFront(value);
                return s;
            }

            Node prev = getNode(index-1);  // To point to node before index
            if (prev==null)  // invalid index
                return s;

            if (index < length) {  // node already exists
                Node cur = prev.getNext();
                s = cur.getData();
                cur.setData(value);
                return s;
            }

            prev.setNext( new Node(value) );  // node didn't exist
            length++;
            return s;
          } //end set method





































































} //end LList class
