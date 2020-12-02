package ru.kolikov.springcourse;

public class RapMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization in the class RapMusic");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction in the class RapMusic");
    }
    @Override
    public String getSong() {
        return "8 mile";

    }

}
