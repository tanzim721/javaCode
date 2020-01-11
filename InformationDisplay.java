
package problem4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class InformationDisplay {
    public static void main(String[] args) {
        
        try{
            File file = new File("C:/Users/TANZIMUL ISLAM/Desktop/Java/BasicJava/Information/tanzim.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String name = scanner.next();
                System.out.println("Name : "+name);
            }
            scanner.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
