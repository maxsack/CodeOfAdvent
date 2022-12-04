package generals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public ArrayList<String> read(File input) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        FileInputStream fis = new FileInputStream(input);
        Scanner sc =  new Scanner(fis);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
        }
        return lines;
    }
}
