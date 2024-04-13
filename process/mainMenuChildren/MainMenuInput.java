package process.mainMenuChildren;

import java.util.Scanner;

import process.SystemFunctions;
import languageFiles.LanguageFile;

public class MainMenuInput {
    private Scanner scanner = new Scanner(System.in);
    private String savedInput;

    public void run() {
        LanguageFile.testFunction();
        System.out.print(" > ");
        try { // Input Verifier
            String userInput = scanner.nextLine();
            if (userInput.length() == 1 && ("123".contains(userInput))) { 
                System.out.println("Valid Input");
                savedInput = userInput;
            }
            else return;
        } catch (Exception e) {
            return;
        }
        switch (this.savedInput) {
            case "1": {
                SystemFunctions.changeMenu("formCreation_MAIN");
                SystemFunctions.clearConsole();
                break;
            }
            case "2": break;
            case "3": {
                SystemFunctions.shutDownProgram();
                SystemFunctions.clearConsole();
                break;
            }
            default : return;
        }
    }
}

