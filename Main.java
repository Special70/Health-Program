

import languageFiles.LanguageFile;
import process.SystemCore;
import process.SystemFunctions;

public class Main {

    public Main() {
        
    }
    public static void main(String[] args) {
        SystemCore menuObj = new SystemCore();
        
        // Input Buffer
        while (SystemFunctions.getProgramStatus()) {
            menuObj.run();
        }
    }
}