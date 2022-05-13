import java.util.ArrayList;
import java.util.Scanner;

public class TvMain {

    public static void main(String[] args) {

         // creating instances of TvShow Class with different constructors- for overloading practice

         TvShow  show1 = new TvShow ("Breaking Bad", 62, "Drama" );
         System.out.println(show1);

         TvShow  show2 = new TvShow ("Stranger Things" );         
         System.out.println(show2);

         TvShow  show3 = new TvShow ( 84 );         
         System.out.println(show3);

         TvShow  show4 = new TvShow ("Game of Thrones", 70);         
         System.out.println(show4);

         TvShow  show5 = new TvShow ("The Walking Dead ",  "Horror");         
         System.out.println(show5);

         TvShow  show6 = new TvShow ( 58, "Drama");         
         System.out.println(show6);


        // Creating Scanner Class for user input

        Scanner user = new Scanner(System.in);

        // creating array list of TV shows

        ArrayList<TvShow> TvShows = new ArrayList<>();

        // loop stops when nothing is entered

        while (true) {

            System.out.println("Name of the show: ");
            String name = user.nextLine();

            if (name == "") {

                break;
            }

            System.out.println("How many episodes?");

            int num = Integer.valueOf(user.nextLine());

            System.out.println("What is the genre?");

            String genre = user.nextLine();

            // adding TVShow details in Array List

            TvShows.add(new TvShow(name, num, genre));

        }

        // creating loop to print TV Show details

        for (TvShow tvShow : TvShows) {

            System.out.println(tvShow);

        }

        user.close();

    }

}
