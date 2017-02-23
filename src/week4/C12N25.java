package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua Tennies
 */
public class C12N25 {

    public static void main(String[] args) {
        String stringURL = "http://cs.armstrong.edu/liang/data/Salary.txt";
        double totalAssistantSalary = 0;
        int numOfAssistants = 0;
        double totalAssociateSalary = 0;
        int numOfAssociates = 0;
        double totalFullSalary = 0;
        int numOfFull = 0;

        try {
            URL url = new URL(stringURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    url.openStream()));
            String lineReader;
            while ((lineReader = br.readLine()) != null) {
                String[] info = lineReader.split(" ");
                if (info[2].equalsIgnoreCase("assistant")) {
                    totalAssistantSalary += Double.parseDouble(info[3]);
                    numOfAssistants++;
                } else if (info[2].equalsIgnoreCase("associate")) {
                    totalAssociateSalary += Double.parseDouble(info[3]);
                    numOfAssociates++;
                } else {
                    totalFullSalary += Double.parseDouble(info[3]);
                    numOfFull++;
                }

            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(C12N25.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(C12N25.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.printf("Assistant Total Salary: %.2f Assistant Average Salary: %.2f\n", 
                totalAssistantSalary, (totalAssistantSalary / numOfAssistants));
        System.out.printf("Associate Total Salary: %.2f Associate Average Salary: %.2f\n",
                totalAssociateSalary, (totalAssociateSalary / numOfAssociates));
        System.out.printf("Full Total Salary: %.2f Full Average Salary: %.2f\n",
                totalFullSalary, (totalFullSalary / numOfFull));

    }

}
