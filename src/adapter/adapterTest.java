package adapter;

public class adapterTest {

    public static void main(String[] args) {

        Print print = new PrintBanner("hello");
        print.printWeek();
        print.printStrong();
    }
}
