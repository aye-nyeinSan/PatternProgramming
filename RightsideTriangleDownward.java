/*  Rightside Triangle Downward
   *****
    ****
     ***
      **
       *
 */

public class RightsideTriangleDownward {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // row
            for (int j = 1; j <= i; j++) {
                // space
                System.out.print(" ");
            }
            for (int o = i; o <= 5; o++) { // star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
