/**
 * Pyramid
 *
 ***
 *****
 *******
 *********
 * 
 */
public class Pyramid {
    public static void main(String[] args) {
        // row
        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            // start
            for (int o = 1; o <= i; o++) {
                System.out.print("*");
            }
            for (int o = 1; o < i; o++) {
                System.out.print("*");
            }
            // nextLine
            System.out.println();

        }
    }

}