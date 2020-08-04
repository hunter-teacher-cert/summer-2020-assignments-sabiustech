import java.io.*;
import java.util.*;

public class Node {

    private String data;   //take in  string data
    private Node next;     //next item in node

    public Node(String data, Node next) {
        this.next = next; //set next to actual parameter
        this.data = data; //set data to actual parameter
    } //end constructor


    public Node(String data) {
        this.next = null; //set next to null or 0
        this.data = data; //set data to actual parameter
    } //end overload constructor


    public Node() {
        this.next = null; //set next to null or 0
        this.data = "";   //set data to empty string
    } //end overload constructor


    public void setData(String data) {
        this.data = data;   //update value of data
    } //end setData method


    public void setNext(Node next) {
        this.next = next;   //update next value of next node
    } //end setNext method


    public String getData() {
        return data;    //return current value of string data
    } //end getData method


    public Node getNext() {
        return next;  //return current value of next node
    } //end getNext method


    public String toString() {
        return this.data;   //return string representation of class data
    } //end toString method

}  //end node class
