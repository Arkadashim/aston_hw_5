package Adapter;

public class AdapterExample {
    public static void process() {
        // Создаем объект адаптируемого класса
        Adaptee adaptee = new Adaptee();
        // Создаем адаптер, передавая ему адаптируемый объект
        Target adapter = new Adapter(adaptee);
        // Вызываем метод целевого интерфейса
        adapter.request();
    }
}
