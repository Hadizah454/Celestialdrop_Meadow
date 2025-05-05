// able to sell books
public class Author extends Occupation{
    int books;

    public Author(String job, int books){
        super("author");
        this.books = books;
    }


    //start off with 10 books in inventory and finish writing a new book every 3 days?
}