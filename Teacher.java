
package inheritance;

public class Teacher extends Person {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }  
        void displayInformation2(){
            displayInformation1();
            System.out.println("Qualification : "+qualification);
        }
}
