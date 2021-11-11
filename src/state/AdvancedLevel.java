package state;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달려");
    }

    @Override
    public void jump() {
        System.out.println("점프 할 줄 알어.");
    }

    @Override
    public void turn() {
        System.out.println("turn도 아직..");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Advanced...............");
    }
}
