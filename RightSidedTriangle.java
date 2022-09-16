/*   rightsided Triangle
     *
    **
   ***
  ****
 *****

 */

public class RightSidedTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {// row
            for (int j = i; j <= 5; j++) {// increasing space
                System.out.print(" ");
            }
            for (int o = 1; o <= i; o++) {// increasing star
                System.out.print("*");
            }
            System.out.println();// nextLine
        }
    }

}
