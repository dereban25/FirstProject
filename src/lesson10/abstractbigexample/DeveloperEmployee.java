package lesson10.abstractbigexample;

/**
 * Created by dereban on 14.06.2017.
 */
public class DeveloperEmployee extends Employee{
    private String [] frameworks = new String[10];


    public DeveloperEmployee (String name, int age, int yearsOfExperience, int salaryPerMonth, String[] frameworks) {

        super(name, age, yearsOfExperience, salaryPerMonth);
        this.frameworks = frameworks;
    }

    @Override
    void paySalary () {
        int newBalance = getBankAccount().getBalance()+getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);
    }
}
