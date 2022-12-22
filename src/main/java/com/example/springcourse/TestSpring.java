package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        List<Music> musicList = musicPlayer.getMusicList();

        for (Music music : musicList) {
            System.out.println(music.getSong() + " " + music.getName() + " " + music.getVolume());
        }
        context.close();
    }
}
