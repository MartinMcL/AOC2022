package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("Day1/input.txt");
        Scanner scan = new Scanner(inputFile);

        List<Elf> elfList = new ArrayList<>();
        Elf processingElf = null;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("")) {
                elfList.add(processingElf);
                processingElf = null;
            } else {
                if (processingElf == null) {
                    processingElf = new Elf(); 
                }
                Integer cal = Integer.parseInt(line);
                processingElf.calories.add(cal);
                processingElf.caloriesTotal += cal; 
            }

        }
        elfList.sort(Comparator.comparingInt(x -> x.caloriesTotal));
        Collections.reverse(elfList);
        Integer highestCals = elfList.get(0).caloriesTotal;
        Integer topThree = 0;
        for (int i = 0; i < 3; i++) {
            topThree += elfList.get(i).caloriesTotal;
        }
        System.out.println(highestCals);
        System.out.println(topThree);
        scan.close();

    }

}

class Elf {
    public Integer caloriesTotal;
    public List<Integer> calories;

    public Elf() {
        this.calories = new ArrayList<>();
        this.caloriesTotal = 0;
    }
}