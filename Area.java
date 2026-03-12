import java.util.Scanner;
class Area_shape{
        double area(double r){
                return Math.PI*r*r;
        }

        double area(double l,double b){
                return l*b;
        }

        double area(float base,float height){
                return 0.5*base*height;
        }

        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                Area obj=new Area();

                System.out.print("Enter radius of circle:");
                double r=sc.nextDouble();
                System.out.println("Area of circle="+obj.area(r));

                System.out.print("Enter length of rectangle:");
                double l=sc.nextDouble();
                System.out.print("Enter breadth of rectangle:");
                double b=sc.nextDouble();
                System.out.println("Area of rectangle="+obj.area(l,b));

                System.out.print("Enter base of triangle:");
                float base=sc.nextFloat();
                System.out.print("Enter height of triangle:");
                float h=sc.nextFloat();
                System.out.println("Area of triangle="+obj.area(base,h));
        }
}
