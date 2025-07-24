import Adapter.AdapterExample;
import Builder.BuilderExample;
import ChainOfResponsibility.ChainOfResponsibilityExample;
import Decorator.DecoratorExample;
import Proxy.ProxyExample;
import Strategy.StrategyExample;

public class Main {
    private static void printDelimiter() {
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        System.out.println("Реализация шаблона стратегии");
        StrategyExample.process();

        printDelimiter();

        System.out.println("Реализация шаблона цепочки обязанностей");
        ChainOfResponsibilityExample.process();

        printDelimiter();

        System.out.println("Реализация шаблона строитель");
        BuilderExample.process();

        printDelimiter();

        System.out.println("Реализация шаблона прокси");
        ProxyExample.process();

        printDelimiter();

        System.out.println("Реализация шаблона декоратор");
        DecoratorExample.process();

        printDelimiter();

        System.out.println("Реализация шаблона адаптер");
        AdapterExample.process();
    }
}