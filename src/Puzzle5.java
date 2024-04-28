public class Puzzle5 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = "ewibbzzqfxtmjfbosptuwihdiqufxeakqglzvjuicumkmdfzkwybeounpjkffdclumvhbrrvkywtsnikawnqinzvzgpzdukoyzctqemklmgrzapxazjygqzhtcjyvmrjqabtevuwfelpggvwmsoivjurwghoeaaqdl";
        int skip = 0;
        String letter;
        for (int i = 0; i < str.length(); i += skip + 1) {
            letter = String.valueOf(str.charAt(i));
            System.out.print(letter);
            skip = alphabet.indexOf(letter) + 1;
        }
    }
}
