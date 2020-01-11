
package problem3;

import java.util.Scanner;

import java.util.Formatter;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class NameRollFile {
    public static void main(String[] args) {
        String id,name;
        try{
            
        Formatter formatter = new Formatter("C:/Users/TANZIMUL ISLAM/Desktop/Java/BasicJava/test/Student.txt");
        Scanner input = new Scanner(System.in);
        System.out.print("How many students : ");
        int num = input.nextInt();
            for (int i = 1; i <= num ; i++) {
                System.out.print("Student id and name : ");
                
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n",id,name);
            }
        formatter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
