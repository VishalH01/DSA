import java.util.Scanner;

public class sum_of_first_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) { // 1 to n
            sum = sum + i; // sum = sum + i
        }
        System.out.println(sum);
    }
}
