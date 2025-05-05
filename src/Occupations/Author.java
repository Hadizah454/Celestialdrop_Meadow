// able to sell books
public class Author extends Occupation{
    int books;

    public Author(String job, int books){
        super("author");
        this.books = books;
    }

    @Override
    public boolean canBuild(String building){
        return building.equals("house");
    }

    //what else should the occupation classes have in them?
}