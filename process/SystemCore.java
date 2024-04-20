package process;


import process.menuFiles.AboutMenu;
import process.menuFiles.AccessExistingForms;
import process.menuFiles.DataMainMenu;
import process.menuFiles.FrontMenu;
import process.menuFiles.formCreation.FormCreationSelection;
import process.menuFiles.formCreation.formCreationChildren.BillingInformation;
import process.menuFiles.formCreation.formCreationChildren.MedicalRecords;
import process.menuFiles.formCreation.formCreationChildren.PersonalInformation;
import process.menuFiles.formCreation.formCreationChildren.Prescriptions;
import process.menuFiles.subMenu.ResetFields;
import process.menuFiles.subMenu.SubmitFields;
import process.menuFiles.subMenu.ViewFields;
import process.systemCoreFiles.MenuFileNames;

public class SystemCore {

    // The purpose of these variables is to access the properties of other java files
    // without using the static keyword. Mostly ignore the naming of the variables and
    // focus on reading the datatype of the variables below (Just check their respective files
    // for more info)
    MenuFileNames menuNames = new MenuFileNames();

    // Only look its indentions as representation of checking the parent/child menus
    FrontMenu obj001 = new FrontMenu();
        DataMainMenu obj005 = new DataMainMenu();
            FormCreationSelection obj002 = new FormCreationSelection();
                PersonalInformation obj003 = new PersonalInformation();
                BillingInformation obj007 = new BillingInformation();
                Prescriptions obj009 = new Prescriptions();
                MedicalRecords obj012 = new MedicalRecords();
            ViewFields obj006 = new ViewFields();
            ResetFields obj008 = new ResetFields();
            SubmitFields obj010 = new SubmitFields();
        AboutMenu obj004 = new AboutMenu();
        AccessExistingForms obj011 = new AccessExistingForms();


    public void run() {

    // The purpose of the indention is to allow other programmers to know which
    // menus are the parent and child
    
    // Go to SystemFunctions.java to check how getProgramStatus() works
    while (SystemFunctions.getProgramStatus()) {

        // Run Front Menu (Go to FrontMenu.java)
        if (SystemFunctions.getCurrentMenu().equals(menuNames.frontMenu)) {obj001.run(); continue;}
            // Run DataMainMenu (Go to DataMainMenu.java)
            if (SystemFunctions.getCurrentMenu().equals(menuNames.dataMainMenu)) {obj005.run(); continue;}
                // Run Form Creation Menu (Go to FormCreationSelection.java)
                if (SystemFunctions.getCurrentMenu().equals(menuNames.formCreationSelection)) {obj002.run(); continue;}
                    // Run Personal Information Input (Go to PersonalInformation.java)
                    if (SystemFunctions.getCurrentMenu().equals(menuNames.personalInformationMenu)) {obj003.run(); continue;}
                    // Run Billing Information Input (Go to BIllingInformation.java)
                    if (SystemFunctions.getCurrentMenu().equals(menuNames.billingInformationMenu)) {obj007.run(); continue;}
                    // Run Prescriptions Menu Input (Go to Prescriptions.java)
                    if (SystemFunctions.getCurrentMenu().equals(menuNames.prescriptionsMenu)) {obj009.run(); continue;}
                    // Run Medical Records Menu Input (Go to MedicalRecords.java)
                    if (SystemFunctions.getCurrentMenu().equals(menuNames.medicalRecordsMenu)) {obj012.run(); continue;}
                // Run View Fields Menu (Go to ViewFields.java)
                if (SystemFunctions.getCurrentMenu().equals(menuNames.viewFieldsMenu)) {obj006.run(); continue;}
                // Run Reset Fields Menu (Go to ResetFields.java)
                if (SystemFunctions.getCurrentMenu().equals(menuNames.resetFieldsMenu)) {obj008.run(); continue;}
                // Run Submit Fields Menu (Go to SubmitFields.java)
                if (SystemFunctions.getCurrentMenu().equals(menuNames.submitFieldsMenu)) {obj010.run(); continue;}
            // Run About Us Menu (AboutUsMenu.java)
            if (SystemFunctions.getCurrentMenu().equals(menuNames.aboutMenu)) {obj004.run(); continue;}
            // Run Access Existing Forms Menu (AccessExistingForms.java)
            if (SystemFunctions.getCurrentMenu().equals(menuNames.accessExistingFormsMenu)) {obj011.run(); continue;}

    }
        

    }

}

