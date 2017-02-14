/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author 55tenniejd13
 */
public class ChessUI {

    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
        Scanner sc = new Scanner(System.in);
        String keepPlaying = "y";
        System.out.println(chess.toString());
        int count = 0;
        while (keepPlaying.equals("y")) {
            if(count % 2 == 0) {
                System.out.println("Player 1's turn");
            } else {
                System.out.println("Player 2's turn");
            }
            System.out.print("Enter the row and column of the piece you want to move "
                    + "separated by a space: ");
            int rowFrom = sc.nextInt();
            int colFrom = sc.nextInt();
            System.out.print("Enter the row and column of where to move this piece "
                    + "separated by a space: ");
            int rowTo = sc.nextInt();
            int colTo = sc.nextInt();
            if(rowFrom == 0 || rowTo == 0 || colFrom == 0 || colTo == 0) {
                System.out.println("One or more invalid selections. Please choose again.");
                continue;
            }
            chess.move(rowFrom, colFrom, rowTo, colTo);
            System.out.println(chess.toString());
            System.out.print("Would you like to keep playing(y/n)? ");
            keepPlaying = sc.next();
            count++;
        }
    }
}
