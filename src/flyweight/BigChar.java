package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;

        try {
            //bigxx.txt파일의 인스턴스 생성.
            BufferedReader bufferedReader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();

            while ((line = bufferedReader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            bufferedReader.close();

            //fontData에 파일에서 읽은 값 보관.
            this.fontData = buf.toString();
        } catch (IOException e) {
            this.fontData = charName + "??";
        }
    }

    //출력
    public void print(){
        System.out.println(fontData);
    }
}
