
/**
 * Write a description of interface WrittenWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface WrittenWork
{
    
    public int getNumPages();
    
    public String getAuthorName();
    
    public String getTitle();
    
    public double getPrice();
    
    public void addAuthor(Author author);
    
    public boolean hasAuthor(Author a);
}
