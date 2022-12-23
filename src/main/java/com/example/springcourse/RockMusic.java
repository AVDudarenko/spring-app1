package com.example.springcourse;

public class RockMusic implements Music {
    private String name;
    private int volume;

    @Override
    public void doInit() {
        System.out.println("initialization rock music");
    }

    @Override
    public void doDestroy() {
        System.out.println("destroy rock music");
    }

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
