package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public String color() {
        return "brown";
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
