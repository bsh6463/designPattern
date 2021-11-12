package iterator;

public class IteratorFactory extends Factory{
    //싱글톤
    private static IteratorFactory iteratorFactory = new IteratorFactory();

    private IteratorFactory() {
    }

    public static IteratorFactory getInstance() {
        return iteratorFactory;
    }

    @Override
    public Iterator createProduct(Aggregate bookshelf, int type) {
        if (type == Constant.FORWARD){
            return new ForwardIterator(bookshelf);
        }
        else if (type == Constant.REVERSE){
            return new ReverseIterator(bookshelf);
        }
        return null;
    }
}
