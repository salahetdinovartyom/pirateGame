package ru.CookiEars.pirate.utils;
import static ru.CookiEars.pirate.game.GameSettings.localisationBundle;
public class LevelManager {
    private final static Level[] levelsArray=new Level[] {
        new Level(localisationBundle.get("level1Name"),"maps/level1.tmx"),
        new Level(localisationBundle.get("level2Name"),"maps/level2.tmx"),
        new Level(localisationBundle.get("level3Name"),"maps/level3.tmx"),
        new Level(localisationBundle.get("level1Name"),"maps/level1.tmx"),
        new Level(localisationBundle.get("level2Name"),"maps/level2.tmx"),
        new Level(localisationBundle.get("level3Name"),"maps/level3.tmx"),
        new Level(localisationBundle.get("level1Name"),"maps/level1.tmx"),
        new Level(localisationBundle.get("level2Name"),"maps/level2.tmx"),
        new Level(localisationBundle.get("level3Name"),"maps/level3.tmx")
    };
    public static Level getLevel(int levelIdx) {
        levelsArray[levelIdx].updateIsAvailable();
        return levelsArray[levelIdx];
    }
    public static boolean isLevelAvailable(int levelIdx) {
        if (levelIdx==0) return true;
        return MemoryManager.loadLevelState(levelsArray[levelIdx-1].getName());
    }
    public static Level[] getAllLevels() {
        return levelsArray;
    }
}
