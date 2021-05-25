
import java.util.Scanner;
import java.util.Vector;

public class Admin 
{

    static Vector<Student> Studentsdata = new Vector<>();
    static Vector<Teacher> Teachersdata = new Vector<>();

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        initialize();
        Start();
    }
    

    public static void Start() {
        while (true) {
            System.out.println(
                    "\n\n\n------------------------------------Welcome to School management System ----------------------------\n\n\n\n");

            int option;
            System.out.println(
                    "Press '1' to Enter Student section \nPress '2' to enter Teacher Section \nPress '3' to Exit\n");
            option = S.nextInt();

            if (option == 1) {
                StudentSection();
            } else if (option == 2) {
                TeachersSection();
            } else {
                System.exit(0);
            }
        }
    }

    public static void StudentSection() {
        while (true) {
            System.out.println(
                    "\n\n------------------------------------ Student Section ----------------------------------------------------------\n\n");

            int option;
            System.out.print(
                    "1.Show\n2.Insert\n3.Update\n4.Delete\n5.Search\n6.Pay Fees\n7.Fees Information\n8.Back\n\n");
            option = S.nextInt();

            if (option == 1) {
                student_Show();
            } else if (option == 2) {
                student_insert();
            } else if (option == 3) {
                Student_Update();
            } else if (option == 4) {
                Student_Delete();
            } else if (option == 5) {
                Student_Search();
            } else if (option == 6) {
                student_payfess();
            } else if (option == 7) {
                FeeInformation();
            } else if (option == 8) {
                return;
            } else {
                System.out.println("You have seclected Wrong option ! Please try Again");
            }
        }
    }

    public static void TeachersSection() {

        while (true) {
            System.out.println(
                    "\n\n------------------------------------ Teachers Section ------------------------------------------------\n\n");

            int option;
            System.out.print("1.Show\n2.Insert\n3.Update\n4.Delete\n5.Search\n6.Salary Information\n7.Back\n\n: ");
            option = S.nextInt();

            if (option == 1) {
                teacher_Show();
            } else if (option == 2) {
                Teacher_insert();
            } else if (option == 3) {
                teachers_update();
            } else if (option == 4) {
                teachers_delete();
            } else if (option == 5) {
                teacher_search();
            } else if (option == 6) {
                SalaryInformation();
            }
            else if(option == 7)
            {
                return;
            } 
            else {
                System.out.println("You have seclected Wrong option ! Please try Again");
            }
        }
    }

    public static void student_insert() {

        System.out.print("--------------- ---------------------------------------------\n");

        Student temp = new Student();
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

        System.out.print("Enter Roll no : ");
        Rollno = S.nextInt();
        temp.setRollno(Rollno);

        System.out.print("Enter First Name : ");
        Firstname = S.next();
        temp.setFirstname(Firstname);

        System.out.print("Enter Last Name : ");
        Lastname = S.next();
        temp.setLastname(Lastname);

        System.out.print("Enter GR number : ");
        Grnumber = S.nextInt();
        temp.setGrnumber(Grnumber);

        System.out.print("Enter mailid : ");
        mailid = S.next();
        temp.setMailid(mailid);

        String buffer;
        buffer = S.nextLine();

        System.out.print("Enter Address : ");
        Address = S.nextLine();
        temp.setAddress(Address);

        System.out.print("Enter age : ");
        age = S.nextInt();
        temp.setAge(age);

        System.out.print("Enter dob in numbers Ex 16/09/1994 as 16091994 : ");
        dob = S.next();
        temp.setDob(dob);

        System.out.print("Enter Gender : ");
        Gender = S.next();
        temp.setGender(Gender);

        System.out.print("Enter mobilenumber : ");
        mobilenumber = S.next();
        temp.setMobilenumber(mobilenumber);

        Studentsdata.add(temp);

        System.out.println("Data inserted Sucessfully!");
    }

    public static void student_Show() {

        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.format("%3s\t\t%18s\t\t%18s\t\t%9s\t\t%18s\t\t\t%3s\n", "Rollno", "Firstname", "Lastname",
                "Grnumber", "mailid", "age");
                System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Student temp : Studentsdata) {
            temp.show();
        }


    }

    public static void teachers_delete() {

        int id;
        System.out.print("Enter Teacher's id : ");
        id = S.nextInt();

        for (Teacher temp : Teachersdata) {
            if (temp.Teachersid == id) {
                Teachersdata.remove(temp.Teachersid);
                System.out.println("Record DeletED Sucessfully!");
                return;
            }
        }

        System.out.println("Data not found");
    }

    public static void Student_Search() {
        int option;
        System.out.print("\n------------------------------------------\n");
        System.out.print("1.Search by Rollno\n2.Search by Name\n");
        System.out.print("------------------------------------------\n\n: ");

        option = S.nextInt();

        if (option == 1) {
            int Rollno;
            System.out.print("Enter the roll no : ");
            Rollno = S.nextInt();

            for (Student temp : Studentsdata) {

                if (temp.Rollno == Rollno) {
                    System.out.println();
                    temp.show();
                    return;
                }

            }
            System.out.println("Data not found");

        } else if (option == 2) {

            System.out.println();
            String fname, lname;
            System.out.print("Enter the First name : ");
            fname = S.next();
            System.out.print("Enter the Last name : ");
            lname = S.next();

            System.out.format("%3s\t\t%18s\t\t%18s\t\t%9s\t\t%18s\t\t\t%3s\n", "Rollno", "Firstname", "Lastname",
            "Grnumber", "mailid", "age");

            for (Student temp : Studentsdata) {

                if ((temp.Firstname.equals(fname))) {

                    System.out.println();
                    temp.show();
                } else if (temp.Lastname.equals(lname)) {
                    System.out.println();
                    temp.show();
                }
            }

        } else {
            System.out.println("You have Selected Wrong Option, PLease try again");
        }
    }

    public static void teacher_Show() {

        System.out.print(
                "\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.format("%3s\t\t%18s\t\t%18s\t\t%9s\t\t%10s\t\t%3s\t\t%8s\n", "id", "Firstname", "Lastname",
                "subject", "Class", "age", "Salary");
        System.out.print(
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for (Teacher temp : Teachersdata) {
            temp.show();
        }
    }

    public static void Student_Update() {

        System.out.print("---------------------------------------------------------------------\n");

        int Rollno;
        System.out.print("Enter the roll no : ");
        Rollno = S.nextInt();

        for (Student temp : Studentsdata) {
            if (temp.Rollno == Rollno) {

                while (true) {

                    System.out.print("\nEnter the option that you want to Update : ");

                    int options;
                    System.out.print(
                            "\n\n1.Rollno\n2.Firstname\n3.Lastname\n4.Grnumber\n5.mailid\n6.Address\n7.age\n8.dob\n9.Gender\n10.mobilenumber\n11.Back\n\n: ");
                    options = S.nextInt();

                    if (options == 1) {
                        System.out.print("Enter new Roll no : ");
                        temp.Rollno = S.nextInt();
                    } else if (options == 2) {
                        System.out.print("Enter new First name : ");
                        temp.Firstname = S.next();
                    } else if (options == 3) {
                        System.out.print("Enter the new Last name : ");
                        temp.Lastname = S.next();
                    } else if (options == 4) {
                        System.out.print("Enter the new Gr number : ");
                        temp.Grnumber = S.nextInt();
                    } else if (options == 5) {
                        System.out.print("Enter new mailid : ");
                        temp.mailid = S.next();
                    } else if (options == 6) {
                        System.out.print("Enter new Address : ");
                        temp.Address = S.next();
                    } else if (options == 7) {
                        System.out.print("Enter new age : ");
                        temp.age = S.nextInt();
                    } else if (options == 8) {
                        System.out.print("Enter dob age : ");
                        temp.dob = S.next();
                    } else if (options == 9) {
                        System.out.print("Enter new Gender : ");
                        temp.Gender = S.next();
                    } else if (options == 10) {
                        System.out.print("Enter new mobile number : ");
                        temp.mobilenumber = S.next();
                    } else if (options == 11) {
                        return;
                    } else {
                        System.out.println("You have Selected Wrong Option, PLease try again");
                    }
                }
            }
        }

        System.out.println("Roll number not found, Please Try Again !");
    }

    public static void Student_Delete() {

        int Rollno;
        System.out.print("Enter the roll no : ");
        Rollno = S.nextInt();

        for (Student temp : Studentsdata) {
            if (temp.Rollno == Rollno) {
                Studentsdata.remove(temp);
                System.out.println("Record Deleted Sucessfully");
                return;
            }
        }

        System.out.println("Data not found");

    }

    public static void student_payfess() {

        int amount;
        System.out.print("Enter the amount in Rupees  : ");
        amount = S.nextInt();

        int Rollno;
        System.out.print("Enter the Roll no : ");
        Rollno = S.nextInt();

        for (Student temp : Studentsdata) {

            if (temp.Rollno == Rollno) {
                if (amount <= temp.FeesRemaining)
                    temp.payFees(amount);
                else {
                    System.out.format("Entered amount is greater than Required i.e %d\n", temp.FeesRemaining);
                    return;
                }

                System.out.format("Fees Paid Sucessfully!  Fees Remaining : %d\n", temp.FeesRemaining);
                return;
            }
        }

        System.out.println("No Data found");

    }

    public static void FeeInformation() {
        for (Student temp : Studentsdata) {
            temp.FeesInformation();
        }
    }

    public static void Teacher_insert() {

        Teacher temp = new Teacher();

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

        System.out.print("Enter Teachers id : ");
        Teachersid = S.nextInt();
        temp.setTeachersid(Teachersid);

        System.out.print("Enter First Name : ");
        Firstname = S.next();
        temp.setFirstname(Firstname);

        System.out.print("Enter Last Name : ");
        Lastname = S.next();
        temp.setLastname(Lastname);

        System.out.print("Enter mailid : ");
        mailid = S.next();
        temp.setMailid(mailid);

        System.out.print("Enter age : ");
        age = S.nextInt();
        temp.setAge(age);

        System.out.print("Enter Gender : ");
        Gender = S.next();
        temp.setGender(Gender);

        System.out.print("Enter Class : ");
        Class = S.next();
        temp.setClass(Class);

        System.out.print("Enter Subject : ");
        subject = S.next();
        temp.setSubject(subject);

        System.out.print("Enter Salary : ");
        Salary = S.nextInt();
        temp.setSalary(Salary);

        System.out.print("Enter mobile number : ");
        mobilenumber = S.next();
        temp.setMobilenumber(mobilenumber);

        Teachersdata.add(temp);

        System.out.println("Record Inserted Sucessfully");
    }

    public static void teacher_search() {

        int options;
        System.out.print("1.Search by Teacher's id\n2.Search by Name\n3.Search by Subject\n\n\n");
        options = S.nextInt();

        if (options == 1) {
            int id;
            System.out.print("Enter the roll no : ");
            id = S.nextInt();

            for (Teacher temp : Teachersdata) {
                if (temp.Teachersid == id) {
                    temp.show();
                    break;
                }
            }

        } else if (options == 2) {
            String fname, lname;
            System.out.print("Enter the First name : ");
            fname = S.next();
            System.out.print("Enter the Last name : ");
            lname = S.next();

            System.out.print(
                    "\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.format("%3s\t\t%18s\t\t%18s\t\t%9s\t\t%10s\t\t%3s\t\t%8s\n", "id", "Firstname", "Lastname",
                    "subject", "Class", "age", "Salary");
            System.out.print(
                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            for (Teacher temp : Teachersdata) {
                if ((temp.Firstname.equals(fname)) || temp.Lastname.equals(lname)) {
                    temp.show();
                }
            }
        } else if (options == 3) {
            String subject;
            System.out.print("Enter Subject : ");
            subject = S.next();

            System.out.print(
                    "\n\n---------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.format("%3s\t\t%18s\t\t%18s\t\t%9s\t\t%10s\t\t%3s\t\t%8s\n", "id", "Firstname", "Lastname",
                    "subject", "Class", "age", "Salary");
            System.out.print(
                    "-----------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            for (Teacher temp : Teachersdata) {
                if (temp.subject.equals(subject)) {
                    temp.show();
                }
            }
        } else {
            System.out.print("You have Selected Wrong Option");
        }

    }

    public static void teachers_update() {
        int id;
        System.out.print("Enter the Teacher's id : ");
        id = S.nextInt();

        for (Teacher temp : Teachersdata) {
            if (temp.Teachersid == id) {

                while (true) {

                    int options;
                    System.out.print(
                            "1.Teachersid\n2.Firstname\n3.Lastname\n4.mailid\n5.age\n6.Gender\n7.Subject\n8.Salary\n9.mobilenumber\n10.Class\n11.back\n\n: ");
                    options = S.nextInt();

                    if (options == 1) {
                        System.out.print("Enter new Teacher's id : ");
                        temp.Teachersid = S.nextInt();
                    } else if (options == 2) {
                        System.out.print("Enter new First name : ");
                        temp.Firstname = S.next();
                    } else if (options == 3) {
                        System.out.print("Enter new Last name : ");
                        temp.Lastname = S.next();
                    } else if (options == 4) {
                        System.out.print("Enter the new mail id : ");
                        temp.mailid = S.next();
                    } else if (options == 5) {
                        System.out.print("Enter new age : ");
                        temp.age = S.nextInt();
                    } else if (options == 6) {
                        System.out.print("Enter new Gender : ");
                        temp.Gender = S.next();
                    } else if (options == 7) {
                        System.out.print("Enter new Subject : ");
                        temp.subject = S.next();
                    } else if (options == 8) {
                        System.out.print("Enter new Salary : ");
                        temp.Salary = S.nextInt();
                    } else if (options == 9) {
                        System.out.print("Enter new mobile number : ");
                        temp.mobilenumber = S.next();
                    } else if (options == 10) {
                        System.out.println("Enter new Class  :");
                        temp.Class = S.next();
                    } else if (options == 11) {
                        return;
                    } else {
                        System.out.println("Wrong Option Entered");
                    }
                }
            }
        }

        System.out.println("No Data Found");

    }


    public static void SalaryInformation()
    {
        
        System.out.println();
        for(Teacher temp : Teachersdata)
        {
            temp.SalaryDetails();
        }
        System.out.println();

    }

    public static void initialize() {

        Student temp = new Student(1, "Harry", "Potter", 11910457, "Harry.Potter19@vit.edu", "Hogwarts", 20, "14082000",
                "M", "9373632990", "CSE");
        Studentsdata.add(temp);

        temp = new Student(2, "Levi", "Acker", 11910460, "Levi.Ackerman19@vit,edu", "Shiganshima", 25, "16081995", "M",
                "9373632991", "CSE");
        Studentsdata.add(temp);

        temp = new Student(3, "Erwim", "Smith", 11910451, "ErwinSmith@vit.edu", "Shiganshima", 30, "09081994", "M",
                "9373632923", "IT");
        Studentsdata.add(temp);

        temp = new Student(4, "Hermoine", "Granger", 11910007, "Granger19@vit.edu", "Hogwarts", 20, "14022001", "F",
                "9845221340", "ENTC");

        Studentsdata.add(temp);

        temp = new Student(5, "Harry", "Styles", 11910008, "HarryStyles@gmail.com", "London", 34, "2306187", "M",
        "9373632991", "Music");
Studentsdata.add(temp);

        temp = new Student(6, "Alan", "Turing", 11910001, "AlanTuring@gmail.com", "London", 40, "23061912", "M",
                "9373632991", "Cryptography");
        Studentsdata.add(temp);

        temp = new Student(7, "Stephen", "Hawking", 11910002, "StephenHawking@vit.edu", "London", 45, "08011942", "M",
                "7639340262", "Atronomy");
        Studentsdata.add(temp);

        Teacher T = new Teacher(1, "Walter", "White", "WalterWhite@gmail.com", 34, "M", "Chemistry", 50000, "X",
                "9373632990");

        Teachersdata.add(T);

        T = new Teacher(2, "Severus", "Snape", "SeverusSnape@gmail.com", 30, "M", "Philosophy", 40000, "XI",
                "9764230912");

        Teachersdata.add(T);

        T = new Teacher(3, "Richard", "Feynman", "RichardFeynman@gmail.com", 40, "M", "Physics", 90000, "XII",
                "8756983432");
        Teachersdata.add(T);

        T = new Teacher(3, "HarishChandra", "Verma", "HCVERMA@gmail.com", 50, "M", "Physics", 90000, "XII",
        "8756983431");
Teachersdata.add(T);


    }
}