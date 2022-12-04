package day1;

import generals.Elf;
import generals.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new Reader();
        File puzzle2 = new File("src/day1/input1.txt");
        var lines = reader.read(puzzle2);

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

        int calorie_1 = 0;
        for (int results : resultList) {
            if (calorie_1 < results) {
                    calorie_1 = results;
            }
        }
        resultList.remove(Integer.valueOf(calorie_1));
        int calorie_2 = 0;
        for (int results : resultList) {
            if (calorie_2 < results) {
                calorie_2 = results;
            }
        }
        resultList.remove(Integer.valueOf(calorie_2));
        int calorie_3 = 0;
        for (int results : resultList) {
            if (calorie_3 < results) {
                calorie_3 = results;
            }
        }
        resultList.remove(Integer.valueOf(calorie_3));

        int calorie_total = calorie_1 + calorie_2 + calorie_3;

        System.out.println(calorie_total);
    }
}
