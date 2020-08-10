import java.io.*;
import java.util.*;

public class Cgol{


      public static void main(String[] args) {

          char[][] board;                     //create memory location for holding a 2D array named board
          board = createNewBoard(25,25);      //creating a new board object and storing in board
          printBoard(board);                  //print contents of board array
          georgeConway(board);                //generate conway board
          printBoard(board);                  //print conway board


          //fake animate (press any key except 'q' to generate consequtive generations)
          while(true){
              Scanner userInput = new Scanner (System.in);

              System.out.println("To see next generation, press Enter. \nEnter 'Q' to Exit Program.");
              if(userInput.nextLine().toLowerCase().equals("q")){   //make q lowercase to avoid issues
                break; //break while loop when 'q' is entered
              }
              board = generateNextBoard(board);  //generate next generation and store in board 2D char array
              printBoard(board);                 //print that new generation
          } //end while loop
      }  //end main Method



        /*
         create a new 2D array, fill it with '0'
         representing that the entire board is empty.
        */
       public static char[][] createNewBoard(int rows, int cols){

           char[][] board = new char[rows][cols];     //create a new 2D char Array
           for (int r = 0; r < rows; r++) {           //create each row & column
               for (int c = 0; c < cols; c++) {
                  board[r][c] = ' ';                  //insert ' ' into each cell of the board
               }
           }
           return board;                              //return newly created/populated board
        } //end createNewBoard method




       public static void printBoard(char[][] board){
           for (int r = 0; r < board.length; r++) {         //go through each row & column
               for (int c = 0; c < board[r].length; c++) {
                  System.out.printf("%c",board[r][c]);      //print out the character value in each cell of the board
               } //end c for loop
               System.out.println();                        //print empty line
           } //end r for loop
           System.out.println("\n\n------------------\n\n");  //end of the board
       } //end printBoard method




       /*
          Count and return the number of living neigbords around board[r][c]
          approach 1 - lots of if statements
          approach 2 - you can loop over the grid from board[r-1][c-1]
                       to board[r+1][c+1]
       */
       public static int countNeighbours(char[][] board, int r, int c){

            int count = 0;  //start live count @ 0

            //Edge Case Tests
            int rowStart = 0; //start row on edge
            int colStart = 0; //start column on edge

            if(r != 0){   //check that row is not at the edge
              rowStart = r - 1;
            }
            if(c != 0){   //check that column is not at the edge
              colStart = c - 1;
            }

            //Neighbor check (surrounding 9)
            for (int row = rowStart; row >= 0 && row < board.length && row <= r + 1; row += 1){
              for(int col = colStart; col >= 0 && col < board[row].length && col <= c + 1; col += 1){  //generalize to account for any size columns (not just 25)
                if (board[row][col] == 'X' && !(col == c && row == r)){    //if the cell is alive (has 'x') and it is not its own position, then
                  count += 1; //increase live neighbor count
                } //end if statement
              } //end col for loop
            } //end row for loops

            return count; //return total number of neighbors
          } //end countNeighbours method





          /*
            given a board and a cell, determine, based on the rules for
            Conway's GOL if the cell is alive ('X') or dead (' ') in the
            next generation.

           */
          public static char getNextGenCell(char[][] board,int r, int c){

            // calculate the number of living neighbors around board[r][c]
            int liveNeighbors = countNeighbours(board, r, c);

            // determine if board[r][c] is living or dead
            //    if living and 2 3 neighbors then remain alive
            //    if dead and 3 neighbors then become alive

            if (board[r][c] == 'X'){   //check for live neighbor
              if (liveNeighbors == 2 || liveNeighbors == 3){ //if the number of live neighbors around your posititon is either 2 or 3
                return 'X';  //return alive
              }
            } else { //dead condition to become alive
              if (liveNeighbors == 3){  //if the number of live neighbors is three
                return 'X';   //return alive
              }
            }
            return ' ';  //if none of the conditions are met, return dead
          }  //end getNextGenCell method






          /*
            scan the board to generate a NEW board with the
            next generation
          */
          public static char[][] generateNextBoard(char[][] board){
              char newBoard[][] = new char[25][25];   //create new char 2D array with 25 x 25

              // fill the new board
              for (int r = 0; r < board.length; r += 1){
                for (int c = 0; c < board[r].length; c += 1){
                  newBoard[r][c] = getNextGenCell(board, r, c); //populate each cell with data from new generation
                }  //end c for loop
              } //end r for loop
              return newBoard;
         } //end generateNextBoard





        public static void georgeConway(char [][] board){

           //start table with george conway image
           //head
           board[10][10] = 'X';
           board[10][11] = 'X';
           board[10][12] = 'X';

           board[11][10] = 'X';
           board[11][12] = 'X';

           board[12][10] = 'X';
           board[12][12] = 'X';

           //next
           board[13][11] = 'X';

           //left hand & shoulder
           board[14][8] = 'X';
           board[14][10] = 'X';
           board[14][11] = 'X';
           board[14][12] = 'X';

           //elbow & torso
           board[15][9] = 'X';
           board[15][11] = 'X';
           board[15][13] = 'X';

           //torso & right hand
           board[16][11] = 'X';
           board[16][14] = 'X';

           //thighs
           board[17][10] = 'X';
           board[17][12] = 'X';

           //feet
           board[18][10] = 'X';
           board[18][12] = 'X';

        }  //end georgeConway method

 }  //end Cgol class
