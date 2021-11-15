package proxy;

public class Printer implements Printable{

    String name;

    public Printer() {
       heavyJob("Printer 인스턴스 생성 중...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer 인스턴스 생성 중...");
    }

    private void heavyJob(String message) {
        System.out.println(message);
        for (int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("complete");
    }


    @Override
    public String getPrinterName() {
        //나는 진짜 object다..
        System.out.println("real : getName()");
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        System.out.println("real : setName()");
        this.name = name;
    }


    @Override
    public void print(String string) {
        System.out.println("==== "+ name+ " ====");
        System.out.println(string);
    }
}
