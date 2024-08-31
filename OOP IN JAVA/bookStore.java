//Java program to create a class called "Book" with attributes for title,author,and ISBN, and methods to add and remove books from a collection.
import java.util.ArrayList;

class Book{
    private String Author;
    private String Title;
    private String ISBN;

    private static ArrayList<Book>bookCollection=new ArrayList<Book>();
    public Book(String Title, String Author,String ISBN)
    {
        this.Title=Title;
        this.Author=Author;
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return Title;
    }
    public void setTitle(String Title){
        this.Title=Title;

    }
    public String getAuthor(){
        return Author;
    }
    public void setAuthor(String Author){
        this.Author=Author;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    public static ArrayList<Book>getbookCollection(){
        return bookCollection;
    }
}
public class bookStore {
    public static void main(String[] args) {
        Book book1=new Book("C programming", "Dennis ", "5647389261961");
        Book book2=new Book("Python", "Guido van Rossum", "5767809875983");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book>bookCollection=Book.getbookCollection();
        System.out.println("List of Books");
        for (Book book:bookCollection){
            System.out.println(book.getTitle()+" by "+book.getAuthor()+" , ISBN: "+book.getISBN());
        }

        Book.removeBook(book1);

        System.out.println("\n After removing "+book1.getTitle()+":");

        System.out.println("List of books:");
        for (Book book:bookCollection){
            System.out.println(book.getTitle()+" by "+book.getAuthor()+" , ISBN: "+book.getISBN());
        }
    }
    
}
