package process.mainMenuChildren;

import languageFiles.LanguageFile;
import process.SystemFunctions;

import java.util.Scanner;

public class FormCreationSelection {
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        LanguageFile lang = new LanguageFile();

        lang.displayFormCreationText();
        body:
        while (true) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1": {
                    SystemFunctions.changeMenu("formCreation_personalInformation");
                    SystemFunctions.clearConsole();
                    break body;}
                case "2": {return;}
                case "3": {return;}
                case "4": {return;}
                case "5": {return;}
                default : return;
            }
        }
    }
}
