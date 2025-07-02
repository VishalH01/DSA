//Find prime number

import java.util.Scanner;
public class find_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) { // 2 to n-1
            if (n % i == 0) { // check if n is divisible by i
                count++; // if divisible, increment count
                break; // break the loop
            }
        }
        if (count == 0) { // if count is 0
            System.out.println(n + " is a prime number.");
        } else { // if count is not 0
            System.out.println(n + " is not a prime number.");
        }
    }
}
