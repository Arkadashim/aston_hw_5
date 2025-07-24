package Strategy;

public class AddStrategy implements Strategy{
    public int execute(int a, int b) {
        System.out.println("Вызвана стратегия сложения!");
        return a+b;
    }
}
