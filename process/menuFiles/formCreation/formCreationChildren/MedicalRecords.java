package process.menuFiles.formCreation.formCreationChildren;

import java.util.ArrayList;
import java.util.Scanner;

import dataRecords.DataFormat;
import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class MedicalRecords {
    
    private ArrayList<String> userInputs = new ArrayList<>();
    private LanguageFile lang = new LanguageFile();
    private MenuFileNames fileNames = new MenuFileNames();
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ MEDICAL RECORDS LIST ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            lang.displayFormattedArrayValues(userInputs.toArray(new String[userInputs.size()]));
            System.out.println("Enter values (Type \"cancel\" to exit)");
            System.out.print("|    > ");
            String userInput = scanner.nextLine();
            if (userInput.toLowerCase().equals("cancel")) {break;};
            if (userInput.length() == 0) {continue;}
            userInputs.add(userInput);
        }
        SystemFunctions.changeMenu(fileNames.formCreationSelection);
        SystemFunctions.clearConsole();
        DataFormat.tempDataObject.setValues("past_current_illnesses", userInputs.toArray(new String[userInputs.size()]));
    }
}
