package ru.CookiEars.pirate.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.ui.screens.SettingsUi;

public class SettingsScreen extends BaseScreen {
    private final SettingsUi settingsUi;

    public SettingsScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
        settingsUi=new SettingsUi(myGdxGame.skin);
        baseStage.addActor(settingsUi);
        setListeners();
    }
    private void setListeners() {
        settingsUi.resetButton.addListener(onButtonResetClickedListener);
        settingsUi.menuButton.addListener(onButtonMenuClickedListener);
    }
    ClickListener onButtonResetClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            //TODO: Надо  будет сделать уничтожитель прогресса, а пока
            Gdx.app.log("Cheburek","he, Chebureki udalyaut prOgress chelOvechestva... \nUdalenie smartfonov... \nUdalenie interneta, plastiKa, I tomu podobnogo...\nObrabotka,pozhalusta,podozhditE...100%\nGotovo.");
        }
    };
    ClickListener onButtonMenuClickedListener=new ClickListener() {
        @Override
        public void clicked(InputEvent event, float x, float y) {
            myGdxGame.setScreen(myGdxGame.menuScreen);
        }
    };

    @Override
    public void dispose() {
        super.dispose();
        settingsUi.dispose();
    }
}
