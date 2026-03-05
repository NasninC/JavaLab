import java.util.Scanner;
class CPU{
    int price;

    class Processor{
        int cores;
        String manufacturer;

        void getProcessorData(Scanner sc){
            System.out.print("Enter number of cores");
            cores=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter processor manufacturer:");
            manufacturer=sc.nextLine();
        }

        void displayProcessor(){
            System.out.println("Processor cores:"+cores);
            System.out.println("Processor manufacturer:"+manufacturer);
        }
    }

    static class RAM{
            int memory;
            String manufacturer;

            void getRAMData(Scanner sc){
                    System.out.print("Enter RAM memory(GB):");
                    memory=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter RAM manufacturer:");
                    manufacturer=sc.nextLine();
            }

            void displayRam(){
                    System.out.println("RAM memory:"+memory+"GB");
                    System.out.println("RAM Manufacturer:"+manufacturer);
            }
    }
}

public class cpu
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                CPU cpu=new CPU();
                System.out.print("Enter CPU price:");
                cpu.price=sc.nextInt();
                sc.nextLine();

                CPU.Processor p=cpu.new Processor();
                p.getProcessorData(sc);

                CPU.RAM r=new CPU.RAM();
                r.getRAMData(sc);

                System.out.println("\n--CPU Information---");
                System.out.println("CPU Price:"+cpu.price);
                p.displayProcessor();
                r.displayRam();
        }
}
