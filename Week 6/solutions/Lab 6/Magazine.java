import java.util.ArrayList;
/**
 * Write a description of class Magazine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine implements WrittenWork
{
    private String title;
    private ArrayList<Author> authors;
    
    public Magazine(String title){
        this.title = title;
        authors = new ArrayList<>();
    }
    
    public void addAuthor(Author a){
        authors.add(a);
    }
    
    public String getAuthorName(){
        String authorNames = "";
        for(Author a: authors)
            authorNames += a.getName() + " ";
        return authorNames;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getNumPages(){
        return 3 * authors.size();
    }
    
    public double getPrice(){
        return 50.0;
    }
    
    public boolean hasAuthor(Author a){
        return authors.contains(a);
    }
}
