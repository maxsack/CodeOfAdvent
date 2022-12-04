package generals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Elf {
    List<Integer> calories;

    int calorie_total;

    public Elf(List<Integer> calories) {
        this.calories = calories;
    }

    public int getCalorie() {
        for (Integer calorie : this.calories) {
            calorie_total = calorie_total + calorie;
        }
        return calorie_total;
    }

    public void print() {
        System.out.println(calories);
    }
}
