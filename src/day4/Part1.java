package day4;

import generals.Reader;

import java.io.*;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;

        File file = new File("src/day4/input4.csv");
        Scanner sc =  new Scanner(file);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] ranges = line.split(",");
            String[] range1 = ranges[0].split("-");
            String[] range2 = ranges[1].split("-");
            int r1index0 = Integer.parseInt(range1[0]);
            int r2index0 = Integer.parseInt(range2[0]);
            int r1index1 = Integer.parseInt(range1[1]);
            int r2index1 = Integer.parseInt(range2[1]);
            if (r1index0 <= r2index0 && r1index1 >= r2index1 || r1index0 >= r2index0 && r1index1 <= r2index1 ) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
