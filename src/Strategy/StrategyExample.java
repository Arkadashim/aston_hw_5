package Strategy;

public class StrategyExample {
    private Strategy strategy;

    StrategyExample() {
        strategy = new AddStrategy();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int run(int a, int b) {
        return strategy.execute(a, b);
    }

    public static void process() {
        StrategyExample example = new StrategyExample();

        int a = 20;
        int b = 10;

        System.out.println(example.run(a, b));

        example.setStrategy(new MultiplyStrategy());
        System.out.println(example.run(a, b));

        example.setStrategy(new SubtractStrategy());
        System.out.println(example.run(a, b));
    }
}
