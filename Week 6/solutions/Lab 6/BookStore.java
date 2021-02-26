import java.util.ArrayList;

/**
 * Write a description of class BookStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookStore
{
    public static void main(String[] args){
        //WrittenWork w = new WrittenWork();
        //Book b = new Book();
        
        Author a1 = new Author("Malcolm Gladwell");
        Author a2 = new Author("Steven Johnson");
        Author a3 = new Author("Mathias Johansson");
        Author a4 = new Author("Evan Ackerman");
        Author a5 = new Author("Erico Guizzo");
        Author a6 = new Author("Fan Shi");
        
        WrittenWork w1 = new Novel(a1, 
            "What the Dog Saw and other adventures", 503);
        WrittenWork w2 = new Novel(a2, 
            "How We Got to Now: Six Innovations That Made the Modern World", 320);
        WrittenWork w3 = new Novel(a2, 
            "Everything Bad is Good for You: How Today's Popular Culture is Actually Making Us Smarter", 254);
            
        //System.out.println(w1.toString());
        //System.out.println(w2.toString());
        //System.out.println(w3.toString());
        
        ArrayList<WrittenWork> products = new ArrayList<>(); 
        products.add(w1);
        products.add(w2);
        products.add(w3);
        
        for(WrittenWork w: products) 
            System.out.println(w.toString());

        ArrayList<Author> authors = new ArrayList<>(); 
        authors.add(a1);
        authors.add(a2);
        authors.add(a3);
        authors.add(a4);
        authors.add(a5);
        authors.add(a6);
        
        for(Author a: authors) 
            System.out.println(a.toString());
            
        for(Author a: authors) {
            for(WrittenWork w: products) {
                if(w.getAuthorName().equals(a.getName()))
                    a.addNewBook();                
            }
        }
        
        
        WrittenWork mag = new Magazine("IEEE Spectrum");
        products.add(mag); 
        mag.addAuthor(a3);
        mag.addAuthor(a4);
        mag.addAuthor(a5); 
        mag.addAuthor(a6);
        
        System.out.println("Malcolm Gladwell authored a Novel specifically");
        System.out.println(w1.hasAuthor(a1));//should be true
        
        System.out.println("IEEE Spectrum authored by Mathias Johansson");
        System.out.println(mag.hasAuthor(a3));//should be true
    }
}
