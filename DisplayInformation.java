
package problem5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class DisplayInformation {
      public static void main(String[] args) {
        
          try{
            File file = new File("C:/Users/TANZIMUL ISLAM/Desktop/Java/BasicJava/Tanzim/student.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String roll = scanner.next();
                String name = scanner.next();
                System.out.println("Roll:"+roll +"  Name : "+name);
            }
            scanner.close();
        }catch(Exception e){
            System.out.println(e);
          
    }
 
          
}
