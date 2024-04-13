package process;


import process.mainMenuChildren.FormCreationSelection;
import process.mainMenuChildren.MainMenuInput;
import process.mainMenuChildren.formCreationChildren.PersonalInformation;

public class MenuHandler {
    MainMenuInput obj001 = new MainMenuInput();
    FormCreationSelection obj002 = new FormCreationSelection();
    PersonalInformation obj003 = new PersonalInformation();

    public void run() {
        while (true) {
        switch (SystemFunctions.getCurrentMenu()) {
            case "mainMenu" : {obj001.run(); break;} 
            case "formCreation_MAIN" : {obj002.run(); break;}
            case "formCreation_personalInformation" : {obj003.run(); break;}
            default : {System.out.println("Something Broke!"); SystemFunctions.delay(1);}; 
            }
        }
    }

}
