package state;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달려");
    }

    @Override
    public void jump() {
        System.out.println("점프 할 줄 알어.");
    }

    @Override
    public void turn() {
        System.out.println("turn도 할줄 알어");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Super...............");
    }

    @Override
    public void fly() {
        System.out.println("화성 갈끄니까");
    }
}
