
package problem1;

import java.util.Scanner;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class ascending {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,temp;
        
        System.out.println("Enter the array size : ");
        n = input.nextInt();
        
        int num[] =  new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("After the sorting in ascending order : ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(num[i]+", ");
            
        }
        System.out.print(num[n-1]);
        
    }
    
}
