package lesson8.accounts;

/**
 * Created by dereban on 18.05.2017.
 */
public class CheckingAccount extends Account{

    int limitOFExpenses;

    public CheckingAccount ( String bankName, String ownerName, int moneyAmount, int limitOFexpenses ) {
        super ( bankName, ownerName, moneyAmount );
        this.limitOFExpenses = limitOFexpenses;
    }



    void withdraw(int amount){
        if (amount > limitOFExpenses)
            return;
         moneyAmount -= amount;
    }



}
