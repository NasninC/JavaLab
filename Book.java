import java.util.Scanner;
class Publisher{
        String pname;

        void getPublisher(String pname){
                this.pname=pname;
        }
}

class book extends Publisher{
        String title;
        String author;

        void getbook(String title,String author){
                this.title=title;
                this.author=author;
        }
}

class Literature extends book{
        void display(){
                System.out.println("\n---Literature book details---");
                System.out.println("Title: "+title);
                System.out.println("Author: "+author);
                System.out.println("Publisher: "+pname);
        }
}

class Fiction extends book{
        void display(){
                System.out.println("\n---Fiction book details---");
                System.out.println("Title: "+title);
                System.out.println("Author: "+author);
                System.out.println("Publisher: "+pname);
        }
}

public class Book{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                Literature l=new Literature();
                Fiction f=new Fiction();

                System.out.println("Enter Literature book details:");
                System.out.print("Title: ");
                String title=sc.nextLine();
                System.out.print("Author: ");
                String author=sc.nextLine();
                System.out.print("Publisher: ");
                String publisher=sc.nextLine();

                l.getbook(title,author);
                l.getPublisher(publisher);

                System.out.println("\nEnter Fiction book details:");
                System.out.print("Title: ");
                title=sc.nextLine();
                System.out.print("Author: ");
                author=sc.nextLine();
                System.out.print("Publisher: ");
                publisher=sc.nextLine();

                f.getbook(title,author);
                f.getPublisher(publisher);


                l.display();
                f.display();
        }
}
