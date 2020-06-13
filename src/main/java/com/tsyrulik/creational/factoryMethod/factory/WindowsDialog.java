package com.tsyrulik.creational.factoryMethod.factory;

import com.tsyrulik.creational.factoryMethod.button.Button;
import com.tsyrulik.creational.factoryMethod.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
