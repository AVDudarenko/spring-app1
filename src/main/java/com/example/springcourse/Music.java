package com.example.springcourse;

public interface Music {

    /**
     * method for init bean
     */

    void doInit();

    /**
     * method for destroy bean
     */

    void doDestroy();

    String getSong();

    String getName();

    int getVolume();

    void setName(String name);

    void setVolume(int volume);

}
