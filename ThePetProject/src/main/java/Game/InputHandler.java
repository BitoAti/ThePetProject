package Game;

import java.util.Scanner;

public class InputHandler {
    private static InputHandler instance = null;
    private final Scanner input = new Scanner(System.in);

    public static InputHandler getInstance(){
        if(instance == null){
            instance = new InputHandler();
        }
        return instance;
    }


    public String name(){
        System.out.print("Enter your name (min 3 character): ");
        String myString = input.next();
        while(myString.length() < 3){
            myString = input.next();
        }
        return myString;
    }

    public String characterName(){
        System.out.print("Enter your character name (min 3 character): ");
        String myString = input.next();
        while(myString.length() < 3){
            System.out.print("Enter your character name (min 3 character): ");

            myString = input.next();
        }
        return myString;
    }

    public int characterNumber(){
        System.out.print("Enter your character name (min 3 character): ");
        int number = input.nextInt();
        while(number < 1 || number > 3){
            System.out.print("Enter your character name (min 3 character): ");

            number = input.nextInt();
        }
        return number;
    }
}
