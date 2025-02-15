package com.wipro.java.designpattern.checkboxes;

import com.wipro.java.designpattern.checkboxes.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a MacOS Checkbox.");
    }
}