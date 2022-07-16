import java.math.BigDecimal;
import java.util.ArrayList;
import java.time.LocalDate;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee thor = new Employee("Thor", 'E', "Odinsson", "1234567", "000-12-3456", LocalDate.parse("0600-06-20"));
        Employee blackWidow = new Employee("Natasha", 'R', "Romanov", "1298942", "324-34-6743", LocalDate.parse("1984-03-12"), BigDecimal.valueOf(370000.00));

        System.out.println(thor.COMPLEX_CODE);

        System.out.println(thor);
        System.out.println(blackWidow);

        Employee[] employees = new Employee[3];
        employees[0] = thor;
        employees[1] = blackWidow;
        employees[2] = new Employee("Peter", 'J', "Parker", "8733475", "431-46-1231", LocalDate.parse("1990-03-14"), BigDecimal.valueOf(400000.00));

        for(int heroCounter = 0; heroCounter < employees.length; ++heroCounter) {
            System.out.println(employees[heroCounter] + "\n");
        }

        for(Employee hero : employees) {
            System.out.println(hero);
        }

        ArrayList<Employee> arrayListHeroNames = new ArrayList<>();
        arrayListHeroNames.add(thor);
        arrayListHeroNames.add(blackWidow);
        arrayListHeroNames.add(employees[2]);
        arrayListHeroNames.add(new Employee("Rusty", 'P', "Can", "2346847", "431-76-1345", LocalDate.parse("0286-12-25"), BigDecimal.valueOf(1000)));
        arrayListHeroNames.add(new EmployeeWithInsurance("A'run", ' ', "Zelger", "3947634", "425-34-3467", LocalDate.parse("0246-03-23"), InsuranceType.AETNA, BigDecimal.valueOf(500)));
        arrayListHeroNames.add(new EmployeeWithInsurance("Aoife", 'E', "Ashfell", "5934725", "472-34-1241", LocalDate.parse("0285-12-31"), InsuranceType.BLUECROSS, BigDecimal.valueOf(9999)));

        arrayListHeroNames.forEach(System.out::println);
        arrayListHeroNames.get(3).setMiddleInitial('Z');
        arrayListHeroNames.forEach(System.out::println);

        System.out.println(Math.PI);
        System.out.println(Math.pow(5.0, 2.0));
        System.out.println(Math.round(Math.pow(2.0, 3.0)));

    }
}
