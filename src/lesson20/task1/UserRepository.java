package lesson20.task1;

import lesson20.task1.exception.BadRequestException;
import lesson20.task1.exception.UserNotFoundException;

/**
 * Created by dereban on 30.05.2017.
 */
public class UserRepository{
    User[] users = new User[10];


    public User save(User user)throws Exception {
        if(user == null)
           throw new BadRequestException("Cant save null user");
        try{
            findById ( user.getId ());
            throw new BadRequestException("User with id: " + user.getId()+ " already exist");
        } catch(UserNotFoundException e){
            System.out.println("User with id: " + user.getId() + " not found.Will be saved");
        }

        int countPlaced = 0;
        for (User us : users){
            if(us !=null)
                countPlaced++;
        }
        int a = 0;

        for (User us : users) {
            if (us== null) {
                users[a] = user;
                break;
            }
            a++;
        }
        return user;
    }
    public User update(User user){
        if(findById ( user.getId ())== null )
            return null;
        int a = 0;

        for (User us : users) {
            if (us.getId()==user.getId ()) {
                users[a] = user;
                break;
            }
            a++;
        }

        return user;
    }

    public void delete(long id){
        User user = findById(id);

        if (user ==null)
            return;
        int index = 0;
        for(User us : users){
            if (us.getId ()==user.getId ()){
                users[index] = null;
                break;
            }
            index++;
        }


    }
    public User findById(long id) throws UserNotFoundException{
        for (User user : users){
            if(user !=null && id == user.getId ())
                return user;
        }
       throw new UserNotFoundException("user with id: " + id + " not found");

    }



}
