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
        int x = 1;
        while (scan.hasNext()) {
            String data = scan.nextLine();
            System.out.println("\n\n\n" + x);
            x++;
            String item = step8(data);
            if (!item.isEmpty())
                str += item;
        }
        System.out.println("TOTAL STRING: \n\n" + str + "\n\n");
        step8(str);
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
        for (int i = 0; i < data.length()-1; i++) {
            if (Character.isSpace(data.charAt(i))) {
                i++;
            }
            if (Character.isSpace(data.charAt(i+1))) {
                i+=2;
            } else {
                str += (data.substring(i, i + 1));
            }
        }
        System.out.println(data);
        System.out.println(str + "       step 2");
        return step4(str);
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
        System.out.println(str + "     step 3");
        return step4(str);
    }
    public static String step4(String data) {
        String str = "";
        for (int i = 0; i < data.length() - 1; i++) {
            if (isVowel(String.valueOf(data.charAt(i))) && isVowel(String.valueOf(data.charAt(i+1)))) {

            } else {
                str += data.substring(i,i+1);
            }
        }
        System.out.println(str + "     step 4");
        return step5(str);
    }
    public static boolean isVowel(String str) {
        return (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") || str.equals("y"));
    }
    public static String step5(String data) {
        Character rem = data.charAt(0);
        String str = String.valueOf(rem);
        for (int i = 1; i < data.length() - 1; i++) {
            if (data.charAt(i) == '-') {
                str += data.charAt(i);
                i++;
                str += data.charAt(i);
            } else if (data.charAt(i) == rem) {

            } else {
                str += data.charAt(i);
            }
        }
        System.out.println(str + "     step 5");
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
        System.out.println(str + "     step 6");
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
                    str += data.substring(i+1,i+2);
                    i++;
                    continue;
                } if (skipper != 0) {
                    skipper--;
                    continue;
                } str += data.substring(i,i+1);
            }
        }
        System.out.println(str + "     step 7");
        return (str);
    }
    public static String step8(String data) {
        String dataClone = "";
        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == '-') {

            } else {
                dataClone += data.substring(i,i+1);
            }
        }
        System.out.println(dataClone);
        String str = "";
        for (int i = 0; i < dataClone.length() - 1; i++) {
            if (dataClone.charAt(i) == '-') {

            } else if (dataClone.charAt(i) == dataClone.charAt(i+1)) {
                i++;
            } else {
                str += dataClone.substring(i,i+1);
            }
        }
        System.out.println(str + "     step 8");
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
        System.out.println(str + "     step 9");
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
        }
        System.out.println(str + "     step 10");
        return step11(str);
    }
    public static String step11(String data) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'w' && data.charAt(i + 1) == 't') {
                i++;
            } else {
                str += data.substring(i,i+1);
            }
        }
        System.out.println(str + "     step 11");
        return step12(str);
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
        }
        System.out.println(str + "     step 12");
        return step13(str);

    }
    public static String step13(String data) {
        String str = "";
        String[] arr = new String[26];
        int idx = 0;
        for (int i = 0; i < data.length(); i++) {
            String letter = data.substring(i,i+1);
            if (data.substring(i+1).contains(letter) && !hasItem(arr, letter)) {
                arr[idx] = letter;
                idx++;
            } else {
                str += letter;
            }
        }
        System.out.println(str + "     step 13");
        return step14(str);
    }
    public static boolean hasItem(String[] arr, String str) {
            for (String item : arr) {
                if (item != null && item.equals(str))  {
                    return true;
                }
            }
        return false;
    }
    public static String step14(String str) {
        if (!str.isEmpty()) {
            if (str.length() <= 3) {
                str = str.substring(0, 1);
            } else {
                str = str.substring(0, 1) + str.substring(3);
            }
        }
        System.out.println(str + "     step 14");
        return str;
    }
}