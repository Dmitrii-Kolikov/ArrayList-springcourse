package ru.kolikov.springcourse;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
       this.musicList=musicList;
    }
    public MusicPlayer() {   //при создании Setter в Bean, если у нас имеется конструктор, то мы должны создать дефолтный конструктор(по-умолчанию).
    }
    public void setMusicList(List<Music> musicList) {  //Чтобы наш Bean мог распознать Setter, от нашего конструктора.
        this.musicList=musicList;
    }

    public void playMusicList() {
        for(Music musicList: musicList)

        System.out.println("Playing " + musicList.getSong());
    }
}
