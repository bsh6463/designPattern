package iterator;


public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;
    Factory f = IteratorFactory.getInstance();

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }


    @Override
    public Iterator iterator(int type) {
        return f.create(this, type);
    }

    @Override
    public int getLength() {
        return last;
    }
}
