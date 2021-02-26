
/**
 * Write a description of class Novel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Novel extends Book
{
    public Novel(Author author, String title, int numPages){
        super(title, numPages);
        addAuthor(author);
    }
    
    public double getPrice(){
        return 0.75 * getNumPages();
    }
    
    public String toString(){
        String details = "NOVEL: "+ getTitle() + "\n";
        details += getAuthorName() + "\n";
        details += getPrice() + "\n";
        details += getNumPages() + "\n";
        return details;
    }
    
    public boolean hasAuthor(Author a){
        return getAuthorName().equals(a.getName());
    }
}
