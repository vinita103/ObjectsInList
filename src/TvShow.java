public class TvShow {

   private String showName;

   private int numberOfEpisodes;

   private String genre;

   // Creating first constructor with 3 parameters

   public TvShow(String showName, int numberOfEpisodes, String genre) {
      this.showName = showName;
      this.numberOfEpisodes = numberOfEpisodes;
      this.genre = genre;

   }


   // Overloading constructors 

    // Creating second constructor with only string  parameters

   public TvShow(String showName) {
      this.showName = showName;
     
      
   }
 // Creating third constructor with only int parameters

   public TvShow(int numberOfEpisodes) {
      
      this.numberOfEpisodes = numberOfEpisodes;
     

   }
 
    // Creating fourth constructor with String and int parameters

   public TvShow(String showName, int numberOfEpisodes) {
      this.showName = showName;
      this.numberOfEpisodes = numberOfEpisodes;
      

   }

    // Creating fifth constructor with int and String parameters

   public TvShow(int numberOfEpisodes, String genre) {
            this.numberOfEpisodes = numberOfEpisodes;
      this.genre = genre;

   }

   // Creating sixth constructor with 2 String parameters

   public TvShow(String showName,  String genre) {
      this.showName = showName;
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
