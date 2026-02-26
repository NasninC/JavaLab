import java.util.Scanner;

class Employee{
        int eNo;
        String eName;
        double eSalary;

        void readData(Scanner sc){
                System.out.print("\nEnter employee number:");
                eNo=sc.nextInt();
                sc.nextLine();

                System.out.print("Enter employee name:");
                eName=sc.nextLine();

                System.out.print("Enter employee salary:");
                eSalary=sc.nextDouble();
        }

        void display(){
                System.out.println("Employee number:"+eNo);
                System.out.println("Employee name:"+eName);
                System.out.println("Employee salary:"+eSalary);
        }
}
public class employee{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                System.out.print("Enter number of employees:");
                int n=sc.nextInt();

                Employee[] emp=new Employee[n];

                for(int i=0;i<n;i++){
                        System.out.print("\nEnter details for employee" +(i+1));
                        emp[i]=new Employee();
                        emp[i].readData(sc);
                }

                System.out.print("\nEnter employee number to search:");
                int searchNo=sc.nextInt();

                boolean found=false;

                for(int i=0;i<n;i++){
                        if(emp[i].eNo==searchNo){
                                System.out.println("\nEmployee found");
                                emp[i].display();
                                found=true;
                                break;
                        }
                }

                if(!found){
                        System.out.println("Employee not found");
                }
        }
}
