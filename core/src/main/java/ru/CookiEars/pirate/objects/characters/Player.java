package ru.CookiEars.pirate.objects.characters;

import static ru.CookiEars.pirate.game.GameSettings.PLAYER_BIT;
import static ru.CookiEars.pirate.game.GameSettings.PLAYER_LIVES;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Disposable;

import ru.CookiEars.pirate.objects.PhysicalObject;

public class Player extends PhysicalActor implements Disposable {

    private enum State {IDLE}
    Animation<TextureRegion> idleAnimation;
    TextureRegionDrawable drawable;
    float timer,tileScale;
    State state;
    int leftLives;

    public Player(World world, Rectangle bounds, float tileScale) {
        this.tileScale=tileScale;

        setPhysicalObject(new PhysicalObject.PhysicalObjectBuilder(world,
            BodyDef.BodyType.DynamicBody)
            .addCircularFixture(bounds.getHeight()/2,PLAYER_BIT).
            setInitialPosition(bounds.x+bounds.getWidth()/2,
                bounds.y+bounds.getHeight()/2)
            .build(this)
        );
        timer=0;
        state=State.IDLE;
        leftLives=PLAYER_LIVES;
        setSize(bounds.getWidth()*2*tileScale, bounds.getHeight()*tileScale);
    }

    @Override
    public void dispose() {

    }
}
