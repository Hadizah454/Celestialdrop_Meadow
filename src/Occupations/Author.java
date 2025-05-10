
public class Author extends Occupation{
    int books;

    public Author(String job, int books){
        super("author");
        this.books = books;
    }

    public void writeBook(){
        books += 1;
    }
}