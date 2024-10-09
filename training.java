import java.util.Scanner;

/*public class Training {
    public static void main(String[] args) {
        int i;
        String name = "metaverse";
        for (i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }
}
    */
// System.in.read();
// System.in.readAllBytes();

/*public class Training {

    public static void main(String[] args) {
        String a = new String("mufasa");
        String b = new String("mufasa");
        String c = "mufasa";
        String d = "mufasa";

        System.out.println(c == d);
    }
}
    */

public class Training {

    // public static void main(String[] args) {
    /*
     * String name = "Mufasa junglebook";
     * int length = name.length();
     * String name2 = "mufasa junglebook";
     * System.out.println(name.equalsIgnoreCase(name2));
     */
    public static void main(String[] args) {
        /*
         * String str1 = "remote";
         * String str2 = "car";
         * System.out.println('e' + 0);
         * System.out.println('a' + 0);
         * int i = str2.compareTo(str1);
         * System.out.println(i);
         */
        // String str1 = "Amar Singh";
        // String subString = str1.substring(2);
        // System.out.println(subString);

        /*
         * String firstName = "spider";
         * String lastName = "man";
         * String fullName = firstName + " " + lastName;
         * System.out.println(fullName.length());
         * 
         * // charAt
         * 
         * for (int i = 0; i < fullName.length(); i++) {
         * System.out.println(fullName.charAt(i));
         * 
         * StringBuilder sb = new StringBuilder("mohan");
         * System.out.println(sb);
         * 
         * sb.insert(0, 'a');
         * System.out.println(sb);
         * }
         * 
         * StringBuilder sb = new StringBuilder('m');
         * sb.append('e');
         * sb.append('t');
         * sb.append('a');
         * sb.append('v');
         * sb.append('e');
         * sb.append('r');
         * sb.append('s');
         * sb.append('e');
         * System.out.println(sb);
         */

        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
        System.out.println(011);
    }

}
