// calculate simple interest

import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextFloat();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextFloat();
        System.out.println("Enter the time period: ");
        double t = sc.nextFloat();
        double si = (p * r * t) / 100;
        System.out.println("The simple interest is: " + si);
    }
}
