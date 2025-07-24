package Strategy;

public class MultiplyStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        System.out.println("Вызвана стратегия умножения!");
        return a * b;
    }
}
