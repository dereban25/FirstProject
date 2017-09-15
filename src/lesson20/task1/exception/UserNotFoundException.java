package lesson20.task1.exception;

/**
 * Created by dereban on 9/15/2017.
 */
public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
