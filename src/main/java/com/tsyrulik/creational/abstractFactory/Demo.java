package com.tsyrulik.creational.abstractFactory;

import com.tsyrulik.creational.abstractFactory.app.Application;
import com.tsyrulik.creational.abstractFactory.factories.GUIFactory;
import com.tsyrulik.creational.abstractFactory.factories.MacOSFactory;
import com.tsyrulik.creational.abstractFactory.factories.WindowsFactory;

public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
