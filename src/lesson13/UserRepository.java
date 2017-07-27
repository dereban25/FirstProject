package lesson13;

/**
 * Created by dereban on 30.05.2017.
 */
public class UserRepository{
    User[] users = new User[10];


    public User save(User user) {
        if(user == null)
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
            if (us== null) {
                users[a] = user;
                break;
            }
            a++;
        }
        return user;
    }
    public User update(User user){
        if(user ==null)
            return null;
        User curUser=findById(user.getId());
        if(curUser==null)
            return null;

        long curUserId = curUser.getId();

        int a = 0;

        for (User us : users) {
            if (us!=null &&us.getId()==curUserId) {
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
    private User findById(long id){
        for (User user : users){
            if(user !=null && id == user.getId ())
                return user;
        }
        return null;

    }



}
