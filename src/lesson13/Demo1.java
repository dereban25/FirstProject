package lesson13;


import java.util.Arrays;

/**
 * Created by DT on 20.06.2017.
 */
public class Demo1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        System.out.println(Arrays.deepToString(userRepository.users));

        User user = new User(1001,"Ann","1w21212");
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.users));

        int n =15;
        while(n>0){
            User user1 = new User(n,"Ann","1w21212");
            System.out.println(userRepository.save(user1));
            n--;
        }
        System.out.println(Arrays.deepToString(userRepository.users));

        userRepository.save(null);

        //test update
        user = new User(1001,"Ann","erete");
        userRepository.update(user);
        System.out.println(Arrays.deepToString(userRepository.users));

        user = new User(9999,"Ann","erete");
        userRepository.update(user);
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.users));

        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.users));

    }
}
