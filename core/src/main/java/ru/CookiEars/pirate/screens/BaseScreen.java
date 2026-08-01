package ru.CookiEars.pirate.screens;

import static ru.CookiEars.pirate.game.GameSettings.*;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import ru.CookiEars.pirate.MyGdxGame;

public abstract class BaseScreen extends ScreenAdapter {
    protected Stage baseStage;
    protected MyGdxGame myGdxGame;
    protected Viewport baseViewport;

    public BaseScreen(MyGdxGame myGdxGame) {
        this.myGdxGame=myGdxGame;
        baseViewport=new FitViewport(SCREEN_WIDTH,SCREEN_HEIGHT,myGdxGame.camera);
        baseStage=new Stage(baseViewport);
    }

    @Override
    public void render(float delta) {
        render(delta,true);
    }
    public void render(float delta,boolean clearScreen) {
        if (clearScreen) ScreenUtils.clear(Color.ROYAL);
        baseStage.act(delta);
        baseStage.draw();
        handleInput();
    }
    public  void handleInput() {

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(baseStage);
    }

    @Override
    public void dispose() {
        baseStage.dispose();
    }

    @Override
    public  void resize(int width, int height) {
        baseStage.getViewport().update(width, height,false);
    }
}
