
public class Author extends Occupation{
    private int books;

    /**
     * Creates a new Author with the job set to author; and the specified number of books
     * @param job - the name of the job[preset to author]
     * @param books - the number of books they have
     */
    public Author(String job, int books){
        super("author");
        this.books = books;
    }

    /**
     * returns the number of books the author has
     * @return
     */
    public int getBooks(){
        return books;
    }

    /**
     * writes a book and adds it to the total books the author has
     */
    public void writeBook(){
        books += 1;
    }
}