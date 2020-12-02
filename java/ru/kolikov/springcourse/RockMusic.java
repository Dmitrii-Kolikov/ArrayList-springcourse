package ru.kolikov.springcourse;

public class RockMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization in the class RockMusic");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction in the class RockMusic");
    }
    @Override
    public String getSong() {
        return "The Wind cries Mary";
    }
}
