package lesson20.task2.exception;

/**
 * Created by dereban on 9/20/2017.
 */
public class BadRequestException extends Exception{
    public BadRequestException(String message){
        super(message);
    }
}
