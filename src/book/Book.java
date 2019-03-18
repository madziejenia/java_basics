package book;

public class Book {
    public String title;
    public String author;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String toString()
    {
        return "The details of the book are: " + title + ", " + author;
    }

}
