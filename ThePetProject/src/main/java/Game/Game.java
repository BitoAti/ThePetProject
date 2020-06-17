package Game;

import module.ChooseCharacter;
import module.WelcomePage;

import java.util.UUID;

public class Game {
    private final InputHandler input = InputHandler.getInstance();
    private final WelcomePage welcomePage = new WelcomePage();
    private final ChooseCharacter chooseCharacter = new ChooseCharacter();
    private Character character;
    private String characterName;
    private  String gamerName;
    private  UUID id;


    public void start(){
        welcomePage.start();
        chooseCharacter.start();
    }



}
