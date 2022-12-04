package day1;

import generals.Elf;
import generals.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new Reader();
        File puzzle1 = new File("src/day1/input1.txt");
        var lines = reader.read(puzzle1);

        List<Elf> elves = new LinkedList<>();
        List<Integer> calories = new LinkedList<>();
        for (String line : lines) {
            try {
                int number = Integer.parseInt(line);
                calories.add(number);
            } catch (NumberFormatException ignore) {
                elves.add(new Elf(calories));
                calories = new LinkedList<>();
            }
        }

        List<Integer> resultList = new LinkedList<>();
        for (Elf elf : elves ) {
            int result = elf.getCalorie();
            resultList.add(result);
        }

        int highest_calorie = 0;
        for (int results : resultList) {
            if (highest_calorie < results) {
                highest_calorie = results;
            }
        }

        System.out.println(highest_calorie);
    }
}