import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayX { // Template for file reading lol

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("DayX/input.txt");
        Scanner scan = new Scanner(inputFile);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            
        }
       
        scan.close();

    }

}
