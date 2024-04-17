package process;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SystemFunctions {

    // Call this to delay the execution of code by x amount
    // of seconds.
    public static void delay(int value) {
        try {
            TimeUnit.SECONDS.sleep(value);
        } catch (Exception e) {}; 
    }
    
    // Call this to clear the screen of the console output. Will not work
    // everywhere but it will work when it does
    public static void clearConsole(){
        //Clears Screen in java.
        try {
            if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    // Returns true/false. See SystemVariables.java isProgramRunning variable
    public static boolean getProgramStatus() {
        return SystemVariables.isProgramRunning;
    }

    // Call this to shutdown the program.
    // Makes the loop at SystemCore.java cease to work.
    public static void shutDownProgram() {
        SystemVariables.isProgramRunning = false;
    }
    
    // Call this to find out the value of what menu you are at.
    // Useful for knowing which menu the user is at at the moment.
    public static String getCurrentMenu() {
        return SystemVariables.currentMenu;
    }

    // Call this to change what menu the program would display next once the
    // current menu ends or exits
    public static void changeMenu(String value) {
        SystemVariables.currentMenu = value;
    }
}
