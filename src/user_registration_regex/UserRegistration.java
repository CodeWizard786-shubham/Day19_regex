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
    public void checkPhoneNumber(String phoneNumber) throws Exception {
        String phoneNumberPattern = "^\\d{1,3}\\s[6-9]\\d{2}[\\s-]?\\d{3}[\\s-]?\\d{4}$";
        boolean b = Pattern.matches(phoneNumberPattern, phoneNumber);
        if (!b) {
            throw new RuntimeException();
        } else {
            System.out.println("Phone number correct");
        }
    }
    public void checkPassword(String password){
        String passwordPattern = "^(?=.*[A-Z]).(?=.*[0-9]).(?=.*[!@#%&])(?!.*[!@#$%^&*].*[!@#$%^&*]).{8,}$";
        boolean b = Pattern.matches(passwordPattern,password);
        if (!b) {
            throw new RuntimeException();
        } else {
            System.out.println("Password correct");
        }
    }
    }
