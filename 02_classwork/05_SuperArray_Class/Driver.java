import java.io.*;
import java.util.*;


public class Driver{

    public static void main(String[] args) {

      SuperArray  tester = new SuperArray();
      System.out.println(tester);
      for (int i = 0; i < 20; i +=1){
        tester.add(i);
      }
      tester.add(5, 100);
      System.out.println(tester);

      tester.remove(5);
      System.out.println(tester);

    }

}
