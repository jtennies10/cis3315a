
package week3;

/**
 *
 * @author jten10
 */
public class Chess {
    public static void main(String[] args) {
        char[][] board = {
            {'r','h','b','q','k','b','h','r'},
            {'p','p','p','p','p','p','p','p'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'P','P','P','P','P','P','P','P'},
            {'R','H','B','K','Q','B','H','R'},
        };
        display(board);
        System.out.println("");
        board[0][2]='-';
        board[2][2]='h';
        display(board);
    }
    
    public static void display(char[][] b) {
        for(int row = 0; row < b.length; row++) {
            for(int col = 0; col < b[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
