package process.menuFiles;

import java.util.Scanner;

import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;

public class AboutUsMenu {

    private Scanner scanner = new Scanner(System.in);
    private LanguageFile lang = new LanguageFile();
    private MenuFileNames fileNames = new MenuFileNames();

    public void run() {
        this.lang.getText("aboutUs"); // Get Text
        String dummy = this.scanner.nextLine(); // Buffer to make users press the enter key to continue
        SystemFunctions.changeMenu(fileNames.frontMenu);
        SystemFunctions.clearConsole();
    }
}
