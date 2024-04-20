package process.menuFiles.subMenu;

import java.util.Scanner;

import dataRecords.DataFormat;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class ResetFields {
    private Scanner scanner = new Scanner(System.in);
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("Are you sure you want to reset the fields?");
            System.out.println(" ( Y / N )");
            String userInput = scanner.nextLine().toLowerCase();
            if ("yn".contains(userInput) && userInput.length() == 1) {
                    if (userInput.equals("y")) {
                        DataFormat.tempDataObject.resetFields();
                    };
                    SystemFunctions.changeMenu(fileNames.dataMainMenu);
                    SystemFunctions.clearConsole();
                    return;
            }
        }
    }
}
