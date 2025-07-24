package ChainOfResponsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Пишем в стандартный вывод: " + msg);
    }
}
