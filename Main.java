

import languageFiles.LanguageFile;
import process.MenuHandler;
import process.SystemFunctions;

public class Main {

    public Main() {
        
    }
    public static void main(String[] args) {
        MenuHandler menuObj = new MenuHandler();
        
        // Input Buffer
        while (SystemFunctions.getProgramStatus()) {
            menuObj.run();
        }
    }
}