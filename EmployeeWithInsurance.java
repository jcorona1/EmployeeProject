import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeWithInsurance extends Employee {

    private InsuranceType insuranceType;

    public EmployeeWithInsurance(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth, InsuranceType insuranceType) {
        super(firstName, middleInitial, lastName, idNumber, socialSecurityNumber, dateOfBirth);
        this.insuranceType = insuranceType;
    }

    public EmployeeWithInsurance(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth, InsuranceType insuranceType, BigDecimal salary) {
        super(firstName, middleInitial, lastName, idNumber, socialSecurityNumber, dateOfBirth, salary);
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        String InsuranceTypeName = "";

        String buildString = super.toString();

        switch (insuranceType) {
            case BLUECROSS: InsuranceTypeName = InsuranceType.BLUECROSS.toString(); break;
            case AMBETTER: InsuranceTypeName = InsuranceType.AMBETTER.toString(); break;
            case FARMERS: InsuranceTypeName = InsuranceType.FARMERS.toString(); break;
            case AETNA: InsuranceTypeName = InsuranceType.AETNA.toString(); break;
            case AFLAC: InsuranceTypeName = InsuranceType.AFLAC.toString(); break;
            default: InsuranceTypeName = "No insurance selected";
        }

        buildString += String.format("Insurance: %s \n", InsuranceTypeName);

        return buildString;
    }
}
