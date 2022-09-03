package ru.Murzabek0312;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigSpring.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//       Music classicalMusic = context.getBean("musicBean",Music.class);
//       MusicPlayer clasMusic = new MusicPlayer(classicalMusic);
//       clasMusic.playMusic();
//       Music rockMusic = context.getBean("rockMusic", Music.class);
//       MusicPlayer rockMusic1 = new MusicPlayer(rockMusic);
//       rockMusic1.playMusic();

      // Music music =  context.getBean("musicBean", Music.class);
       //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//       musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.setVolume(10);
//        System.out.println(musicPlayer);
//        System.out.println(secondMusicPlayer);
           context.close();
    }
}
