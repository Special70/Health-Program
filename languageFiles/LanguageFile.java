package languageFiles;

import process.SystemFunctions;
import dataRecords.DataFormat;
import dataRecords.PatientDataObject;

public class LanguageFile {

    // Majority of the text that's meant to be displayed will be placed here
    // to maintain code cleanliness

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
    
    public String[] aboutUs = {
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓ HEALTHCARE MANAGEMENT SYSTEM ▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "\n|----------------------------- ABOUT US -------------------------------|",
        "|   Main Programmer: Josef Miko Uruqico",
        "|   Graphic Designer: Venice Bianca Ochoa",
        "|   Contributors:   ",
        "|   Ranz Emmanuel Cuarto",
        "|   Claire Bianca Ochoa",
        "|",
        "|   Press ENTER to go back",
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓"
    };

    public String[] dataMainMenu = {
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓ HEALTHCARE MANAGEMENT SYSTEM ▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓",
        "▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▒▒▒▓▓▓▓▓▓",
        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
        "\n|----------------------------- DATA MENU ------------------------------|",
        "|   ",
        "|   [1] FILL OUT FIELDS",
        "|   ",
        "|   [2] RESET FIELDS",
        "|   ",
        "|   [3] SUBMIT FIELDS",
        "|   ",
        "|   [4] VIEW FIELDS TO FILL",
        "|   ",
        "|   [5] BACK",
        "|   "
    };

    public void displayFormCreationText () {
        SystemFunctions.clearConsole();
        System.out.println("\n\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ FILL OUT FORM ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\tWelcome to the form filling section!\t\t\t\t|");
        System.out.println("|\tWhat would you like to fill out?\t\t\t\t|");                                           
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t"+(DataFormat.tempDataObject.getValues("name").length() == 0 ? "[1] PERSONAL INFORMATION" : "Already Filled out     \t")+"\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[2] MEDICAL RECORDS\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[3] PRESCRIPTION\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t"+(DataFormat.tempDataObject.getValues("billing_information").length() == 0 ? "[4] BILLING INFORMATION\t" : "Already Filled out     \t")+"\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n|\t[5] BACK\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|"); System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|_______________________________________________________________________|");
        System.out.print("\n\n\t>> PLEASE SELECT YOUR CHOICE: "); 
    };
   
    public static String[] formCreationMenuText = {
            "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ FILL OUT FORM ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
            "Fill out the menu: ",
            "> Name : ",
            "> Age (Number) : ",
            "> Gender : ",
            "> Contact Info : ",
            "> Birthdate : "
    };

    public void viewFields() {
         
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("|");
        System.out.println("|    Name: "+(DataFormat.tempDataObject.getValues("name").length() != 0 ? DataFormat.tempDataObject.getValues("name") : "Needs to be filled"));
        System.out.println("|    Age: "+(DataFormat.tempDataObject.getValues("age") != "null" ? DataFormat.tempDataObject.getValues("age") : "Needs to be filled"));
        System.out.println("|    Gender: "+(DataFormat.tempDataObject.getValues("gender").length() != 0 ? DataFormat.tempDataObject.getValues("gender") : "Needs to be filled"));
        System.out.println("|    Contact Info: "+(DataFormat.tempDataObject.getValues("contact_info").length() != 0 ? DataFormat.tempDataObject.getValues("contact_info") : "Needs to be filled") );
        System.out.println("|    Birth Date: "+(DataFormat.tempDataObject.getValues("birth_date").length() != 0 ? DataFormat.tempDataObject.getValues("birth_date") : "Needs to be filled") );
        System.out.println("|");
        System.out.println("|    Past Current Illnesses:");
        displayFormattedArrayValues(DataFormat.tempDataObject.getArrayValues("past_current_illnesses"));
        System.out.println("|");
        System.out.println("|    Prescriptions:");
        displayFormattedArrayValues(DataFormat.tempDataObject.getArrayValues("prescriptions"));
        System.out.println("|");
        System.out.println("|    Billing Information: "+(DataFormat.tempDataObject.getValues("billing_information").length() != 0 ? DataFormat.tempDataObject.getValues("billing_information") : "Needs to be filled") );
        System.out.println("|");
        System.out.println("|    Press ENTER to go back");
        System.out.println("|");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }

    public void displayPatientRecords(PatientDataObject obj) {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("|   Name:"+obj.getValues("name"));
        System.out.println("|   Age:"+obj.getValues("age"));
        System.out.println("|   Gender:"+obj.getValues("gender"));
        System.out.println("|   Contact Informaton:"+obj.getValues("contact_info"));
        System.out.println("|   Birth Date:"+obj.getValues("birth_date"));
        System.out.println("|   Past Current Illnesses:");
        displayFormattedArrayValues(obj.getArrayValues("past_current_illnesses"));
        System.out.println("|   Prescriptions:");
        displayFormattedArrayValues(obj.getArrayValues("prescriptions"));
        System.out.println("|   Billing Information:"+obj.getValues("billing_information"));
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("");
    }

    // Accepts a string variable and iterates through each variable and prints the value
    // Primarily used to convert a string variable into a text to display values
    public void displayArrayAsText(String[] targetArray) {
        SystemFunctions.clearConsole();
        for (String value : targetArray) {
            System.out.println(value);
        }
    }

    // Used for properly displaying array values.
    // NOT USED FOR DISPLAYING MENU TEXT
    public void displayFormattedArrayValues(String[] array) {
        for (String element : array) {
            System.out.println("|    - "+element);
        }
    }

    // Call to specify which private variable you wish to call
    public void getText(String value) {
        switch (value) {
            case "frontMenu": {displayArrayAsText(frontMenuText); break;}
            case "dataMainMenu": {displayArrayAsText(dataMainMenu); break;}
            case "aboutUs": {displayArrayAsText(aboutUs); break;}

        }
    }
}
