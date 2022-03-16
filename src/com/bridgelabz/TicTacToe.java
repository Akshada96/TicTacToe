package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];
    static char player1, computer;
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe workshop");
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        choise();
        showBoard();
        toss();
        int move = userMove();
        isSpaceFree(move);
    }

    public static void choise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select either X or O ");
        player1 = sc.next().charAt(0);
        if (player1 == 'X' || player1 == 'x') {
            player1 = 'X';
            computer = 'O';
        } else {
            player1 = 'O';
            computer = 'X';
        }
        System.out.println("Player1 letter is : " + player1);
        System.out.println("Computer letter is : " + computer);
    }

    public static void showBoard() {
        for (int i = 1; i < board.length; i = i + 3) {
            System.out.println("|" + board[i] + "|" + board[i + 1] + "|" + board[i + 2] + "|");
            System.out.println("|_|_|_|");
        }
    }

    public static int userMove() {
        System.out.println("Select the index from 1 to 9 to make th move : ");
        Scanner sc = new Scanner(System.in);
        int move = sc.nextInt();
        return move;
    }

    public static void isSpaceFree(int move){
        if (board[move] == ' ') {
            board[move] = player1;
        }
        else {
            System.out.println("Selected space is already occupied, select some other index");
            move = userMove();
            isSpaceFree(move);
        }
    }

    public static void toss(){
        int coin = (int) (Math.random()*2);
        if (coin == 1)
            System.out.println("Player1 will start first");
        else
            System.out.println("Computer will start first");
    }
}