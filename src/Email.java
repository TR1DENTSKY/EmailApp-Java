import java.util.Scanner;

public class Email {

    // Fields
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 12;

    // Constructor that will receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for: " + this.firstName + " " + this.lastName);
        System.out.println();

    // Calling a method asking for the department choice and return the department
        this.department = setDepartment();
        System.out.println(department + " department selected!");
        System.out.println();

        // Combining elements to generate email
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase()
                + "." + "company.com";
        System.out.println("Email is: " + email);

    // Calling a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password is: " + this.password);

        System.out.println();

        System.out.println("Welcome to the company, " + firstName + " " + lastName + ".");

    }

    /*----------------------------------------METHODS-------------------------------------------*/

    // Asking user for the department choice
    private String setDepartment() {
        System.out.print("Which Department?\n1 - Sales\n2 - Development\n3 - Accounting\n" +
                "Enter Department Code: ");

        // Calling Scanner for User input
        Scanner input = new Scanner(System.in);
        int deptChoice = input.nextInt();

        // IF statement for user input
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
           return "";
        }
    }
    
    // Generate random password
    private String randomPassword (int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++ ) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

}
