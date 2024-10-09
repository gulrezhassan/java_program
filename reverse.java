
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String name = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.reverse();
        System.out.println(sb);
    }
}

// public class reverse {

// public static void main(String args[]) {

// System.out.println("enter any number");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// while (n > 0) {
// int r = n % 10;
// System.out.print(r);
// n = n / 10;

// }

// }

// }

/*
 * public class Functions {
 * 
 * 
 * public static void main(String[] args) {
 * do {
 * 
 * } while (true);
 * }
 * 
 * }
 */
// public static boolean Elligible(int age) {
// if (age > 18) {
// return true;
// }
// return false;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();
// System.out.println("elligible age:" + Elligible(age));

// }

// public static Double circum(Double r) {
// return 2 * 3.14 * r;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Double r = sc.nextDouble();
// System.out.println(circum(r));
// }
// }
// public static int oddSum(int n) {
// return 1;

// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int n = sc.nextInt();
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// if (i % 2 == 1)
// sum = sum + i;
// }
// System.out.println("sum of odd number:" + sum);

// }

// public static double calAvg(double a, double b, double c) {
// return (a + b + c) / 3;

// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// double a = sc.nextDouble();
// double b = sc.nextDouble();
// double c = sc.nextDouble();

// double avg = calAvg(a, b, c);

// System.out.println("avg of three number is: " + avg);
// }
// }

// public static int calculateSum(int a,int b){
// int sum=a+b;
// return sum;
// }

// public static int product(int a, int b) {
// return a * b;

// public static void printFactorial(int n) {
// if (n < 0) {
// System.out.println("Invalid input");
// return;
// }
// int factorial = 1;
// for (int i = n; i >= 1; i--) {
// factorial = factorial * i;
// }
// System.out.println(factorial);
// return;

// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// printFactorial(n);//functioning call

// }
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// System.out.println("product of two numbers is:" + product(a, b));
// }

// public static void printMyName(String name) {
// System.out.println(name);
// return;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.next();

// printMyName(name);
// }
// }
// diamond shape

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");

// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");

// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// // palindromic pattern
// int n = 5;
// for (int i = 1; i <= n; i++) {

// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j >= 1; j--) {
// System.out.print(j);
// }
// for (int j = 2; j <= i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j >= 1; j--) {
// System.out.print(j);
// }
// for (int j = 2; j <= i; j++) {
// System.out.print(j);
// }
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println();
// }

// solid Rhombus

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// for (int j = 1; j <= 5; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// butterfly pattern
// int n = 5;

// // upper half
// for (int i = 1; i <= n; i++) {
// // 1st part
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // spaces
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// // 2nd part
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// // lower half
// for (int i = n; i >= 1; i--) {
// // 1st loop
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // spaces
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// // 2nd part
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();

// }

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("n");

// }
// System.out.println();
// }

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// int s = i + j;
// if (s % 2 == 0) {
// System.out.print("1 ");
// } else {
// System.out.print("0 ");
// }
// }
// System.out.println();
// }

// int number = 1;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {

// System.out.print(number + " ");
// number++;
// }
// System.out.println();

// }

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i + 1; j++) {
// System.out.print(j);
// }
// System.out.println();
// }
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println();
// }

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();
// }

// int n = 5;
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();
// }

// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// int n = 5;
// int m = 6;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || j == 1 || i == n || j == m) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// int n=4;
// int m=5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= m; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for (int i = 1; i < 11; i++) {
// System.out.println(i * n);
// }
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int s = 0;
// for (int i = 1; i <= n; i++) {
// s = s + 1;

// }
// System.out.println(s);

// int i = 12;
// while (i < 11) {
// System.out.println("Hello Java");

// }
// do {
// System.out.println("Hello Java");

// } while (i < 10);
// int i = 0;
// do {
// System.out.println(i);
// i = i + 2;
// } while (i < 100);
// int i = 0;
// while (i < 100) {
// System.out.println(i);
// i++;
// }

// for (int n = 0; n < 100; n++) {
// System.out.println(n + " ");
// }

// for (int c = 0; c < 5; c = c + 1) {

// System.out.println("Hello Universe!");
// }

/**
 * double n1, n2;
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.println("enter the number");
 * n1 = sc.nextDouble();
 * n2 = sc.nextDouble();
 * System.out.println("enter the operator(+,-,*,/)");
 * char op = sc.next().charAt(0);
 * double o = 0;
 * switch (op) {
 * case '+':
 * o = n1 + n2;
 * break;
 * case '-':
 * o = n1 - n2;
 * break;
 * case '*':
 * o = n1 * n2;
 * break;
 * case '/':
 * o = n1 / n2;
 * break;
 * default:
 * System.out.println("invalid operator");
 * }
 * System.out.print("The result is ");
 * System.out.println(o);
 * 
 * System.out.println(n1 + " " + op + " " + n2 + " " + o);
 * 
 * /**
 * int button = sc.nextInt();
 * switch (button) {
 * case 1:
 * System.out.println("hello");
 * break;
 * case 2:
 * System.out.println("namste");
 * break;
 * case 3:
 * System.out.println("bonjure");
 * break;
 * default:
 * System.out.println("invalid");
 * 
 * }
 * 
 * /**
 * if (button == 1) {
 * System.out.println("hello");
 * } else if (button == 2) {
 * System.out.println("namste");
 * } else if (button == 3) {
 * System.out.println("bonjur");
 * } else {
 * System.out.println("invalid");
 * }
 * 
 * /**
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int b = sc.nextInt();
 * 
 * if (a == b) {
 * System.out.println("equal");
 * } else if (a > b) {
 * System.out.println("a greater than b");
 * } else {
 * System.out.println("a is lesser than b");
 * }
 * 
 * }
 * }
 * 
 * /**
 * Scanner sc = new Scanner(System.in);
 * int q = sc.nextInt();
 * if (q % 2 == 0) {
 * System.out.println("even");
 * } else {
 * System.out.println("odd");
 * }
 * 
 * /**
 * Scanner sc = new Scanner(System.in);
 * int age = sc.nextInt();
 * if (age > 18) {
 * System.out.println("adult");
 * } else {
 * System.out.println("child");
 * }
 */

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int s = a + b;
// System.out.println(s);

// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println(name);

/**
 * String name="John";
 * int age=33;
 * double price=9.50;
 * int a=33;
 * int b=22;
 */

/**
 * int a = 22;
 * int b = 33;
 * int s = a + b;
 * // System.out.println(s);
 * int mul = a * b;
 * System.out.println(mul);
 */
// int a = 4;
// int b = 5;
// int ans = (a * b) / (b - a);
// System.out.println(ans);
