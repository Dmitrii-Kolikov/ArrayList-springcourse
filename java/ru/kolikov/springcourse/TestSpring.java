package ru.kolikov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicattionContext.xml"
        );
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusicList();  // проверям наши init-method and destroy-method.
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer2.playMusicList();  // проверям наши init-method and destroy-method при  созданни несколько бинов Singleton с одинаковым объектом.
        //смотрим как происходит срабатывание метода init и destroy и выводим весь наш список на экран.
        //Scope Singleton вызывает метод init и destroy, только один раз, при условие создание этих объектов в одном классе.
       


        context.close();  

    }
}
