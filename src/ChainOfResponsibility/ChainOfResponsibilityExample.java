package ChainOfResponsibility;

public class ChainOfResponsibilityExample {
    public static void process() {
        // Цепочка ответственности
        Logger logger, logger1,logger2;
        logger = new StdoutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        // Будет обработано стандартным выводом
        logger.message("Дебаг!", Logger.DEBUG);

        // Будет обработано стандартным выводом и отправлено email
        logger.message("Уведомление!", Logger.NOTICE);

        // Будет обработано всеми логгерами
        logger.message("Вызвана ошибка!", Logger.ERR);
    }
}
