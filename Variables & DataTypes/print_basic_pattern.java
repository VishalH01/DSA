// print basic pattern

public class print_basic_pattern {
    public static void main(String[] args) {

        /*****
         ***
        / **
        */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        // ****
        // *****
        for (int m = 1; m<=5; m++ ){
            for(int n = 1; n<=m; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
