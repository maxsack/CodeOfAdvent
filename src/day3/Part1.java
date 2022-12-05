package day3;

import generals.CheckDuplicates;
import generals.Reader;

import java.io.File;
import java.io.FileNotFoundException;

public class Part1 {
    public static void main(String[] args) throws FileNotFoundException {

        Reader reader = new Reader();
        File input3 = new File("src/day3/input3.txt");
        var lines = reader.read(input3);

        CheckDuplicates checkDuplicates = new CheckDuplicates();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] prios = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
        int sum = 0;

        for (String line : lines) {
            int lineLength = line.length();
            int itemLength = lineLength / 2;
            String comp1 = checkDuplicates.execute(line, itemLength);
            char[] digits_comp1 = comp1.toCharArray();
            char[] digits_comp2 = line.toCharArray();

            for (int i = 0; i < comp1.length(); i++) {
                for (int j = itemLength; j < lineLength; j++) {
                    if (digits_comp1[i] == digits_comp2[j]) {
                        char digit = digits_comp2[j];
                        for (int k = 0; k < alphabet.length; k++) {
                            if (digit == alphabet[k]) {
                                sum += prios[k];
                            }
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
