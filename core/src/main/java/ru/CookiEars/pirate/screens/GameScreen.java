package ru.CookiEars.pirate.screens;

import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.utils.Level;

public class GameScreen extends BaseScreen {
    private OrthoCachedTiledMapRenderer mapRenderer;
    private Level level;
    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    @Override
    public void show() {
        super.show();
        startGame();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    private void startGame() {
        loadLevel();
    }
    private void loadLevel() {

    }

}
