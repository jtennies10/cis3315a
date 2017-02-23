package week4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C12N15 {

    public static void createFile(File file) throws IOException {
        Random rand = new Random();
        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                output.print(rand.nextInt(100) + " ");
            }
            output.close();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        try {
            File file = new File("Exercise12_15.txt");
            createFile(file);
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        } catch (IOException ex) {
            System.exit(1);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());

    }
}
