package lesson12;

/**
 * Created by dereban on 20.06.2017.
 */
public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw (User user, int amount) {

       if(!checkWithdraw(user,amount))
           return;
        user.setBalance(user.getBalance()-amount - amount*user.getBank().getCommission(amount));
    }


    @Override
    public void fund (User user, int amount) {
        if (checkLimitOfFund(user, amount)) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney (User fromUser, User toUser, int amount) {
        if(checkWithdraw(fromUser,amount)&&checkLimitOfFund(toUser,amount)&&toUser.getBank().getCurrency()==fromUser.getBank().getCurrency()){
            withdraw(fromUser,amount);
            fund(toUser,amount);
        }
    }

    @Override
    public void paySalary (User user) {
       if(checkLimitOfFund(user,user.getSalary()))
           user.setBalance(user.getBalance()+user.getSalary());

    }
    private boolean checkWithdraw(User user,int amount) {
        return checkWithdrawLimits(user,amount,user.getBank().getLimitOfWithdrawal()) && checkWithdrawLimits(user,amount,user.getBalance());

    }
    private boolean checkWithdrawLimits(User user,int amount,double limit) {
        if(amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }
    private boolean checkLimitOfFund(User user,int amount){
        return amount<=user.getBank().getLimitOfFunding();
    }

    private void printWithdrawalErrorMsg(int amount,User user){
        System.err.println("Can`t withdraw money"+amount+"from user"+user.toString());

    }
}
