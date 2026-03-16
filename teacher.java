import java.util.Scanner;
class Employee{
        int empid;
        String name;
        double salary;
        String address;

        Employee(int id,String n,double s,String a){
                empid=id;
                name=n;
                salary=s;
                address=a;
        }
}
class Teacher extends Employee{
        String department;
        String subject;

        Teacher(int id,String n,double s,String a,String d,String sub){
                super(id,n,s,a);
                department=d;
                subject=sub;
        }

        void display(){
                System.out.println("Empid:"+empid);
                System.out.println("Name:"+name);
                System.out.println("Salary:"+salary);
                System.out.println("Address:"+address);
                System.out.println("Department:"+department);
                System.out.println("Subject:"+subject);
                System.out.println("---------------------");
        }
}

public class teacher{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                System.out.print("Enter number of teachers:");
                int n=sc.nextInt();
                sc.nextLine();

                Teacher t[]=new Teacher[n];

                for(int i=0;i<n;i++){
                        System.out.println("Enter details of teacher "+(i+1));

                        System.out.print("EmpID:");
                        int id=sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name:");
                        String name=sc.nextLine();

                        System.out.print("Salary:");
                        double salary=sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Address:");
                        String address=sc.nextLine();

                        System.out.print("Department:");
                        String dept=sc.nextLine();

                        System.out.print("Subject:");
                        String sub=sc.nextLine();

                        t[i]=new Teacher(id,name,salary,address,dept,sub);
                }
                System.out.println("\nTeacher details:");
                for(int i=0;i<n;i++){
                        t[i].display();
                }
        }
