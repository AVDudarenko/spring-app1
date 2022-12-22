package com.example.springcourse;

public class RockMusic implements Music {
    private String name;
    private int volume;

    @Override
    public String getSong() {
        return "Bohemian rhapsody";
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
