package templateMethod;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //hook method
    public void fly(){};

    final public void go(int count){

        run();
        for (int i=0;i<count; i++){
            jump();
        }
        turn();
    }

}
