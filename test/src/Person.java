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
        System.out.println(person);
    }



    @Override
    public String toString() {
        return "Person: {" +
                "First Name: " + firstName + " / " +
                "Last Name: " + lastName + " / " +
                "Address: " + streetAddress + " / " +
                "City: " + city + "}";
    }






}
