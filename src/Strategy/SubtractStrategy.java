package Strategy;

public class SubtractStrategy implements Strategy{

    @Override
    public int execute(int a, int b) {
        System.out.println("Вызвана стратегия вычитания!");
        return a - b;
    }
}
