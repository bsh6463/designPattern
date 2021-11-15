package proxy;

public class PrinterProxy implements Printable{

    private String name;
    private Printer real; //real object

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }


    @Override
    public String getPrinterName() {
        System.out.println("proxy : getName()");
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null){
            real.setPrinterName(name);
        }
        else {
            System.out.println("proxy : setName()");
            this.name = name;
        }

    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    //5초 지연을 줄건데, 그 동안에 interrupt 들어오면 안됨! 멈춰!
    public synchronized void realize() {
        if (real == null){
            real  = new Printer(name);
        }
    }


}
