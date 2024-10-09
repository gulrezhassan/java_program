/*import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int ans = 0; // convert decimal number
        int pw = 1;// 2^0=1 power of 2

        while (binary_num > 0) {
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw);
            binary_num /= 10;
            pw *= 2;

        }
        System.out.println(ans);
    }

}

*/

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

class LocaleDemo {

    static void showTotal(Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(45000));
    }

    static void showDate(Locale locale) {
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.LONG, locale);
        System.out.println(dtf.format(date));

    }

    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN"); // 19 and below
        // Locale locale2 = Locale.of("hi", "IN"); // 20 AND ABOVE
        // Locale locale = Locale.
        showTotal(locale);
        showDate(locale);
    }
}
