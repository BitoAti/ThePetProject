package main.java.module;


import main.java.Game.InputHandler;
import main.java.Game.OutputHandler;

public class Module {
    protected String moduleName;
    protected OutputHandler outputHandler = new OutputHandler();
    protected final InputHandler input = InputHandler.getInstance();




    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public void start(){
        outputHandler.print(this.moduleName);

    }


}
