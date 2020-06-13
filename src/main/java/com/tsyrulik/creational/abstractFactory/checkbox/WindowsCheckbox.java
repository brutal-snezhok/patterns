package com.tsyrulik.creational.abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox");
    }
}
