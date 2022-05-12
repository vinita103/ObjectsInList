import java.util.ArrayList;
import java.util.Scanner;

public class TvMain {

    public static void main(String[] args) {

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
