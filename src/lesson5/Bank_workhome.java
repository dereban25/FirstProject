package lesson5;

import java.util.Arrays;

/**
 * Created by dereban on 07.04.2017.
 */
public class Bank_workhome {
    public static void main ( String[] args ) {
        String [] names = {"Jack","Ann","Denis","Andrey","Nikolay","Irina","John"};
        int [] balances = {100,500,8432,-99,12000,-54,0};

        withdraw ( names,balances,"Ann",300);

            System.out.println ( Arrays.toString (balances));

        }

    static int withdraw( String[] clients, int [] balances, String client, int amount) {

        int clientIndex = findClientIndexByName(clients, client);

        if (balances[clientIndex] < amount)
            return -1;

        balances[ findClientIndexByName ( clients, client ) ] -= amount ;

        return balances[findClientIndexByName ( clients,client )] ;
    }


    static int findClientIndexByName(String[] clients,String client) {

        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

}












