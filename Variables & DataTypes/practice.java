import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        // in a program input 3 number a,b,c you have to o/p the average of these 3
        // numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("The average of the three numbers is: " + (a + b + c) / 3);

        // in a program unput side of a square you have to o/p the area of a square
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        System.out.println("The area of a square is: " + side * side);

        // Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser.
        // You have to output the total cost of the items back to the user as their
        // bill.(Add on : You can also try adding 18% gst tax to the items in the bill
        // as an advanced problem

        System.out.println("Enter the cost of a pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float eraser = sc.nextFloat();
        System.out.println("The total cost of the items including 18% gst is: "
                + ((pencil + pen + eraser) + ((pencil + pen + eraser) * 0.18)));
    }
}