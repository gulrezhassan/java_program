
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter the  number");
        int num = 153;
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int i = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + (int) Math.pow(r, i++);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }

}
