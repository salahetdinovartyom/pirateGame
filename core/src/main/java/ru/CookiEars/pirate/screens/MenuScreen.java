package ru.CookiEars.pirate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.ui.screens.MenuUi;

public class MenuScreen extends BaseScreen {
    private final MenuUi menuUi;
    public MenuScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
        menuUi=new MenuUi(myGdxGame.skin);
        baseStage.addActor(menuUi);
        setListeners();
    }

    @Override
    public void show() {
        super.show();
        updateList();
    }

    private void updateList() {
        String[] levelsArray=new String[] {
            "First fight",
            "Revenge of pit",
            "The empire strikes",
            "Attack of stars",
            "Revenge of pit",
            "Attack of stars",
            "Attack of stars",
            "Attack of stars"
        };

        menuUi.listView.setItems(levelsArray);
    }
    private void setListeners() {
        menuUi.exitButton.addListener(onButtonExitClickedListener);
        menuUi.startButton.addListener(onButtonStartClickedListener);
        menuUi.settingsButton.addListener(onButtonSettingsClickedListener);
    }
    ClickListener onButtonExitClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            Gdx.app.exit();
        }
    };
    ClickListener onButtonStartClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            myGdxGame.setScreen(myGdxGame.gameScreen);
        }
    };
    ClickListener onButtonSettingsClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            myGdxGame.setScreen(myGdxGame.settingsScreen);
        }
    };
}
