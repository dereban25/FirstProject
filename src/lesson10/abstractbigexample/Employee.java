package lesson10.abstractbigexample;

public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;
    private String curPosition;
    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];

    public Employee (String name, int age, int yearsOfExperience, int salaryPerMonth) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName () {
        return name;
    }

    public int getSalaryPerMonth () {
        return salaryPerMonth;
    }

    public BankAccount getBankAccount () {
        return bankAccount;
    }

    abstract void paySalary();

    void changePosition(String newPosition){
        //сохранить текущую позицию в историю
        //поменять позицию
       savePositionToHistory();
        curPosition = newPosition;
    }
    private void savePositionToHistory(){
        int index = 0;
        for(String pos:positionsWorked){
            if(pos == null){
                positionsWorked[index]=curPosition;
                break;
            }
            index++;
        }
    }
    int getBalance(){
        return bankAccount.getBalance();
    }
}
