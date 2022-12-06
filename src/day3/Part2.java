package day3;

import generals.CheckDuplicates;
import generals.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) throws FileNotFoundException {

        CheckDuplicates checkDuplicates = new CheckDuplicates();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] prios = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
        int sum = 0;

        FileInputStream fis = new FileInputStream("src/day3/input3.txt");
        Scanner sc =  new Scanner(fis);
        while(sc.hasNextLine()) {
            String line11 = sc.nextLine();
            String line1 = checkDuplicates.execute(line11, line11.length());
            String line22 = sc.nextLine();
            String line2 = checkDuplicates.execute(line22, line22.length());
            String line33 = sc.nextLine();
            String line3 = checkDuplicates.execute(line33, line33.length());

            for (char digit1 : line1.toCharArray()) {
                for ( char digit2 : line2.toCharArray()) {
                    if (digit1 == digit2) {
                        for ( char digit3 : line3.toCharArray()) {
                            if (digit3 == digit2) {
                                for (int m = 0; m < alphabet.length; m++) {
                                    if ( digit3 == alphabet[m]) {
                                        sum += prios[m];
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
