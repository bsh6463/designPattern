package chaninOfResponsibility;

public abstract class Support {

    private String name;
    private Support next;

    public String getName() {
        return name;
    }

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){

        if (resolve(trouble)){
            done(trouble);
        }
        else if (next != null) {
            next.support(trouble);
        }
        else {
            fail(trouble);
        }

    }

    @Override
    public String toString() {
        return "[" + next + "]";
    }

    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){
        System.out.println(trouble.getNumber() + " is resolved by " + this.name + ".");
    }
    protected void fail(Trouble trouble){
        System.out.println(trouble.getNumber() + "cannot be resolved" + this.name + ".");
    }


}
