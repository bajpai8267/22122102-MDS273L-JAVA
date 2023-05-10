import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect basic details of user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left over by nextInt()
        
        System.out.print("Enter your gender (m/f): ");
        char gender = scanner.nextLine().charAt(0);
        
        System.out.print("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // consume the newline character left over by nextLong()
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your state: ");
        String state = scanner.nextLine();
        
        // Display the collected details
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + email);
        
        // Check if user is from southern states of India
        switch (state.toLowerCase()) {
            case "karnataka":
            case "kerala":
            case "tamil nadu":
            case "andhra pradesh":
            case "telangana":
            case "pondicherry":
            case "lakshadweep":
            case "andaman and nicobar islands":
                System.out.println("The Student is from the southern states of India");
                break;
            default:
                break;
        }
    }
}
