package process.menuFiles.subMenu;

import java.util.Scanner;

import dataRecords.DataFormat;
import dataRecords.DataList;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class SubmitFields {
    private Scanner scanner = new Scanner(System.in);
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        if (DataFormat.tempDataObject.checkIfValuesAreFilled() == false) {
            System.out.println("You have missed some fields to fill out.");
            System.out.println("Check again.");
            System.out.println("");
            System.out.println("Press ENTER to go back");
            String dummy = scanner.nextLine(); // Buffer
        } else {
            System.out.println("Do you want to submit the data?");
            System.out.println("    ( Y / N )");
            String userInput = scanner.nextLine();
            if ("yn".contains(userInput)) {
                if (userInput.toLowerCase().equals("y")) {
                    DataList.appendValue();
                    DataFormat.tempDataObject.resetFields(); // Reset values so the user can input more forms
                }
                SystemFunctions.changeMenu(fileNames.frontMenu);
                SystemFunctions.clearConsole();
            }
        }
    }
}
