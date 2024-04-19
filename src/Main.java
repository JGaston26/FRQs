public class Main {
    public static void main(String[] args) {
        for (int skip = 1; skip < 82; skip++) {
            String temp = "";
            String a = "ewibbzzqfxtmjfbosptuwihdiqufxeakqglzvjuicumkmdfzkwybeounpjkffdclumvhbrrvkywtsnikawnqinzvzgpzdukoyzctqemklmgrzapxazjygqzhtcjyvmrjqabtevuwfelpggvwmsoivjurwghoeaaqdl";
            for (int i = 0; i < a.length(); i += skip) {
                temp += a.substring(i, i + 1);
            }
            System.out.println(temp);
        }
    }
}