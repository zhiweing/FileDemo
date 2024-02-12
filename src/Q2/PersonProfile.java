
package Q2;

/**
 *
 * @author ngzhi
 */
public class PersonProfile {
    private String name;
    private String gender;
    private String dob;
    
    PersonProfile(String a,String b,String c){
        this.name=a;
        this.gender=b;
        this.dob=c;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Date of birth: "+dob);
    }
}
