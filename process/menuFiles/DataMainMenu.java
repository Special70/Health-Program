package process.menuFiles;

import java.util.Scanner;

import dataRecords.DataFormat;
import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class DataMainMenu {
    private LanguageFile lang = new LanguageFile();
    private Scanner scanner = new Scanner(System.in);
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        SystemFunctions.clearConsole();
        lang.getText("dataMainMenu");
        System.out.print(" > ");
        body: while (true) {
            String userInput = scanner.nextLine();
            switch(userInput) {
                case "1": {
                    SystemFunctions.changeMenu(fileNames.formCreationSelection);
                    SystemFunctions.clearConsole();
                    break body;}
                case "2":  {
                    SystemFunctions.changeMenu(fileNames.resetFieldsMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "3": {
                    if (DataFormat.tempDataObject.checkIfValuesAreFilled() == true) {
                        SystemFunctions.changeMenu(fileNames.submitFieldsMenu);
                        SystemFunctions.clearConsole();
                    }
                    break body;}
                case "4": {
                    SystemFunctions.changeMenu(fileNames.viewFieldsMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "5": {
                    SystemFunctions.changeMenu(fileNames.frontMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                default : {break body;}
            }
        }

    }
}
