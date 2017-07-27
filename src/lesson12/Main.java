package lesson12;

/**
 * Created by dereban on 20.06.2017.
 */
public class Main {
    public static void main (String[] args) {
        Bank euBank = new EUBank(1222,"Sweden",Currency.USD,100,1400,4,444343434);
        Bank usBank = new USBank(1523,"Canada",Currency.USD,1500,350,2,152364);
        User user1 = new User(253,"Fedy",1500,35,"MTS",500,usBank);
        User user = new User(1001,"Denis",12200,40,"GMD",1500,euBank);
        BankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user,150);
        System.out.println(user.getBalance());
        bankSystem.fund(user,300);
        System.out.println(user.getBalance());
        euBank.getCurrency();
        System.out.println(user.getBank().getCurrency());
        bankSystem.paySalary(user);
        System.out.println(user.getSalary());
        bankSystem.transferMoney(user,user1,100);
        System.out.println(user.getBalance());
        System.out.println(user1.getBalance());





    }
}
