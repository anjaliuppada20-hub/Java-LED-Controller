import java.util.Scanner;

public class LedController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean ledState = false;

        System.out.println("================================");
        System.out.println("      JAVA LED CONTROLLER");
        System.out.println("================================");

        while (true) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Turn LED ON");
            System.out.println("2. Turn LED OFF");
            System.out.println("3. Show LED Status");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    ledState = true;
                    System.out.println("LED is ON");
                    break;

                case 2:
                    ledState = false;
                    System.out.println("LED is OFF");
                    break;

                case 3:
                    if (ledState) {
                        System.out.println("LED Status: ON");
                    } else {
                        System.out.println("LED Status: OFF");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println(
                        "Invalid choice. Try again."
                    );
            }
        }
    }
}
