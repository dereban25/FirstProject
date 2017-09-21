package lesson20.task2.exception;

/**
 * Created by dereban on 9/20/2017.
 */
public class LimitExceeded extends BadRequestException{
    public LimitExceeded(String message){
        super(message);
    }
}
