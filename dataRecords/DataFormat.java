package dataRecords;

public class DataFormat {
    // The purpose of this file is to save the details of patient data
    // in a different file.
    
    private String name = "";
    private Integer age = null;
    private String gender = "";
    private String contact_info = "";
    private String birth_date = "";
    private String[] past_current_illnesses = {""};
    private String[] prescriptions = {""};
    private String billing_information = "";

    public static DataFormat tempDataObject = new DataFormat();

    // Constructor that returns the object's name when called for printing
    public String toString() {
        return "Patient Data: "+this.name;
    }

    public void resetFields() {
        this.name = "";
        this.age = null;
        this.gender = "";
        this.contact_info = "";
        this.birth_date = "";
        this.past_current_illnesses = new String[]{""};
        this.prescriptions = new String[]{""};
        this.billing_information = "";

    }

    public void setValues(String datatype, String value) {
        switch (datatype) {
            case "name" : {tempDataObject.name = value; break;}
            case "age" : {tempDataObject.age = Integer.valueOf(value); break;}
            case "gender" : {tempDataObject.gender = value; break;}
            case "contact_info" : {tempDataObject.contact_info = value; break;}
            case "birth_date" : {tempDataObject.birth_date = value; break;}

            case "billing_information" : {tempDataObject.billing_information = value; break;}
        }
    }
    public void setValues(String datatype, String[] value) {
        switch (datatype) {
            case "past_current_illnesses" : {tempDataObject.past_current_illnesses = value;}
            case "prescriptions" : {tempDataObject.prescriptions = value;}
        }
    }

    public String getValues(String datatype) {
        switch (datatype) {
            case "name": return this.name;
            case "age": return String.valueOf(this.age); 
            case "gender": return this.gender;
            case "contact_info": return this.contact_info;
            case "birth_date": return this.birth_date;

            case "billing_information": return this.billing_information;
            default: return "Null";
        }
    }
    public String[] getArrayValues(String datatype) {
        String[] dummy = {""}; // This variable's purpose is to be able to return a default value for the compiler to stop complaining
        switch (datatype) {
            case "past_current_illnesses" : return this.past_current_illnesses;
            case "prescriptions" : return this.prescriptions;
            default: return dummy;
        }
    }

    public boolean checkIfValuesAreFilled() {
        // Checks each field if it contains at least an input
        if (this.name.length() == 0) return false;
        if (this.age == null) return false;
        if (this.gender.length() == 0) return false;
        if (this.contact_info.length() == 0) return false;
        if (this.contact_info.length() == 0) return false;
        if (this.past_current_illnesses.length == 0) return false;
        if (this.prescriptions.length == 0) return false;
        if (this.billing_information.length() == 0) return false;
        return true;  
    }
    
    

}
