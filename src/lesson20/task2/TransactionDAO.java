package lesson20.task2;

import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by dereban on 9/20/2017.
 */
public class TransactionDAO{
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();

    public Transaction save(Transaction transaction) throws LimitExceeded{
        //TODO
        return transaction;
    }

    private void validate(Transaction transaction) throws LimitExceeded{
        if(transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + ". Cant be saved");
        int sum = 0;
        int count = 0;
        for(Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
        }
        if(sum>utils.getLimitTransactionsPerDayAmount()){
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + ". Cant be saved");
        }
        if(count>utils.getLimitTransactionsPerDayCount()){
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + ". Cant be saved");
        }
    }

    Transaction[] transactionList(){
        return null;
    }

    Transaction[] transactionList(String city){
        return null;
    }

    Transaction[] transactionList(int amount){
        return null;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for(Transaction transaction : transactions) {
            if(transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if(month == trMonth && day == trDay)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for(Transaction transaction : transactions) {
            if(transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if(month == trMonth && day == trDay) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;

    }
}

