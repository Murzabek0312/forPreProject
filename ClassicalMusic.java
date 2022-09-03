package ru.Murzabek0312;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit(){
        System.out.println("doing my inicialization");
    }
    public void doMyDestroy(){
        System.out.println("doing my destroying");
    }
}
