package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPassLength = 10;
    private int mailboxCapacity = 600;
    private String alternateEmail;
    private String companyWebsite = "webbygg.se";

    // Constructor to receive first and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call method asking for department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPassLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate e-mail
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyWebsite;
        //System.out.println("Your email is: " + email);
    }


    // Ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + " " + lastName + "\nDepartment CODES:\n1 for Sales \n2 for Accounting\n0 for None\nEnter department code: ");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@%$#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    ;

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate e-mail
    public void setAlternateEmail(String alternativeEmail) {
        this.alternateEmail = alternativeEmail;
    }

    // Change the password
    public void changePassword(String passChange) {
        this.password = passChange;
    }


    // Getters
    public String getPassword() {
        return password;
    }


    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email + " " + "\nMailbox Capacity: " + mailboxCapacity + "mb" ;

    }

}


