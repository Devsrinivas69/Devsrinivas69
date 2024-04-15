public class JAVA1 {

    public static void main(String[] args) {
      student s1 = new student();
      employee e1 = new employee();
      s1.sid = 69;
      s1.sname = "sri";
      s1.sage = 30;
      s1.show();
       
      e1.eid = 30;
      e1.ename = "many";
      e1.esalary = 500000;
      e1.leave();
    } 
  }
  
  class student {
    int sid;
    String sname;
    long sage;
    void show()
    {
      System.out.println("Student  ID = " + sid);
      System.out.println("Student  NAME = " + sname);
      System.out.println("Student  NUMBER = " + sage);
    }
  }
  class employee {
    int eid;
    String ename;
    long esalary;
    void leave() {
      System.out.println("Employee ID =" + eid);
      System.out.println("Employee NAME =" + ename);
      System.out.println("Employee SALARY =" + esalary);
    }
  }
   
  /*
  output:
  Student  ID = 99
  Student  NAME = sri   
  Student  NUMBER = 20  
  
  Employee ID =34       
  Employee NAME =manny  
  Employee SALARY =50000
  */ 
   
   
