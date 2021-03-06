package com.tsyrulik.creational.abstractFactory.app;

import com.tsyrulik.creational.abstractFactory.button.Button;
import com.tsyrulik.creational.abstractFactory.checkbox.Checkbox;
import com.tsyrulik.creational.abstractFactory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
