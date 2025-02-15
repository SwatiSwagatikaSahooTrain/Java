package com.wipro.java.designpattern.buttons;

import com.wipro.java.designpattern.buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a Windows Button.");
    }
}