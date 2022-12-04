package day2;

import generals.Reader;

import java.io.File;
import java.io.FileNotFoundException;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        // score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
        // plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won)
        // A for Rock, B for Paper, and C for Scissors
        // X for Rock, Y for Paper, and Z for Scissors

        Reader reader = new Reader();
        File input2 = new File("src/day2/input2.txt");
        var lines = reader.read(input2);
        int score1 = 0;
        int score2 = 0;
        int total_score = 0;

        for (String line : lines) {
            char[] charline = line.toCharArray();
            char char2 = charline[2];
            if ("A X".equals(line) || "B Y".equals(line) || "C Z".equals(line)) {
                score1 += 3;
            } else if ("A Z".equals(line) || "B X".equals(line) || "C Y".equals(line)) {
                score1 += 0;
            } else if ("A Y".equals(line) || "B Z".equals(line) || "C X".equals(line)) {
                score1 += 6;
            }

            if ('X' == char2) {
                score2 += 1;
            } else if ('Y' == char2) {
                score2 += 2;
            } else if ('Z' == char2) {
                score2 += 3;
            }

            total_score = score1 + score2;
        }

        System.out.println(total_score);
    }
}
