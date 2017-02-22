
package week4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author jten10
 */
public class C12N15 {
    public static void createFile() throws IOException {
        Random rand = new Random();
        File file = new File("Exercise12_15.txt");
        if(file.exists()) {
           System.out.println("File already exists");
        } else {
            PrintWriter output = new PrintWriter(file);
            for(int i = 0; i < 100; i++) {
                output.print(rand.nextInt() + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        try {
            createFile();
        } catch(IOException ex) {
            System.exit(1);
        }
        Scanner sc = new Scanner("Exercise12_15.txt");
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
    }
}