package iterator;

public class ReverseIterator implements Iterator{
    BookShelf bookShelf;
    private int index;

    public ReverseIterator(Aggregate list) {
        bookShelf = (BookShelf) list;
        index = bookShelf.getLength()-1;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index--;
        return book;
    }
}
