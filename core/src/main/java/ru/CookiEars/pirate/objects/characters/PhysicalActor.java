package ru.CookiEars.pirate.objects.characters;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

import ru.CookiEars.pirate.objects.PhysicalObject;

public class PhysicalActor extends Image {
    private PhysicalObject physicalObject;

    protected PhysicalObject getPhysicalObject() {
        return physicalObject;
    }

    public void setPhysicalObject(PhysicalObject physicalObject) {
        this.physicalObject=physicalObject;
    }

}
