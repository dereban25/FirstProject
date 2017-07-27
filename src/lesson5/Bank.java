package lesson5;
import java.util.Arrays;
/**
 * Created by dereban on 24.04.2017.
 */
public class Bank {
    public static void main ( String[] args ) {
             String [] names = {"Jack","Ann","Denis","Andrey","Nikolay","Irina","John"};
           int [] balances = {100,500,50,100,12000,-10};

             withdraw ( names,balances,"Ann",400);

             System.out.println ( Arrays.toString (balances));
          }



       	    static int withdraw( String[] clients, int [] balances, String client, int money) {

        int clientIndex = findClientIndexByName ( clients,client );
        if (balances[clientIndex] < money)
            return -1;

        balances[clientIndex] -= money;
        return balances[findClientIndexByName ( clients,client )];



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
