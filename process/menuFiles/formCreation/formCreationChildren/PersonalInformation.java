package process.menuFiles.formCreation.formCreationChildren;

import languageFiles.LanguageFile;
import process.SystemFunctions;
import process.systemCoreFiles.MenuFileNames;
import dataRecords.DataFormat;

import java.util.Scanner;

public class PersonalInformation {

    MenuFileNames fileNames = new MenuFileNames();

    private String name = "";
    private Integer age;
    private String gender = "";
    private String contact_info = "";
    private String birth_date = "";

    private Scanner scanner = new Scanner(System.in);
    /*
    1 = Name
    2 = Age
    3 = Gender
    4 = Contact Info
    5 = Birth Date
    */
    public void run() {
        while (true) {
        // This code involves slowly adding more text that is why
        // this segment uses array indexing to carefully select
        // the string it wants to 
        SystemFunctions.clearConsole();
        System.out.println(LanguageFile.formCreationMenuText[0]);
        System.out.println(LanguageFile.formCreationMenuText[1]);
        System.out.print(LanguageFile.formCreationMenuText[2]+" "+this.name);

        // NAME INPUT FIELD
        if (this.name.length() == 0) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {continue;} // Invalidates blank inputs
            this.name = userInput;
        } else System.out.println("");
        
        // AGE INPUT FIELD
        System.out.print(LanguageFile.formCreationMenuText[3]+" "+(age != null ? this.age : ""));
        if (this.age == null) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {continue;} // Invalidates blank inputs
            try {
                this.age = Integer.valueOf(userInput);
            } catch (Exception e) {continue;}
        } else System.out.println("");
        
        // GENDER INPUT FIELD
        System.out.print(LanguageFile.formCreationMenuText[4]+" "+this.gender);
        if (this.gender.length() == 0) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {continue;} // Invalidates blank inputs
            this.gender = userInput;
        } else System.out.println("");
        
        // CONTACT INFO INPUT FIELD
        System.out.print(LanguageFile.formCreationMenuText[5]+" "+this.contact_info);
        if (this.contact_info.length() == 0) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {continue;} // Invalidates blank inputs
            this.contact_info = userInput;
        } else System.out.println("");

        // BIRTH DATE INPUT FIELD
        System.out.print(LanguageFile.formCreationMenuText[6]+" "+this.birth_date);
        if (this.birth_date.length() == 0) {
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {continue;} // Invalidates blank inputs
            this.birth_date = userInput;
        } else System.out.println("");

        // Once the code ends, run methods to record the data to an object and exit the program
        DataFormat.tempDataObject.setValues("name", this.name);
        DataFormat.tempDataObject.setValues("age", String.valueOf(this.age));
        DataFormat.tempDataObject.setValues("gender", this.gender);
        DataFormat.tempDataObject.setValues("contact_info", this.contact_info);
        DataFormat.tempDataObject.setValues("birth_date", this.birth_date);
        
        // Clears the values for re-use if the fields are cleared
        this.name = "";
        this.age = null;
        this.gender = "";
        this.contact_info = "";
        this.birth_date = "";

        // Switch to the FormCreationSelection menu (FormCreationSelection.java)
        SystemFunctions.changeMenu(fileNames.formCreationSelection);
        SystemFunctions.clearConsole();
        break;
        }
    }


}
