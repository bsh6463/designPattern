package iterator;

public class ForwardIterator implements Iterator{

    BookShelf bookShelf;
    private int index;

    public ForwardIterator(Aggregate list) {
        bookShelf = (BookShelf) list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
