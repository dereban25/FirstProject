package lesson12;

/**
 * Created by dereban on 20.06.2017.
 */
public interface BankSystem {
    void withdraw(User user,int amount);
    void fund(User user, int amount);
    void transferMoney(User fromUser,User toUser,int amount);
    void paySalary(User user);

}
