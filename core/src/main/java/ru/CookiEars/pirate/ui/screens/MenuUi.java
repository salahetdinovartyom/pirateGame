package ru.CookiEars.pirate.ui.screens;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;

import ru.CookiEars.pirate.ui.UiComponent;
import ru.CookiEars.pirate.ui.components.LiveBackground;

import static ru.CookiEars.pirate.game.GameSettings.localisationBundle;

public class MenuUi extends UiComponent {
    private final int BUTTON_HEIGHT = 60,SPACE_BETWEEN_COMPONENTS = 10,SCROLL_PANEL_WIDTH = 400,
        SCROLL_PANEL_HEIGHT = 250,START_BUTTON_WIDTH = 400,
        SECONDARY_BUTTON_WIDTH = 195,LIST_VIEW_WIDTH = 250,
        COMMON_PADDING_BOTTOM = 30;
    public LiveBackground liveBackground;
    public ScrollPane scrollPane;
    public List<String> listView;
    public TextButton startButton,exitButton,settingsButton;

    public MenuUi(Skin skin) {
        Label title=new Label(localisationBundle.get("menuScreenTitleText"),skin,"labelTitle");
        startButton = new TextButton(localisationBundle.get("startButtonText"), skin);
        exitButton=new TextButton(localisationBundle.get("exitButtonText"),skin);
        settingsButton= new TextButton(localisationBundle.get("settingsButtonText"),skin);
        listView=new List<>(skin);
        scrollPane=new ScrollPane(listView,skin);
        liveBackground=new LiveBackground();
        addActor(liveBackground);

        listView.setAlignment(Align.center);
        listView.setWidth(LIST_VIEW_WIDTH);
        scrollPane.setActor(listView);

        columnDefaults(2);
        add(title).colspan(2).padBottom(COMMON_PADDING_BOTTOM);
        row();
        add(scrollPane).width(SCROLL_PANEL_WIDTH).height(SCROLL_PANEL_HEIGHT).colspan(2).space(SPACE_BETWEEN_COMPONENTS);
        row();
        add(startButton).width(START_BUTTON_WIDTH).height(BUTTON_HEIGHT).colspan(2).space(SPACE_BETWEEN_COMPONENTS);
        row();
        add(exitButton).width(SECONDARY_BUTTON_WIDTH).height(BUTTON_HEIGHT).space(SPACE_BETWEEN_COMPONENTS);
        add(settingsButton).width(SECONDARY_BUTTON_WIDTH).height(BUTTON_HEIGHT).space(SPACE_BETWEEN_COMPONENTS);
    }
    @Override
    public void dispose() {
        liveBackground.dispose();
    }
}
