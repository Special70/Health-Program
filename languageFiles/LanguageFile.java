package languageFiles;

import process.SystemFunctions;

public class LanguageFile {

    public static void testFunction() {
            SystemFunctions.clearConsole();
		   	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
               System.out.println("▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓");
               System.out.println("▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓ HEALTHCARE MANAGEMENT SYSTEM ▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓");
               System.out.println("▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓");
               System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
   
               System.out.println("\n|----------------------------- MAIN MENU -------------------------------|");
               System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[1] FILL OUT A FORM\t\t\t\t\t\t|");
               System.out.println("|\t\t>> info...\t\t\t\t\t\t|");
               System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[2] ACCESS EXISTING FORMS\t\t\t\t\t|");
               System.out.println("|\t\t>> info...\t\t\t\t\t\t|");
               System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[3] EXIT THE PROGRAM\t\t\t\t\t\t|");
               System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|");
               System.out.println("|_______________________________________________________________________|");
   
               System.out.println("\n[i] ABOUT US\n\n\t[INSERT THE PROGRAM DESCRIPTION AND GROUP MEMBERS.....]");
               System.out.println("\n________________________________________________________________________");
    }

    
    public void displayFormCreationText () {
        SystemFunctions.clearConsole();
        System.out.println("\n\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ FILL OUT FORM ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\tWelcome to the form filling section!\t\t\t\t|");
        System.out.println("|\tWhat would you like to fill out?\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[1] PERSONAL INFORMATION\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[2] MEDICAL RECORDS\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[3] PRESCRIPTION\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[4] BILLING INFORMATION\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[5] RETURN TO MAIN MENU\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________|");
        System.out.print("\n\n\t>> PLEASE SELECT YOUR CHOICE: "); 
    }
   

    // Language Variables
    private static void getMainMenuText() {
        String[] mainMenuText = {
        "=========================================",
        " Welcome to the Hospital App",
        "",
        " [1] Fill Out a Form",
        "",
        " [2] Access Existing Forms",
        "",
        " [3] Exit Program",
        ""
        };
        arrayToStringDisplay(mainMenuText);
    }
    public static String[] formCreationMenuText = {
            "====================================",
            "Fill out the menu: ",
            "> Name : ",
            "> Age (Number) : ",
            "> Gender : ",
            "> Contact Info : ",
            "> Birthdate : "
    };

    private static void arrayToStringDisplay(String[] targetArray) {
        SystemFunctions.clearConsole();
        for (String value : targetArray) {
            System.out.println(value);
        }
    }

    public static void getText(String value) {
        switch (value) {
            case "mainMenu": getMainMenuText();

        }
    }
}
