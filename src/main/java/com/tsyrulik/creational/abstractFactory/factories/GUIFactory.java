package com.tsyrulik.creational.abstractFactory.factories;

import com.tsyrulik.creational.abstractFactory.button.Button;
import com.tsyrulik.creational.abstractFactory.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
