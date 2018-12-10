import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class aoc31 {


    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("D:\\Project\\src\\source3");
        Scanner br = new Scanner(fl);
        ArrayList<String> sourceArray = new ArrayList<>();
      //  int[1000],[1000] map;
        while (br.hasNext()) {
            sourceArray.add(br.nextLine());
        }

        for (String str: sourceArray) System.out.println(str);
    }
}
