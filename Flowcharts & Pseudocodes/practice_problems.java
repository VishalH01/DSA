import java.util.Scanner;

public class practice_problems {
    public static void main(String[] args) {
        // calculate area of circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1. calculate area of circle");
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("The area of circle is: " + area);
        System.out.println();

        // find greatest form 2 numbers
        System.out.println("Q2. find greatest form 2 numbers");
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else {
            System.out.println("The greatest number is: " + num2);
        }
        System.out.println();

        // print even numbers between 9 to 100
        System.out.println("Q3. print even numbers between 9 to 100");
        System.out.println("The even numbers between 9 and 100 are: ");
        for (int i = 9; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
