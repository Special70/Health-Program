package process;


import process.menuFiles.FormCreationSelection;
import process.menuFiles.FrontMenu;
import process.menuFiles.formCreationChildren.PersonalInformation;
import process.systemCoreFiles.MenuFileNames;

public class SystemCore {

    // The purpose of these variables is to access the properties of other java files
    // without using the static keyword. Mostly ignore the naming of the variables and
    // focus on reading the datatype of the variables below (Just check their respective files
    // for more info)
    MenuFileNames menuNames = new MenuFileNames();

    FrontMenu obj001 = new FrontMenu();
    FormCreationSelection obj002 = new FormCreationSelection();
    PersonalInformation obj003 = new PersonalInformation();

    public void run() {

        // The purpose of the indention is to allow other programmers to know which
        // menus are the parent and child

        while (SystemFunctions.getProgramStatus()) {
            // Run Front Menu
            if (SystemFunctions.getCurrentMenu().equals(menuNames.frontMenu)) {obj001.run();}
                // Run Form Creation Menu (Main)
                else if (SystemFunctions.getCurrentMenu().equals(menuNames.frontCreationSelection)) {obj002.run();}
                    // Run Personal Information 
                    else if (SystemFunctions.getCurrentMenu().equals(menuNames.personalInformationMenu)) {obj003.run();}

        }
        

    }

}

