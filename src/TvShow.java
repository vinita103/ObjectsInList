public class TvShow {

   private String showName;

   private int numberOfEpisodes;

   private String genre;

   public TvShow(String showName, int numberOfEpisodes, String genre) {
      this.showName = showName;
      this.numberOfEpisodes = numberOfEpisodes;
      this.genre = genre;

   }

   // method to get TV Show name

   public String getShowName() {

      return showName;

   }

   // method to get number of episodes

   public int getNoOfEpisodes() {

      return numberOfEpisodes;

   }

   // method to get genre

   public String getGenre() {

      return genre;

   }

   // method to print TV show details

   @Override

   public String toString() {

      return "The name of the show is " + getShowName() + " with " + getNoOfEpisodes() + " number of episodes."
            + " The genre is " + getGenre();

   }

}
