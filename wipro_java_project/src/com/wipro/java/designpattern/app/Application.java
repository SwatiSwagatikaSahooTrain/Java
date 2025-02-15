package com.wipro.java.designpattern.app;

import com.wipro.java.designpattern.factory.GUIFactory;
import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.checkboxes.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}