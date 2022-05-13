public class Book {

    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Creating constructor with three parameters

    public Book(String title, int numberOfPages, int publicationYear) {

        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Overloading Constructors

    // Second Constructor with string parameter

    public Book(String title) {
        this.title = title;

    }
    // third Constructor with int parameter

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;

    }

    // fourth Constructor with two int parameter

    public Book(int numberOfPages, int publicationYear) {
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // fifth Constructor with string and int parameter

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override

    public String toString() {

        return this.title + ", " + this.numberOfPages + " pages, " + this.publicationYear;

    }

    public String getTitle() {

        return this.title;
    }

}
