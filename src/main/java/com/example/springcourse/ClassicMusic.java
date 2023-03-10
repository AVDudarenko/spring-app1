package com.example.springcourse;

public class ClassicMusic implements Music {

    private ClassicMusic() {
    }

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    private String name;
    private int volume;

    @Override
    public void doInit() {
        System.out.println("initialization classic music");
    }

    @Override
    public void doDestroy() {
        System.out.println("destroy classic music");
    }

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
