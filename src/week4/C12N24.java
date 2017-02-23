
package week4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Random;

/**
 *
 * @author Joshua Tennies
 */
public class C12N24 {
    public static void main(String[] args) {
        Random rand = new Random();
        try {
            File file = new File("Salary.txt");
            PrintWriter output = new PrintWriter(file);
            for(int i = 1; i <= 1000; i++) {
                output.append("FirstName" + i + " ");
                output.append("LastName" + i + " ");
                int rank = rand.nextInt(3);
                if(rank == 0) {
                    output.append("assistant ");
                    double salary = rand.nextDouble() + rand.nextInt(30000) + 50000;
                    output.append(String.format("%.2f\n", salary));
                }
                else if(rank == 1) {
                    output.append("associate ");
                    double salary = rand.nextDouble() + rand.nextInt(50000) + 60000;
                    output.append(String.format("%.2f\n", salary));
                } else {
                    output.append("full ");
                    double salary = rand.nextDouble() + rand.nextInt(55000) + 75000;
                    output.append(String.format("%.2f\n", salary));
                }
            }
            output.close();
        } catch(IOException e) {
            System.out.println("File already exists");
        }
    }
}
