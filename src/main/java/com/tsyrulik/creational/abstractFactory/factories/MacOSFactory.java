package com.tsyrulik.creational.abstractFactory.factories;

import com.tsyrulik.creational.abstractFactory.button.Button;
import com.tsyrulik.creational.abstractFactory.button.MacOSButton;
import com.tsyrulik.creational.abstractFactory.checkbox.Checkbox;
import com.tsyrulik.creational.abstractFactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
