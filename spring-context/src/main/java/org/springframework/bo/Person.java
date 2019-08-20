package org.springframework.bo;

public class Person {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String work() {
        return getText();
    }
}
