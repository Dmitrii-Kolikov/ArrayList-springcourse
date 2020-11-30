package ru.kolikov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    Music music1 = new RapMusic();
    private List<Music> musicList = new ArrayList<>();
   // public List<Music> musicList() {
   //     musicList.add(new RepMusic());
  //      musicList.add(new RockMusic());
  //      musicList.add(new ClassicalMusic());
  //      return  musicList;
  //  }

   // private Music music;
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

    //IOC
    public MusicPlayer(List<Music> musicList) {
       this.musicList=musicList;
    }
    public MusicPlayer() {  }
    public void setMusicList(List<Music> musicList) { this.musicList = musicList; }
    public void playMusicList() {
        for(Music music:musicList) {
        System.out.println("Playing " + music.getSong()); }
    }
}
