package ru.kolikov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(List<Music> musicList) {   //конструктор
       this.musicList=musicList;
    }
    public MusicPlayer() {  }   //дефолтный конструктор
    public void setMusicList(List<Music> musicList) { this.musicList = musicList; } //при создании сетера, если у нас имеется,
    public void playMusicList() {                                                   //конструктор, нужно создать дефолтный конструктор
        for(Music music:musicList) {
        System.out.println("Playing " + music.getSong()); }
    }
}
