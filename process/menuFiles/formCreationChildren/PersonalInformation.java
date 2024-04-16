package process.menuFiles.formCreationChildren;

import languageFiles.LanguageFile;
import process.SystemFunctions;

import java.util.Scanner;

public class PersonalInformation {
    private String name = "";
    private int age;
    private String gender = "";
    private String contact_info = "";
    private String birth_date = "";
    private String[] past_current_illnesses;
    private String[] prescriptions;
    private String billing_information = "";

    private Scanner scanner = new Scanner(System.in);
    public static int editingPhase = 0;
    /*
    1 = Name
    2 = Age
    3 = Gender
    4 = Contact Info
    5 = Birth Date
    */
    public void run() {
        SystemFunctions.clearConsole();
        System.out.println(LanguageFile.formCreationMenuText[0]);
        System.out.println(LanguageFile.formCreationMenuText[1]);
        System.out.print(LanguageFile.formCreationMenuText[2]+" "+this.name);

        if (this.name.length() == 0) {
            this.name = scanner.nextLine();
            editingPhase = 2;
        } else System.out.println("");

        if (editingPhase >= 2) {
            System.out.print(LanguageFile.formCreationMenuText[3]+" "+(age != 0 ? this.age : ""));
            String userInput = scanner.nextLine();
            try {
                this.age = Integer.valueOf(userInput);
                editingPhase = 3;
            } catch (Exception e) {return;}

        } else return;

        if (editingPhase >= 3) {
            System.out.print(LanguageFile.formCreationMenuText[4]+" "+this.gender);
            this.gender = scanner.nextLine();
            editingPhase = 4;
        } else return;

        if (editingPhase >= 4) {
            System.out.print(LanguageFile.formCreationMenuText[5]+" "+this.contact_info);
            this.gender = scanner.nextLine();
            editingPhase = 5;
        } else return;
    }


}
