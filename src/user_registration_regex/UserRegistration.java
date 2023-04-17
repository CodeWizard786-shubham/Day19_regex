package user_registration_regex;
import java.lang.Exception;
import java.util.regex.Pattern;

public class UserRegistration {
    public void checkName(String name) throws Exception{
    String namePattern="^[A-Z][a-z]{2,}$";
    boolean b= Pattern.matches(namePattern,name);
    if(!b){
        throw new RuntimeException();
    }else{
        System.out.println("Name correct");
    }
    }
}
