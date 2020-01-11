
package problem6;

/**
 *
 * @author TANZIMUL ISLAM
 */
public class inheritance {
    
    String name;
    int roll;
    double marks;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
    void displayData(){
        
        if(marks<=100 && marks>=80)
        {
            System.out.println("Grade : A+");
        }
        else if(marks>=75){
            System.out.println("Grade : A");
        }
        else{
            System.out.println("Grade : A-");
        }
        
    }
    
    
}
