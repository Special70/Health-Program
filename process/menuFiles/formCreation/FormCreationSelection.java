package process.menuFiles.formCreation;

import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;
import dataRecords.DataFormat;

import java.util.Scanner;

public class FormCreationSelection {
    // Create Scanner object
    private Scanner scanner = new Scanner(System.in);
    // Import file name details for menu switching
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        // Import LanguageFile properties to utilize the text
        LanguageFile lang = new LanguageFile();

        lang.displayFormCreationText();
        // The WHILE loop is given the "body:" label so the statements inside the switch case can
        // end the loop when needed.
        body:
        while (true) {
            String userInput = scanner.nextLine();
            System.out.print(" > ");
            switch (userInput) {
                // Switch to Personal Information Menu (See PersonalInformation.java)
                case "1": {
                    if (DataFormat.tempDataObject.getValues("name").length() != 0) {break body;};
                    SystemFunctions.changeMenu(fileNames.personalInformationMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "2": {
                    SystemFunctions.changeMenu(fileNames.medicalRecordsMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "3": {
                    SystemFunctions.changeMenu(fileNames.prescriptionsMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                case "4":  {
                    if (DataFormat.tempDataObject.getValues("billing_information").length() != 0) {break body;};
                    SystemFunctions.changeMenu(fileNames.billingInformationMenu);
                    SystemFunctions.clearConsole();
                    break body;}
                // Switch to Form Creation Selection (See FormCreationSelection.java)
                case "5": { 
                    SystemFunctions.changeMenu(fileNames.dataMainMenu);
                    SystemFunctions.clearConsole();
                    break body;
                }
                default : return;
            }
        }
    }
}
