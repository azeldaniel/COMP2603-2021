public class Author{
    private String name;
    private int numBooksAuthored;
    private int numChaptersAuthored;
    
    public Author(String name){
        this.name = name;
        numBooksAuthored = 0;
        numChaptersAuthored = 0;
    }
    public String getName(){
        return name;
    }
    public int getNumBooksAuthored(){
        return numBooksAuthored;
    }
     public int getNumChaptersAuthored(){
        return numChaptersAuthored;
    }
    public void addNewBook(){
        numBooksAuthored++;
    }
    
     public void addNewChapter(){
        numChaptersAuthored++;
    }
    
    public String toString(){
        return "AUTHOR: " + name +"\nBooks authored:" + numBooksAuthored + "\nChapters Authored: "+ numChaptersAuthored +"\n";
    }
}