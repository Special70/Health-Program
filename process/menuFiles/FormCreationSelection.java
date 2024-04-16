package process.menuFiles;

import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

import java.util.Scanner;

public class FormCreationSelection {
    private Scanner scanner = new Scanner(System.in);
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        LanguageFile lang = new LanguageFile();

        lang.displayFormCreationText();
        body:
        while (true) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1": {
                    SystemFunctions.changeMenu(fileNames.personalInformationMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "2": {return;}
                case "3": {return;}
                case "4": {return;}
                case "5": {
                    SystemFunctions.changeMenu(fileNames.frontMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                default : return;
            }
        }
    }
}
