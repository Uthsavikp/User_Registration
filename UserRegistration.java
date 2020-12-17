package registration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");

        boolean flag;
        Scanner user = new Scanner(System.in);
        do {
            String firstName = "[A-Z][a-zA-Z]{2,}";
            System.out.println("Enter Your First Name: ");
            String userInput = user.next();
            flag = userInput.matches(firstName);
            if (!flag) System.out.println("Re Enter Your Name With Capital And With Minimum 3 Characters: ");
        } while (!flag);
        System.out.println("Valid First Name");

        do {
            String lastName = "[A-Z][a-zA-Z]{2,}";
            System.out.println("Enter Your Last Name: ");
            String userInput = user.next();
            flag = userInput.matches(lastName);
            if (!flag) System.out.println("Re Enter Your Name With Capital And With Minimum 3 Characters: ");
        } while (!flag);
        System.out.println("Valid Last Name");

        do {
            String email = "[a-zA-Z]{3}[0-9a-zA-Z\\.]*@[a-z]*\\.(co|in)";
            System.out.println("Enter Your Email Address: ");
            String userInput = user.next();
            flag = userInput.matches(email);
            if (!flag) System.out.println("Re Enter Your Email Address: ");
        } while (!flag);
        System.out.println("Valid Email Address");
    }

}


