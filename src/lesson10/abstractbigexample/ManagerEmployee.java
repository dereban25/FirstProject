package lesson10.abstractbigexample;

/**
 * Created by dereban on 14.06.2017.
 */
public class ManagerEmployee extends Employee{
    public ManagerEmployee (String name, int age, int yearsOfExperience, int salaryPerMonth) {
        super(name, age, yearsOfExperience, salaryPerMonth);
    }

    @Override
    void paySalary () {
        int newBalance = getBankAccount().getBalance()+getSalaryPerMonth();
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
