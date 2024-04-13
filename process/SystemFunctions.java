package process;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SystemFunctions {

    public static void delay(int value) {
        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (Exception e) {}; 
    }
    
    public static void clearConsole(){
        //Clears Screen in java.
        try {
            if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static boolean getProgramStatus() {
        return SystemVariables.isProgramRunning;
    }
    public static void shutDownProgram() {
        SystemVariables.isProgramRunning = false;
    }
    
    public static String getCurrentMenu() {
        return SystemVariables.currentMenu;
    }
    public static void changeMenu(String value) {
        SystemVariables.currentMenu = value;
    }
}
