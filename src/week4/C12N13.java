
package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 *
 * @author jten10
 */
public class C12N13 {
     public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
        if(args.length > 0) {
            File file = new File(args[0]);
        
        int words = 0;
        int characters = 0;
        int lines = 0;
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            lines++;
            words++;
            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ') words++;
                characters++;
            }
        } 
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
        }
    } 
    
    
}