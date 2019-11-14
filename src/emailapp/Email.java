package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales \n2 Accounting");
    }

    // Generate random password

    // Set mailbox capacity

    // Set alternate e-mail

    // Change the password
}
