package com.unit05.lesson02;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() { return name; } //for commit into dove branch
}
