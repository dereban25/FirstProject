package lesson20.task1.exception;

/**
 * Created by dereban on 9/15/2017.
 */
public class BadRequestException extends Exception{

    public BadRequestException(String message){
        super(message);
    }
}
