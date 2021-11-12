package iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book A"));
        bookShelf.appendBook(new Book("book B"));
        bookShelf.appendBook(new Book("book C"));
        bookShelf.appendBook(new Book("book D"));

        Iterator iterator = bookShelf.iterator(Constant.FORWARD);
        while (iterator.hasNext()){
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
        System.out.println("==================");

        iterator = bookShelf.iterator(Constant.REVERSE);
        while (iterator.hasNext()){
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }
        System.out.println("==================");
    }
}
