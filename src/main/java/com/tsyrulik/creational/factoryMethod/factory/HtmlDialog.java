package com.tsyrulik.creational.factoryMethod.factory;

import com.tsyrulik.creational.factoryMethod.button.Button;
import com.tsyrulik.creational.factoryMethod.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
