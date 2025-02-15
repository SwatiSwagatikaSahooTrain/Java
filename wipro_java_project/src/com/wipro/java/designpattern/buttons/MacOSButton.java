package com.wipro.java.designpattern.buttons;

import com.wipro.java.designpattern.buttons.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacOS Button.");
    }
}
