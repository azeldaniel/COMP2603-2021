
/**
 * Abstract class Book - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Book implements WrittenWork 
{
    private Author author;
    private String title;
    private int numPages;
    private double price;
    
    public Book(String title, int numPages){
        this.title = title;
        this.numPages = numPages;
    }
    
    public void addAuthor(Author a){
        author = a;
    }
    
    public String getAuthorName(){
        if(author != null)
            return author.getName();
        else
            return "";
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getNumPages(){
        return numPages;
    }
}
