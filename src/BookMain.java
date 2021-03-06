import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

       
        Scanner user = new Scanner (System.in);

        // creating ArrayList

        ArrayList<Book> books = new ArrayList<>();
        
    //  creating 3 instances of class Book

        Book book1 = new Book ("Man's Search for Meaning", 192, 1947 );

        Book book2 = new Book ("I know Why the Caged Bird Sings", 304, 1969 );

        Book book3 = new Book ("Autobiography of a Yogi", 566, 1946);


        books.add(book1);
        books.add(book2);
        books.add(book3);

         // creating instances of Book Class with different constructors- for overloading practice

         Book book4 = new Book ("Man's Search for Meaning" );

         System.out.println(book4);

         Book book5 = new Book (304);

         System.out.println(book5);

        Book book6 = new Book ("Autobiography of a Yogi", 566);

        System.out.println(book6);

        Book book7 = new Book (304, 1969 );

        System.out.println(book7);    

         
        // creating statement for user input


        System.out.print("What information will be printed? ");

        String ans = user.nextLine();

        // printing all the details if entered everything

        if (ans.equalsIgnoreCase("everything")){

        
            for (Book book : books){
               System.out.println(book);
           }

        }

        // printing only titile if entered name

        if(ans.equalsIgnoreCase("name")){

            for (Book book : books)

            System.out.println(book.getTitle());

            user.close();

            
        }

        }

    }
    

        
        
    
    

