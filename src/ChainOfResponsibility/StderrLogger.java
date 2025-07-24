package ChainOfResponsibility;

public class StderrLogger extends Logger{
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Отправка в стандартный вывод ошибок: " + msg);
    }
}
