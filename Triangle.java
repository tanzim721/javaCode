
package problem2;

import java.util.Scanner;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class Triangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = input.nextInt();
        System.out.println("Display the left triangle : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
