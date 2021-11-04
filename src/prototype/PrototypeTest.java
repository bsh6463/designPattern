package prototype;

import java.util.ArrayList;

class Book{

    private String author;
    private String title;

    public Book(String author, String  title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "(author='" + author + '\'' +
                ", title='" + title +")";
    }
}

class Bookshelf implements Cloneable{

    private ArrayList<Book> shelf;

    public Bookshelf() {
        shelf = new ArrayList<>();
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Bookshelf another = new Bookshelf();
        for (Book book : shelf) {
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }
        return another;
    }

    @Override
    public String toString() {
        return "shelf=" + shelf;
    }
}
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(new Book("A", "a"));
        bookshelf.addBook(new Book("B", "b"));
        bookshelf.addBook(new Book("C", "c"));

        System.out.println(bookshelf);

        Bookshelf another = (Bookshelf) bookshelf.clone();
        System.out.println(another);
        System.out.println("====================");

        bookshelf.getShelf().get(0).setAuthor("AAA");
        bookshelf.getShelf().get(0).setTitle("aaa");
        System.out.println(bookshelf);
        System.out.println(another);
    }
}
