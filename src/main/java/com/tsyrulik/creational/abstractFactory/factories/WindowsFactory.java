package com.tsyrulik.creational.abstractFactory.factories;

import com.tsyrulik.creational.abstractFactory.button.Button;
import com.tsyrulik.creational.abstractFactory.button.WindowsButton;
import com.tsyrulik.creational.abstractFactory.checkbox.Checkbox;
import com.tsyrulik.creational.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
