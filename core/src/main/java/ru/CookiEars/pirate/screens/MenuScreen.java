package ru.CookiEars.pirate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.ui.screens.MenuUi;
import ru.CookiEars.pirate.utils.Level;
import ru.CookiEars.pirate.utils.LevelManager;

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
        String[] levelList=new String[LevelManager.getAllLevels().length];
        for (int i=0; i<LevelManager.getAllLevels().length;i++) {
            Level level=LevelManager.getAllLevels()[i];
            levelList[i]=level.getName()+(LevelManager.isLevelAvailable(i) ? "" : "(-)");
        }
        menuUi.listView.setItems(levelList);
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

    @Override
    public void dispose() {
        super.dispose();
        menuUi.dispose();
    }

    ClickListener onButtonStartClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            if(!LevelManager.isLevelAvailable(menuUi.listView.getSelectedIndex())) return;
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
