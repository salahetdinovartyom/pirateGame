package ru.CookiEars.pirate.screens;

import ru.CookiEars.pirate.MyGdxGame;
import ru.CookiEars.pirate.ui.screens.MenuUi;

public class MenuScreen extends BaseScreen {
    private final MenuUi menuUi;
    public MenuScreen(MyGdxGame myGdxGame) {
        super(myGdxGame);
        menuUi=new MenuUi(myGdxGame.skin);
        baseStage.addActor(menuUi);
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
}
