package com.wipro.java.designpattern.checkboxes;

import com.wipro.java.designpattern.checkboxes.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a Windows Checkbox.");
    }
}
