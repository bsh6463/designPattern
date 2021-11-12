package iterator;

public abstract class Factory {

    //template 메서드 패턴
    public final Iterator create(Aggregate list, int type){
        Iterator p = createProduct(list, type);
        return p;
    }

    public abstract Iterator createProduct(Aggregate list, int type);
}
