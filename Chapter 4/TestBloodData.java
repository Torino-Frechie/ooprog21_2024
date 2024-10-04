class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public void displayBloodInfo() {
        System.out.println("Blood Type: " + bloodType + rhFactor);
    }
}

public class TestBloodData {
    public static void main(String[] args) {
        BloodData patient = new BloodData();
        patient.displayBloodInfo();

        patient.setBloodType("AB");
        patient.setRhFactor("-");
        patient.displayBloodInfo();

        patient.defaultPatient();
        patient.displayBloodInfo();
    }
}
