package ru.CookiEars.pirate;

import static ru.CookiEars.pirate.game.GameSettings.*;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import ru.CookiEars.pirate.screens.GameScreen;
import ru.CookiEars.pirate.screens.MenuScreen;
import ru.CookiEars.pirate.screens.SettingsScreen;

public class MyGdxGame extends Game {
    public OrthographicCamera camera;
    public Skin skin;
    public MenuScreen menuScreen;
    public GameScreen gameScreen;
    public SettingsScreen settingsScreen;
    @Override
    public void create() {
        camera=new OrthographicCamera();
        skin=new Skin(Gdx.files.internal(SKIN_PATH));

        camera.setToOrtho(false,SCREEN_WIDTH,SCREEN_HEIGHT);
        settingsScreen=new SettingsScreen(this);
        menuScreen=new MenuScreen(this);
        gameScreen=new GameScreen(this);
        setScreen(menuScreen);
    }

    @Override
    public void dispose() {
        skin.dispose();
    }
}
