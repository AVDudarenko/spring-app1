package com.example.springcourse;

public class PopMusic implements Music {

    private String name;
    private int volume;

    @Override
    public String getSong() {
        return "Inna Up";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
