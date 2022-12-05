package day3;

import generals.CheckDuplicates;
import generals.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) throws FileNotFoundException {

        Reader reader = new Reader();
        File input3 = new File("src/day3/input3.txt");
        var lines = reader.read(input3);

        ArrayList<String> group_elves = new ArrayList<>();
        CheckDuplicates checkDuplicates = new CheckDuplicates();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] prios = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
        int sum = 0;

        for (int i = 0; i < lines.size(); i++) {
            while (group_elves.size() < 3) {
                for (String line : lines) {
                    group_elves.add(line);
                    lines.remove(line);
                    break;
                }
            }
            System.out.println(group_elves);
            String line = group_elves.get(0);
            String line1 = checkDuplicates.execute(line, line.length());
            String line22 = group_elves.get(1);
            String line2 = checkDuplicates.execute(line22, line22.length());
            String line3 = group_elves.get(2);


            char[] digits_line1 = line1.toCharArray();
            char[] digits_line2 = line2.toCharArray();
            char[] digits_line3 = line3.toCharArray();
            char digit_dup = 0;
            for (int j = 0; j < line1.length(); j++) {
                char digit_1 = digits_line1[j];
                for (int k = 0; k < line2.length(); k++) {
                    char digit_2 = digits_line2[k];
                    if (digit_2 == digit_1) {
                        digit_dup = digit_1;
                        for (int l = 0; l < line3.length(); l++) {
                            char digit_3 = digits_line3[l];
                            if (digit_3 == digit_dup) {
                                for (int m = 0; m < alphabet.length; m++) {
                                    if ( digit_dup == alphabet[m]) {
                                        sum += prios[m];
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
            for (int z = 0; z < group_elves.size(); z++ ) {
                group_elves.remove(z);
            }
        }
        System.out.println(sum);
    }
}
