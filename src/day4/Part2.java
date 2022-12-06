package day4;

import generals.Range;
import generals.Reader;

import java.io.*;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;

        File file = new File("src/day4/input4.csv");
        Scanner sc =  new Scanner(file);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] StringRanges = line.split(",");
            String[] StringRange1 = StringRanges[0].split("-");
            String[] StringRange2 = StringRanges[1].split("-");
            int r1min = Integer.parseInt(StringRange1[0]);
            int r2min = Integer.parseInt(StringRange2[0]);
            int r1max = Integer.parseInt(StringRange1[1]);
            int r2max = Integer.parseInt(StringRange2[1]);

            if (r1max < r2min || r2max < r1min ) {
                // no overlap
            } else {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

