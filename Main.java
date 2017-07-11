package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//konsolowe kolko i krzyzyk
 public static void main(String[] args){

     String[][] board = new String[3][3];
     Scanner in = new Scanner(System.in);
     boolean playerX = true;
     boolean thereIsWinner = false;

     for(int j = 0; j <= 2; j++){
         for(int g = 0; g <=2; g++){
             if(board[j][g]==null){
                 board[j][g]=" ";
             }
         }

     }
     for (int i = 0; i < 9; i++){
         Scanner wspolrzedne = new Scanner(System.in);
         if(playerX){
             System.out.println("wybierz pole do którego chcesz przypisać X (x,y):");
             int x = wspolrzedne.nextInt();
             int y = wspolrzedne.nextInt();
             if(board[x][y].equals(" ")){
                 board[x][y] = "X";
                 playerX = false;
             } else System.out.println("Wybierz puste pole!");

         } else {
             System.out.println("wybierz pole do którego chcesz przypisać O (x,y):");
             int x = wspolrzedne.nextInt();
             int y = wspolrzedne.nextInt();
             if(board[x][y].equals(" ")){
                 board[x][y] = "O";
                 playerX = true;
             } else {
                 System.out.println("Wybierz puste pole!");
                i--;
             }

         }


         System.out.println("\t"+board[0][0]+"\t|"+"\t"+board[0][1]+"\t|"+"\t"+board[0][2]);
         System.out.println("--------|-------|--------");
         System.out.println("\t"+board[1][0]+"\t|"+"\t"+board[1][1]+"\t|"+"\t"+board[1][2]);
         System.out.println("--------|-------|--------");
         System.out.println("\t"+board[2][0]+"\t|"+"\t"+board[2][1]+"\t|"+"\t"+board[2][2]+"\n");


         //Zwyciestwa O poziomo
         if(board[0][0].equals("O")&&board[0][1].equals("O")&&board[0][2].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[1][0].equals("O")&&board[1][1].equals("O")&&board[1][2].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[2][0].equals("O")&&board[2][1].equals("O")&&board[2][2].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }


         //Zwyciestwa X poziomo
         if(board[0][0].equals("X")&&board[0][1].equals("X")&&board[0][2].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[1][0].equals("X")&&board[1][1].equals("X")&&board[1][2].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[2][0].equals("X")&&board[2][1].equals("X")&&board[2][2].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }


         //Zwyciestwa O pionowo
         if(board[0][0].equals("O")&&board[1][0].equals("O")&&board[2][0].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][1].equals("O")&&board[1][1].equals("O")&&board[2][1].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][2].equals("O")&&board[1][2].equals("O")&&board[2][2].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }


         //Zwyciestwa X pionowo
         if(board[0][0].equals("X")&&board[1][0].equals("X")&&board[2][0].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][1].equals("X")&&board[1][1].equals("X")&&board[2][1].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][2].equals("X")&&board[1][2].equals("X")&&board[2][2].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }


         //Zwyciestwa O po przekatnej
         if(board[0][0].equals("O")&&board[1][1].equals("O")&&board[2][2].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][2].equals("O")&&board[1][1].equals("O")&&board[2][0].equals("O")){
             System.out.println("Gratulacje O wygrał");
             thereIsWinner = true;
             System.exit(0);
         }


         //Zwyciestwa X po przekatnej
         if(board[0][0].equals("X")&&board[1][1].equals("X")&&board[2][2].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }
         if(board[0][2].equals("X")&&board[1][1].equals("X")&&board[2][0].equals("X")){
             System.out.println("Gratulacje X wygrał");
             thereIsWinner = true;
             System.exit(0);
         }

     }
     if(!thereIsWinner){
         System.out.println("Remis");
         System.exit(0);
     }
    }
}
