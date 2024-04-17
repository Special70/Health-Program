import dataRecords.DataList;
import process.SystemCore;

public class Main {
    public static void main(String[] args) {
        // Get the object of the system to avoid using the static keyword
        SystemCore menuObj = new SystemCore();
        
        // When this is called, the entire program starts.

        // The main purpose of Main.java is to run the code's main
        // execution. 

        // It is kept simple for now for future plans such as multithreading
        DataList.generateDefaultValues();
        menuObj.run();
    }
}