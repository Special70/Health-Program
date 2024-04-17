package process.menuFiles;

import java.util.Scanner;

import dataRecords.DataFormat;
import dataRecords.DataList;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class AccessExistingForms {
    private Scanner scanner = new Scanner(System.in);
    private MenuFileNames fileNames = new MenuFileNames();
    public void run() {
        DataList datalist = new DataList();
        datalist.displayValues();
        System.out.println("Press ENTER to go back");
        String dummy = scanner.nextLine(); // Buffer
        SystemFunctions.changeMenu(fileNames.frontMenu);
        SystemFunctions.clearConsole();
    }
}
