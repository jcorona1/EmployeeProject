public enum InsuranceType {
    BLUECROSS,
    AMBETTER,
    FARMERS,
    AETNA,
    AFLAC
    ;

    @Override
    public String toString() {
        String insuranceString = "";

        if (name() == "BLUECROSS") {
            insuranceString = "BlueCross";
        }
        else if (name() == "AMBETTER") {
            insuranceString = "Ambetter";
        }
        else if (name() == "FARMERS") {
            insuranceString = "Farmers";
        }
        else if (name() == "AETNA") {
            insuranceString = "Aetna";
        }
        else if (name() == "AFLAC") {
            insuranceString = "Aflac";
        }
        else {
            insuranceString = "No insurance selected";
        }

        return insuranceString;
    }
}
