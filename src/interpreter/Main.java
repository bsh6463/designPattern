package interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;

        {
            try {
                reader = new BufferedReader(new FileReader("program.txt"));
                String text;

                while ((text = reader.readLine()) != null){
                    System.out.println("text = \"" + text + "\"");
                    Node node = new ProgramNode();
                    node.parse(new Context(text));
                    System.out.println("node = " + node);
                }
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
