package ru.CookiEars.pirate.ui.components;

import static ru.CookiEars.pirate.game.GameResources.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Array;

public class LiveBackground extends Group {
    private final Image backgroundImage;
    private final Image smallReflectionImage;
    private final Image bigReflectionImage;
    private final Image bigCloudImage;

    private final Animation<TextureRegion> bigReflectionAnimation;
    private final Animation<TextureRegion> smallReflectionAnimation;

    private float timer;

    public LiveBackground() {
        Texture reflectionsTileset=new Texture(Gdx.files.internal(REFLECTIONS_TILESET_PATH));

        Array<TextureRegion> frames=new Array<>();
        for (int c=0; c<4; c++) { //Это отсылочка на C++
            frames.add(new TextureRegion(reflectionsTileset,170,3*c,35,3));
        }

        smallReflectionAnimation=new Animation<>(0.15f,frames, Animation.PlayMode.LOOP);
        frames.clear();

        backgroundImage=new Image(new Texture(BACKGROUND_IMAGE_PATH));
        bigReflectionImage=new Image(new Texture());
    }
}
