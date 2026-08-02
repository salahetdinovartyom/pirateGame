package ru.CookiEars.pirate.utils;

public class Level {
    private final String name,path;
    private boolean isPassed;
    public Level(String name,String path) {
        this.name=name;
        this.path=path;
        isPassed=false;
    }
    public void updateIsAvailable() {
        isPassed=MemoryManager.loadLevelState(name);
    }

    public String getName() {
        return name;
    }
}
