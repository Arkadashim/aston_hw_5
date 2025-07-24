package Decorator;

public class DecoratorExample {
    public static void process() {
        TextProcessor simple = new SimpleTextProcessor();
        TextProcessor uppercase = new UpperCaseTextProcessor();

        String text = "Я люблю масло";
        System.out.println(simple.process(text));
        System.out.println(uppercase.process(text));
    }
}
