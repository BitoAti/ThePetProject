package module;

import character.Cat;
import character.Dog;
import character.Pet;

public class ChooseCharacter extends Module{
    public ChooseCharacter() {
        super("Choose Character");
    }


    public void start(){
        super.start();
        System.out.println("new");
        chooseCharacter();
    }

    private Pet chooseCharacter() {
        Pet pet = null;
        switch (this.input.characterNumber()) {
            case 1:
                System.out.println("dog");
                pet = new Dog();
                break;
            case 2:
                System.out.println("cat");
                pet = new Cat();
                break;
            case 3:
                System.out.println("panda");
                pet = new Pet();
                break;

        }
        return pet;
    }
}
