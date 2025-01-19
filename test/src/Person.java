import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String zipCode;

    public Person() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter Street Address: ");
        this.streetAddress = scanner.nextLine();

        System.out.print("Enter City: ");
        this.city = scanner.nextLine();

        System.out.print("Enter Zip Code: ");
        this.zipCode = scanner.nextLine();
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println();
        System.out.println("Person Details: ");
        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("Address: " + person.streetAddress);
        System.out.println("City: " + person.city);
        System.out.println("Zip: " + person.zipCode);
    }
}
