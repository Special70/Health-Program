package process.menuFiles;

import java.util.Scanner;

import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;
import languageFiles.LanguageFile;

public class FrontMenu {
    private MenuFileNames fileNames = new MenuFileNames();
    private LanguageFile lang = new LanguageFile();

    private Scanner scanner = new Scanner(System.in);
    private String savedInput;

    public void run() {
        lang.getText("frontMenu");
        System.out.print(" > ");
        try { // Input Verifier
            String userInput = scanner.nextLine();
            if (userInput.length() == 1 && ("123".contains(userInput))) { 
                savedInput = userInput;
            }
            else return;
        } catch (Exception e) {
            return;
        }
        switch (this.savedInput) {
            case "1": {
                SystemFunctions.changeMenu(fileNames.frontCreationSelection);
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

