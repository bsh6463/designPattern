package templateMethod;

public class MainBoard {

    public static void main(String[] args) {
        Player player = new Player();

        player.play(1);
        System.out.println("==========");

        PlayerLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(1);
        System.out.println("==========");

        PlayerLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(1);
        System.out.println("==========");
    }
}
