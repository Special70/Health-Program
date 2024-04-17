package process.menuFiles.formCreation.formCreationChildren;

import java.util.Scanner;

import dataRecords.DataFormat;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class BillingInformation {
    private MenuFileNames fileNames = new MenuFileNames();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("Enter Billing Information:");
            System.out.print(" > ");
            String userInput = scanner.nextLine();

            // Invalidates input if input is blank
            if (userInput.length() == 0) {
                continue;
            }

            DataFormat.tempDataObject.setValues("billing_information", userInput);
            break;
        }
        SystemFunctions.changeMenu(fileNames.formCreationSelection);
        SystemFunctions.clearConsole();
    }
}
