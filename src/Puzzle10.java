import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Puzzle10 {
    public static void main(String[] args) throws IOException {
//        String concatAnswers = "failureisthestridefailure is the opportunity to begin again more intelligently. - henry fordlover cover hover rover rower sower cower lowerezgulsyjveurcnthyfzjrcptm267291011001010";
//        for (int i = 0; i < concatAnswers.length(); i += 4) {
//            if (i + 4 > 178) {
//                System.out.println(concatAnswers.substring(i));
//            } else {
//                System.out.println(concatAnswers.substring(i, i + 4));
//            }
//        }         USED TO GET ROWS OF 4

        File file = new File("src//text.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.print(alter(str));
        }
    }
    static int count = 1;

    public static String alter(String str) {
        if (count == 1) {
            count++;
            str = str.substring(1);
        } else if (count == 2) {
            count++;
            str = str.substring(0,2) + str.substring(3);
        } else if (count == 3) {
            count++;
            str = str.substring(2,3);
        } else if (count == 4) {
            count = 1;
            str = str.substring(0,1) + str.substring(3);
        }
        return str;
    }
}
