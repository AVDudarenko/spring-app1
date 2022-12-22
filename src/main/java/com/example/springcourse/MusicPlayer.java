package com.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {

    }

//    public List<Music> playMusic() {
////        for (int i = 0; i < musicList.size(); i++) {
////            System.out.println("Playing: " + musicList.get(i).getSong());
////        }
//        return musicList;
//    }
}
