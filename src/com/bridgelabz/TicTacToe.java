package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe workshop");
        char[] board = new char[10];
        for (int i=1; i< board.length; i++) {
            board[i] = ' ';
        }
        char player1 = choise();
        char computer;
        if (player1 == 'X' || player1 == 'x') {
            player1 = 'X';
            computer = 'O';
        }
        else {
            player1 = 'O';
            computer = 'X';
        }
        System.out.println("Player1 letter is : "+player1);
        System.out.println("Computer letter is : "+computer);
        showBoard(board);
    }
    public static char choise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select either X or O ");
        char p1 = sc.next().charAt(0);
        return p1;
    }
    public static void showBoard(char[] board){
        for (int i=1; i< board.length; i=i+3) {
            System.out.println("|"+board[i]+"|"+board[i+1]+"|"+board[i+2]+"|");
            System.out.println("|_|_|_|");
        }
    }
}
