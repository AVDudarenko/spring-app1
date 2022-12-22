package com.example.springcourse;

public class ClassicMusic implements Music {
    private String name;
    private int volume;

    @Override
    public String getSong() {
        return "Sonata N5";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
