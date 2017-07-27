package lesson9.utils;

/**
 * Created by dereban on 26.05.2017.
 */
public class Checker {
    public int companyNamesValidatedCount = 0;



    public boolean checkCompanyName(String companyName){
        companyNamesValidatedCount ++;
        return companyName !="Google" && companyName !="Amazon";
    }
}
