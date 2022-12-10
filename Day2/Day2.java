package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("Day2/input.txt");
        Scanner scan = new Scanner(inputFile);
        Integer totalScoreA = 0;
        Integer totalScoreB = 0;
        while (scan.hasNextLine()) {
            String round = scan.nextLine();
            String[] splStrings = round.split(" ");
            totalScoreA += getValueForRoundA(splStrings[0], splStrings[1]);
            totalScoreB += getValueForRoundB(splStrings[0], splStrings[1]);
        }
        System.out.println(totalScoreA);
        System.out.println(totalScoreB);

        scan.close();
    }

    public static Integer getValueForRoundA(String theirHand, String yourHand) {
        Integer pointsGained = 0;
        switch (theirHand) {
            case "A":
                if (yourHand.equals("Z")) {
                    pointsGained += 3;
                } else if (yourHand.equals("X")) {
                    pointsGained += 4;
                } else if (yourHand.equals("Y")) {
                    pointsGained += 8;
                }
                return pointsGained;
            case "B":
                if (yourHand.equals("X")) {
                    pointsGained += 1;
                } else if (yourHand.equals("Y")) {
                    pointsGained += 5;
                } else if (yourHand.equals("Z")) {
                    pointsGained += 9;
                }
                return pointsGained;
            case "C":
                if (yourHand.equals("X")) {
                    pointsGained += 7;
                } else if (yourHand.equals("Y")) {
                    pointsGained += 2;
                } else if (yourHand.equals("Z")) {
                    pointsGained += 6;
                }
                return pointsGained;
            default:
                return 0;
        }
    }

    public static Integer getValueForRoundB(String theirHand, String outcomeNeeded) {
        Integer pointsGained = 0;
        switch (theirHand) {
            case "A":
                if (outcomeNeeded.equals("X")) {
                    pointsGained += 3;
                } else if (outcomeNeeded.equals("Y")) {
                    pointsGained += 4;
                } else if (outcomeNeeded.equals("Z")) {
                    pointsGained += 8;
                }
                return pointsGained;
            case "B":
                if (outcomeNeeded.equals("X")) {
                    pointsGained += 1;
                } else if (outcomeNeeded.equals("Y")) {
                    pointsGained += 5;
                } else if (outcomeNeeded.equals("Z")) {
                    pointsGained += 9;
                }
                return pointsGained;
            case "C":
                if (outcomeNeeded.equals("X")) {
                    pointsGained += 2;
                } else if (outcomeNeeded.equals("Y")) {
                    pointsGained += 6;
                } else if (outcomeNeeded.equals("Z")) {
                    pointsGained += 7;
                }
                return pointsGained;
            default:
                return 0;
        }
    }
}
