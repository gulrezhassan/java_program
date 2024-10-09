import java.util.Scanner;

/*public class palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        int sum = 0, r;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
}*/

/*public class Solution {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }
}
    /*/

public class Solution {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // int[] arr1 = { 2, 3, 4, 4, 6, 7, 8, 9 };
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }
        // for (int i : arr1) {
        // System.out.println(i);
        // }

        // search an element in an array

        // int arr[] = { 2, 34, 55, 66, 77, 88 };
        // for (int i : arr) {
        // if (i == 56) {
        // System.out.println("Element found");

        // }
        // }

        // max element
        // int[] arr = new int[10];
        // arr[0] = 5;
        // arr[1] = 4;
        // arr[3] = 6;
        // arr[4] = 7;
        // int res = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > res) {
        // res = arr[i];

        // }
        // }
        // System.out.println(res);

        // reverse print array
        // int arr1[] = { 2, 3, 4, 5, 6, 7, 7 };
        // for (int i = arr1.length - 1; i >= 0; i--) {
        // System.out.println(arr1[i]);
        // }

        // sum of two array
        // int[] arr = { 2, 3, 4, 5, 6, 7 };
        // int sum = 0;
        // for (int i : arr) {
        // sum += i;
        // }
        // System.out.println(sum);
        String s = "physics";
        for (int i = 2; i < 4; i++) {
            System.out.print(s.substring(i));
        }

        // int[][] arr = new int[5][6];
        // System.out.println(arr);

    }

}
