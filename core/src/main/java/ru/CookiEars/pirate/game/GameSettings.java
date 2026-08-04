package ru.CookiEars.pirate.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.I18NBundle;

public class GameSettings {
    private static final float baseHeight=520;
    private static final float baseRatio = Gdx.graphics.getHeight() / baseHeight;

    public static final float SCREEN_HEIGHT= Gdx.graphics.getHeight()/baseRatio;
    public static final float SCREEN_WIDTH=Gdx.graphics.getWidth() /baseRatio;

    public static final String SKIN_PATH="skin/skin.json";

    private static final String LOCALIZATION_BUNDLE_PATH="localization/bundle";

    public static I18NBundle localisationBundle=I18NBundle.createBundle(Gdx.files.internal(LOCALIZATION_BUNDLE_PATH));

    public static final float SCALE=0.014f;
    public static final short PLAYER_BIT=4;
    public static final short PLAYER_LIVES=4;
}
