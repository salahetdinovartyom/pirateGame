package ru.CookiEars.pirate.screens;

import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.utils.Level;
import ru.CookiEars.pirate.utils.MapManager;

public class GameScreen extends BaseScreen {
    private OrthoCachedTiledMapRenderer mapRenderer;
    private Level level;
    MapManager mapManager;
    public GameScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,0);
        mapRenderer.setView(myGdxGame.camera);
        mapRenderer.render();
        super.render(delta,false);
    }

    @Override
    public void show() {
        super.show();
        startGame();
    }

    public void setLevel(Level level) {
        this.level = level;
    }
    public void loadLevel() {
        mapManager=new MapManager(level.getPath());
        mapRenderer=new OrthoCachedTiledMapRenderer(mapManager.getMap(),mapManager.getTileScale());
    }

    private void startGame() {
        loadLevel();
    }

}
