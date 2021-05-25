
import java.io.Serializable;

public class Teacher implements Serializable {

    int Teachersid;
    String Firstname;
    String Lastname;
    String mailid;
    int age;
    String Gender;
    String subject;
    int Salary;
    String Class;
    String mobilenumber;

    Teacher() {

    }

    Teacher(int Teacherid , String Firstname, String Lastname ,String mailid,int age,String gender,String Subject,int Salary, String Class,String mobilenumber)
    {
        this.Teachersid =  Teacherid;
        this.Firstname =  Firstname;
        this.Lastname =  Lastname;
        this.mailid =  mailid;
        this.age = age;
        this.Gender =  gender;
        this.subject = Subject;
        this.Salary = Salary;
        this.Class = Class;
        this.mobilenumber = mobilenumber;
    }

    void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    void setClass(String c)
    {
        this.Class =  c;
    }

    void setTeachersid(int teachersid)
    {
        this.Teachersid =  teachersid;
    }

    void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    void setMailid(String mailid) {
        this.mailid = mailid;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(String gender) {
        this.Gender = gender;
    }

    void setSubject(String Subject)
    {
        this.subject = Subject;
    }

    void setSalary(int salary)
    {
        this.Salary =  salary;
    }

    void show()
    {
        System.out.format("%3d\t\t%18s\t\t%18s\t\t%9s\t\t%10s\t\t%3d\t\t%8d\n",Teachersid,Firstname,Lastname,subject,Class,age,Salary);
    }

    void SalaryDetails()
    {
        System.out.format(" Id : %2d\t\tName : %10s\t\t%10s\t\tSalary : %10d\n",Teachersid,Firstname,Lastname,Salary); 
    }

}
