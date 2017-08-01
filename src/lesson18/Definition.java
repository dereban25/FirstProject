package lesson18;

/**
 * Created by dereban on 01.08.2017.
 */
public class Definition {
    private void notifyUsers(String[] userEmails){
        for(String email : userEmails){
            //check mistakes
            try{
                //send email to user - error
                System.out.println("Email " + email + "was sent");
            } catch(Exception e){
                //how should I handle exception
                System.err.println("Email " + email + " was not sent");
            }
        }
    }
}
