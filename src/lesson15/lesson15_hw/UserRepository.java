package lesson15.lesson15_hw;

/**
 * Created by dereban on 26.06.2017.
 */
public class UserRepository {
    User[] users = new User[10];


    public User save(User user) {
        if(user==null)
            return null;
        if(findById ( user.getId ())!= null )
            return null;
        int countPlaced = 0;
        for (User us : users){
            if(us !=null)
                countPlaced++;
        }
        if(countPlaced>9)
            return null;
        int a = 0;

        for (User us : users) {
            if (us == null) {
                users[a] = user;
                break;
            }
            a++;
        }
        return user;
    }
    public User update(User user){

        int a = 0;

        for (User us : users) {
            if (us.getId()==user.getId()) {
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
            if (us.equals(users)){
                users[index] = null;
                break;
            }
            index++;
        }


    }
    private User findById(long id){
        for (User user : users){
            if(user !=null && user.equals(id))
                return user;
        }
        return null;


    }


}
