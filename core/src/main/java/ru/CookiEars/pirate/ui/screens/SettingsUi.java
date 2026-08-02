package ru.CookiEars.pirate.ui.screens;

import static ru.CookiEars.pirate.game.GameSettings.localisationBundle;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import ru.CookiEars.pirate.ui.UiComponent;
import ru.CookiEars.pirate.ui.components.LiveBackground;

public class SettingsUi extends UiComponent {
    private final int BUTTON_HEIGHT = 60,
        SPACE_BETWEEN_COMPONENTS = 10,BUTTON_WIDTH = 195,
        COMMON_PADDING_BOTTOM = 30;

    public LiveBackground liveBackground;
    public TextButton resetButton,menuButton;

    public SettingsUi(Skin skin) {
        Label title=new Label(localisationBundle.get("settingsScreenTitleText"),skin,"labelTitle");
        resetButton=new TextButton(localisationBundle.get("resetLevelsButtonText"),skin);
        menuButton=new TextButton(localisationBundle.get("homeButtonText"),skin);
        liveBackground=new LiveBackground();
        addActor(liveBackground);

        columnDefaults(1);
        add(title).colspan(2).padBottom(COMMON_PADDING_BOTTOM);
        row();
        add(resetButton).width(BUTTON_WIDTH).height(BUTTON_HEIGHT).colspan(2).space(SPACE_BETWEEN_COMPONENTS);
        row();
        add(menuButton).width(BUTTON_WIDTH).height(BUTTON_HEIGHT).colspan(2).space(SPACE_BETWEEN_COMPONENTS);
    }

    @Override
    public void dispose() {
        liveBackground.dispose();
    }
}
