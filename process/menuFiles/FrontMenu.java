package process.menuFiles;

import java.util.Scanner;

import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;
import languageFiles.LanguageFile;

public class FrontMenu {
    private MenuFileNames fileNames = new MenuFileNames();
    private LanguageFile lang = new LanguageFile();

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        lang.getText("frontMenu");
        System.out.print(" > ");
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "1": { // Switch to Form Creation Selection (See FormCreationSelection.java)
                SystemFunctions.changeMenu(fileNames.dataMainMenu);
                SystemFunctions.clearConsole();
                break;
            }
            case "2": {
                SystemFunctions.changeMenu(fileNames.accessExistingFormsMenu);
                SystemFunctions.clearConsole();
                break;
            }
            case "3": { // Exit the program
                SystemFunctions.shutDownProgram();
                SystemFunctions.clearConsole();
                break;
            }
            case "i": { // Switch to About Us Display (See AboutUsMenu.java)
                SystemFunctions.changeMenu(fileNames.aboutMenu);
                SystemFunctions.clearConsole();
            }
            default : return; // Exit menu if invalid input (Normally stopped by the if condition unless some unexpected error occurs)
        }
    }
}

