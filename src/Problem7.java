public class Problem7 {
    public static void main(String[] args) {
        String message = "avdgpmz dn ocz jkkjmopidot oj wzbdi vbvdi hjmz diozggdbziogt. - czimt ajmy";

        System.out.println(shift(message, 5));
    }

    static String shift(String msg, int num){
        String str = "";
        int len = msg.length();
        for(int i = 0; i < len; i++) {
            char c = (char)(msg.charAt(i) + num);
            if (Character.toString(c).equals("%") || Character.toString(c).equals("3") || Character.toString(c).equals("2")) {
                str += (char)(msg.charAt(i));
            } else if (c > 'z')
                str += (char)(msg.charAt(i) - (26- num));
            else
                str += (char)(msg.charAt(i) + num);
        }

        return str;
    }
}
