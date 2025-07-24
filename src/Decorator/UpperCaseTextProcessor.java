package Decorator;

public class UpperCaseTextProcessor implements TextProcessor {
    public UpperCaseTextProcessor() {
        super();
    }

    public String process(String text) {
        return "Преобразовано в верхний регистр: " + text.toUpperCase();
    }
}
