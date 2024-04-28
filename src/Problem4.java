import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
public class Problem4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src//Problem4.txt"));
        ArrayList<String> arr = new ArrayList<String>();
        while (s.hasNext()) {
            String data = s.nextLine();
            arr.add(data);
        }
        Collections.sort(arr);
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
