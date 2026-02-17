import java.util.Scanner;
public class string_mani{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter first string:");
                String a=sc.nextLine();
                System.out.println("Enter second string:");
                String b=sc.nextLine();

                System.out.println("Length of first string: "+a.length());
                System.out.println("Concatenation: "+a.concat(b));
                System.out.println("Character at index 1: "+a.charAt(1));
                char[] ch = new char[3];
                a.getChars(0, 3, ch, 0);
                System.out.print("Characters copied: ");
                System.out.println(ch);

                System.out.println("Compare to: "+a.compareTo(b));
                System.out.println("Equals :"+a.equals(b));
                System.out.println("equalsIgnoreCase(): "+a.equalsIgnoreCase(b));
                System.out.println("Starts with a: " + a.startsWith("a"));
                System.out.println("Ends with a:"  + a.endsWith("a"));
                System.out.println("Conatins a: "+a.contains("a"));
                System.out.println("index of e:"+a.indexOf("e"));
                System.out.println("To upper case: "+a.toUpperCase());
                System.out.println("To lower case: "+a.toLowerCase());
                System.out.println("Replace: "+a.replace('p','a'));

                System.out.print("Enter integer value as string: ");
                String intStr = sc.nextLine();
                Integer intValue = Integer.valueOf(intStr);
                System.out.println("Integer value: " + intValue);

                System.out.print("Enter double value as string: ");
                String doubleStr = sc.nextLine();
                Double doubleValue = Double.valueOf(doubleStr);
                System.out.println("Double value: " + doubleValue);
        }
}
