


import java.io.Serializable;
import java.util.Vector;

public class Student  implements Serializable {


    int Rollno;
    String Firstname;
    String Lastname;
    int Grnumber;
    String mailid;
    String Address;
    int age;
    String dob;
    String Gender;
    String mobilenumber;
    String Branch;
    int FeesRemaining;
    int FeesPaid;


    Student() { }

    Student(int Rollno,String Firstname , String Lastname ,int grnumber,String mailid,String Address,int age, String dob,String gender,String number,String Branch)
    {
        this.Address = Address;
        this.Firstname = Firstname;
        this.Lastname =  Lastname;
        this.Rollno = Rollno;
        this.Grnumber =  grnumber;
        this.mailid = mailid;
        this.age = age;
        this.dob = dob;
        this.Gender = gender;
        this.mobilenumber = number;
        this.Branch = Branch;
        this.FeesRemaining = 50000;
        this.FeesPaid = 0;
    }

    void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    void setRollno(int Rollno) {
        this.Rollno = Rollno;
    }

    void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    void setMailid(String mailid) {
        this.mailid = mailid;
    }

    void setGrnumber(int grnumber) {
        this.Grnumber = grnumber;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setDob(String dob) {
        this.dob = dob;
    }

    void setGender(String gender) {
        this.Gender = gender;
    }

    void show()
    {
        System.out.format("%3d\t\t%18s\t\t%18s\t\t%9d\t\t%30s\t\t%3d\n",Rollno,Firstname,Lastname,Grnumber,mailid,age);
    }

    public void payFees(int Fees)
    {
        FeesPaid += Fees;
        FeesRemaining -= FeesPaid;
    }

    int getRemainingFees()
    {
        return FeesRemaining;
    }

    int getFeesPaid()
    {
        return FeesPaid;
    }

    void FeesInformation()
    {
        System.out.print("\n");
        System.out.format("Roll no : %2d\t\t Fees Paid : %2d \t\t FeesRemaining : %2d\n",Rollno,FeesPaid,FeesRemaining);
    }
    
}
