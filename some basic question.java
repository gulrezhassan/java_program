// import java.io.*;
// import java.util.ArrayList;
// import java.util.Scanner;

// import javax.swing.Box;

/*
 * class Geometry {
 * 
 * // utility function
 * static double circumference(double r) {
 * 
 * double PI = 3.1415;
 * double cir = 2 * PI * r;
 * return cir;
 * }
 * 
 * // driver function
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * double r = sc.nextDouble();
 * double result = Math.round(circumference(r) * 1000) / 1000.0;
 * System.out.println("Circumference = " + result);
 * }
 */

class demo {
    public static void main(String[] args) {
        // System.out.println(011);

        // ArrayList List = new ArrayList<>();
        // List.add("hello");
        // List.add(1234);
        // System.out.println(List);
        // String str = (String) List.get(0);
        // Box box = new Box();
        // box.setValue(2);
        // String i=(String) box.getValue();
        // System.out.println(i);
        int[] arr2 = new int[5];
        int[] arr1 = { 2, 7, 9, 88, 90 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i : arr1) {
            System.out.println(i);
        }

    }

}
