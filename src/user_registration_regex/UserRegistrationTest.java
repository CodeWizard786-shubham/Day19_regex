package user_registration_regex;

import java.util.Scanner;


public class UserRegistrationTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();
        System.out.println("Enter First name");
        String firstName = sc.nextLine();
        try {
            user.checkName(firstName);
        } catch (Exception e) {
            throw new Exception("First Name not correct");
        }

    }
}
