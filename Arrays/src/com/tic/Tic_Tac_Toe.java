package com.tic;


import java.util.Scanner;

public class Tic_Tac_Toe {

	static char[][] board = new char[3][3];

	static char player = 'X';
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}
		while (true) {
			printBoard();
			System.out.println("==================");

			System.out.println(player + " you turn !!!!!!!");
			System.out.println("plesse choose row(0-2)");
			int row = scanner.nextInt();
			System.out.println("plesse choose col(0-2)");
			int col = scanner.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
				System.out.println("invalid move please choose again !!!!!!");
				continue;
			}
			board[row][col] = player;// X

			if (checkWinner()) {
				System.out.println(player + " congratulations you win");
				printBoard();
				break;
			}
			if(isBoardFull()) {
				System.out.println("Game end drow match both players can leave for the day!!!!!! ");
				printBoard();
				break;
			}

			player = (player == 'X') ? 'O' : 'X';

		}
	}

	private static boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]==' ') {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkWinner() {
		// rows
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}

		}
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}

		}
		if(board[0][0]==player &&board[1][1]==player && board[2][2]==player) {
			return true;
		}
		if(board[0][2]==player &&board[1][1]==player && board[2][0]==player) {
			return true;
		}

		return false;
	}

	private static void printBoard() {

		System.out.println("-----------");
		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " |");
			}
			System.out.println();
			System.out.println("-----------");

		}
	}

}


