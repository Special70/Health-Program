package process.menuFiles.subMenu;

import java.util.Scanner;

import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class ViewFields {
    private LanguageFile lang = new LanguageFile();
    private MenuFileNames fileNames = new MenuFileNames();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        // What exactly happened here is that I grabbed the static object "dataObject" to find its current values
        // so the user knows which values are filled and if filled, they'd know the value of those inputs.
        lang.viewFields();
        String dummy = scanner.nextLine(); // Buffer
        SystemFunctions.changeMenu(fileNames.dataMainMenu);
        SystemFunctions.clearConsole();
    }
}
