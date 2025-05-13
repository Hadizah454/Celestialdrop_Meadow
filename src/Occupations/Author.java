
public class Author extends Occupation{
    private int books;

    public Author(String job, int books){
        super("author");
        this.books = books;
    }

    public int getBooks(){
        return books;
    }

    public void writeBook(){
        books += 1;
    }
}