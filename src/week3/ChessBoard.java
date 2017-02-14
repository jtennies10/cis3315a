/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 55tenniejd13
 */
public class ChessBoard {
    protected char[][] board;
    protected int count = 0;
    
    public ChessBoard() {
        reset();
    }
    
    public void move(int rowFrom, int colFrom, int rowTo, int colTo) {
        board[rowTo][colTo] = board[rowFrom][colFrom];
        board[rowFrom][colFrom] = '-';
        count++;
    }
    
    public void reset() {
        char[][] tempBoard = {
            {' ','1','2','3','4','5','6','7','8'},
            {'1','r','h','b','q','k','b','h','r'},
            {'2','p','p','p','p','p','p','p','p'},
            {'3','-','-','-','-','-','-','-','-'},
            {'4','-','-','-','-','-','-','-','-'},
            {'5','-','-','-','-','-','-','-','-'},
            {'6','-','-','-','-','-','-','-','-'},
            {'7','P','P','P','P','P','P','P','P'},
            {'8','R','H','B','K','Q','B','H','R'},
        };
        this.board = tempBoard;
        count = 0;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                sb.append(board[row][col]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
