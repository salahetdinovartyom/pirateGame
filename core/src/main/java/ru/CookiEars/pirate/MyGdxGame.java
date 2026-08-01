package ru.CookiEars.pirate;

import static ru.CookiEars.pirate.game.GameSettings.*;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
public class MyGdxGame extends Game {
    public OrthographicCamera camera;


    @Override
    public void create() {
        camera=new OrthographicCamera();

        camera.setToOrtho(false,SCREEN_WIDTH,SCREEN_HEIGHT);
    }

    @Override
    public void dispose() {
    }
}
