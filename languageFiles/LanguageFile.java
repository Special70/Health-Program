package languageFiles;

import process.SystemFunctions;

public class LanguageFile {

    public String[] frontMenuText = {
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓ HEALTHCARE MANAGEMENT SYSTEM ▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "\n|----------------------------- MAIN MENU -------------------------------|",
        "|\t\t\t\t\t\t\t\t\t|\n|\t[1] FILL OUT A FORM\t\t\t\t\t\t|",
        "|\t\t>> info...\t\t\t\t\t\t|",
        "|\t\t\t\t\t\t\t\t\t|\n|\t[2] ACCESS EXISTING FORMS\t\t\t\t\t|",
        "|\t\t>> info...\t\t\t\t\t\t|",
        "|\t\t\t\t\t\t\t\t\t|\n|\t[3] EXIT THE PROGRAM\t\t\t\t\t\t|",
        "|\t\t\t\t\t\t\t\t\t|",
        "|\t\t\t\t\t\t\t\t\t|",
        "|\t\t\t\t\t\t\t\t\t|",
        "|_______________________________________________________________________|",
        "\n[i] ABOUT US\n\n\t[INSERT THE PROGRAM DESCRIPTION AND GROUP MEMBERS.....]",
        "\n________________________________________________________________________"
    };
    
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
    };
   

    // Language Variables
    public static String[] formCreationMenuText = {
            "====================================",
            "Fill out the menu: ",
            "> Name : ",
            "> Age (Number) : ",
            "> Gender : ",
            "> Contact Info : ",
            "> Birthdate : "
    };

    public void arrayToStringDisplay(String[] targetArray) {
        SystemFunctions.clearConsole();
        for (String value : targetArray) {
            System.out.println(value);
        }
    }

    public void getText(String value) {
        switch (value) {
            case "frontMenu": arrayToStringDisplay(frontMenuText);

        }
    }
}
