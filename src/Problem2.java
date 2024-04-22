import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Problem2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src//Problem2.txt");
        Scanner scan = new Scanner(file);
        String str = "";
        while (scan.hasNext()) {
            String data = scan.nextLine();
            step2(data);
            if (!step2(data).isEmpty())
                str += step2(data);
        }
        str = step2(str);
        System.out.println(str);
        System.out.println(step8(str));
    }
    public static String step1(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (Character.isLetter(data.charAt(i)) && !Character.isLetter(data.charAt(i+1)) && !Character.isSpace(data.charAt(i+1))) {
                str += (data.substring(i,i+1));
            } else {
                str += (data.substring(i,i+1));
            }
        }
        System.out.println(str);
        return step2(str);
    }
    public static String step2(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (Character.isSpace(data.charAt(i))) {
                i++;
            } else {
                str += (data.substring(i, i + 1));
            }
        }
        System.out.println(str);
        return step3(str);
    }
    public static String step3(String data) {
        String str = "";
        int hCount = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i,i+1).equals("h")) {
                if (hCount == 0) {
                    hCount++;
                } else if (hCount == 1) {
                    hCount = 0;
                    continue;
                }
            }
            str += (data.substring(i, i+1));
        }
        System.out.println(str);
        return step4(str);
    }
    public static String step4(String data) {
        String str = "";
        for (int i = 0; i < data.length() - 1; i++) {
            if (isVowel(data.substring(i,i+1)) && isVowel(data.substring(i+1,i+2))) {

            } else {
                str += data.substring(i,i+1);
            }
        }
        System.out.println(str);
        return step5(str);
    }
    public static boolean isVowel(String str) {
        return (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") || str.equals("y"));
    }
    public static String step5(String data) {
        String rem = data.substring(0,1);
        String str = rem;
        for (int i = 1; i < data.length(); i++) {
            if (data.substring(i,i+1).equals("-")) {
                str += data.substring(i,i+1);
                i++;
                str += data.substring(i,i+1);
            } else if (data.substring(i,i+1).equals(rem)) {
                i++;
            } else {
                str += data.substring(i,i+1);
            }
        }
        System.out.println(str);
        return step6(str);
    }
    public static String step6(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isLetter(data.charAt(i)) && !Character.isSpace(data.charAt(i)) && data.charAt(i) != '-') {
                continue;
            }
            str += data.substring(i,i+1);
        }
        System.out.println(str);
        return step7(str);
    }
    public static String step7(String data) {
        String str = "";
        if (data.length() < 18) {
            for (int i = 0; i < data.length(); i++) {
                if (data.substring(i,i+1).equals("-")) {
                    str += data.substring(i+1,i+2);
                }
            }
        } else {
            int skipper = 15;
            for (int i = 0; i < data.length(); i++) {
                if (data.substring(i,i+1).equals("-")) {
                    str += data.substring(i + 1, i + 2);
                } if (skipper != 0) {
                    skipper--;
                    continue;
                } str += data.substring(i,i+1);
            }
        }
        System.out.println(str);
        return (str);
    }
    public static String step8(String data) {
        String str = "";
        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == data.charAt(i+1)) {
                i++;
            } else {
                str += data.substring(i,i+1);
            }
        }
        System.out.println(str);
        return step9(str);
    }
    public static String step9(String data) {
        String str = "";
        int vowelCount = 0;
        for (int i = 0; i < data.length(); i++) {
            if (isVowel(data.substring(i,i+1))) {
                if (vowelCount == 0) {
                    vowelCount++;
                } else if (vowelCount == 1) {
                    vowelCount = 0;
                    continue;
                }
            }
            str += (data.substring(i, i+1));
        }
        return step10(str);
    }
    public static String step10(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i).indexOf("re") == 0) {
                i++;
            } else {
                str += data.substring(i,i+1);
            }
        } return step11(str);
    }
    public static String step11(String data) {
        String str = "";
        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == 'w' && data.charAt(i + 1) == 't') {
                i++;
            } else {
                str += data.substring(i,i+1);
            }
        } return step12(str);
    }
    public static String step12(String data) {
        int sCount = 1;
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(i,i+1).equals("s")) {
                if (sCount == 1) {
                    str += "s";
                    sCount--;
                } else {

                }
            } else {
                str += data.substring(i,i+1);
            }
        } return step13(str);
    }
    public static String step13(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            String letter = data.substring(i,i+1);
            if (data.substring(i+1).contains(letter)) {

            } else {
                str += data.substring(i,i+1);
            }
        } return step14(str);
    }
    public static String step14(String str) {
        return str.substring(0,1) + str.substring(3);
    }
}