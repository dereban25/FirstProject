package lesson9;

/**
 * Created by dereban on 26.05.2017.
 */
public class Employee {
    String name;
    Company company;
    int monthlySalary;

    public Employee( String name, Company company, int monthlySalary ) {
        this.name = name;
        this.company = company;
        this.monthlySalary = monthlySalary;
    }
}
