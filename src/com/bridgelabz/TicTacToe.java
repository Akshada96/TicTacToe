package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe workshop");
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        char player1 = choise();
        char computer;
        if (player1 == 'X' || player1 == 'x') {
            player1 = 'X';
            computer = 'O';
        } else {
            player1 = 'O';
            computer = 'X';
        }
        System.out.println("Player1 letter is : " + player1);
        System.out.println("Computer letter is : " + computer);
        showBoard();
        userMove(player1);
    }

    public static char choise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select either X or O ");
        char p1 = sc.next().charAt(0);
        return p1;
    }

    public static void showBoard() {
        for (int i = 1; i < board.length; i = i + 3) {
            System.out.println("|" + board[i] + "|" + board[i + 1] + "|" + board[i + 2] + "|");
            System.out.println("|_|_|_|");
        }
    }

    public static void userMove(char player1) {
        System.out.println("Select the index from 1 to 9 to make th move : ");
        Scanner sc = new Scanner(System.in);
        int move = sc.nextInt();
        if (board[move] == ' ') {
            board[move] = player1;
        }
    }
}