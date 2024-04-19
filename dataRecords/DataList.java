package dataRecords;
import java.util.ArrayList;


import languageFiles.LanguageFile;
import process.SystemFunctions;

public class DataList {
    // Stores currently existing records
    public static ArrayList<PatientDataObject> records = new ArrayList<>();
    private LanguageFile lang = new LanguageFile();

    // Call this method to insert the pre-made datas 
    // (It cannot be done at DataFormat.java due to circular import issue)
    public static void generateDefaultValues() {
        PatientDataObject tempData = new PatientDataObject();

        tempData.setValues("name", "Marius");
        tempData.setValues("age","10");
        tempData.setValues("gender","Bisexual");
        tempData.setValues("contact_info","1236512");
        tempData.setValues("birth_date", "1/1/1998");
        tempData.setValues("billing_information","CASH");
        tempData.setValues("past_current_illnesses",new String[]{"Rabies","Covid"});
        tempData.setValues("prescriptions",new String[]{"Kryptonite"});
        records.add(tempData);

        PatientDataObject tempData1 = new PatientDataObject();
        tempData1.setValues("name", "Kavro");
        tempData1.setValues("age","12");
        tempData1.setValues("gender","Female");
        tempData1.setValues("contact_info","1226234");
        tempData1.setValues("birth_date", "2/3/1987");
        tempData1.setValues("billing_information","CASH");
        tempData1.setValues("past_current_illnesses",new String[]{"Medusa Virus"});
        tempData1.setValues("prescriptions",new String[]{"Black Hole"});
        records.add(tempData1);

        PatientDataObject tempData2 = new PatientDataObject();
        tempData2.setValues("name", "Ivor");
        tempData2.setValues("age","2510");
        tempData2.setValues("gender","Male");
        tempData2.setValues("contact_info","N/A");
        tempData2.setValues("birth_date", "N/A");
        tempData2.setValues("billing_information","CASH");
        tempData2.setValues("past_current_illnesses",new String[]{"Depression"});
        tempData2.setValues("prescriptions",new String[]{"Anti-Depression Meds"});

        records.add(tempData2);
    }

    // Call this value to insert the current values from the temporary object to a nonstatic
    // object and add it to the records ArrayList static variable for display
    public static void appendValue() {
        PatientDataObject tempObj = new PatientDataObject();
        tempObj.setValues("name", DataFormat.tempDataObject.getValues("name"));
        tempObj.setValues("age",DataFormat.tempDataObject.getValues("age"));
        tempObj.setValues("gender",DataFormat.tempDataObject.getValues("gender"));
        tempObj.setValues("contact_info",DataFormat.tempDataObject.getValues("contact_info"));
        tempObj.setValues("birth_date", DataFormat.tempDataObject.getValues("birth_date"));
        tempObj.setValues("billing_information",DataFormat.tempDataObject.getValues("billing_information"));
        tempObj.setValues("past_current_illnesses",DataFormat.tempDataObject.getArrayValues("past_current_illnesses"));
        tempObj.setValues("prescriptions",DataFormat.tempDataObject.getArrayValues("prescriptions"));
        records.add(tempObj);
    }

    // Mainly used by AccessExistingForms.java file
    public void displayValues() {
        for (int i = 0; i < records.size(); i++) {
            lang.displayPatientRecords(records.get(i));
        }
    } 

}
