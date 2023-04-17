package user_registration_regex;
import java.lang.Exception;
import java.util.regex.Pattern;

public class UserRegistration {
    public void checkName(String name) throws Exception {
        String namePattern = "^[A-Z][a-z]{2,}$";
        boolean b = Pattern.matches(namePattern, name);
        if (!b) {
            throw new RuntimeException();
        } else {
            System.out.println("Name correct");
        }
    }

    public void checkEmail(String email) throws Exception {
        String emailValidation = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        boolean b = Pattern.matches(emailValidation, email);
        if (!b) {
            throw new RuntimeException();
        } else {
            System.out.println("Email Correct : " + email);
        }
    }

    }
}
