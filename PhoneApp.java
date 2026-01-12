import java.util.Scanner;

public class PhoneApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Contact[] contacts = new Contact[100]; // You can adjust the size as needed
        int contactCount = 0;

        while (true) 
        {
            System.out.println("Phone App Menu:");
            System.out.println("1. Add a Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) 
            {
                case 1:
                    if (contactCount < contacts.length) 
                    {
                        System.out.print("Enter contact name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter contact phone number: ");
                        String phoneNumber = scanner.nextLine();

                        Contact contact = new Contact(name, phoneNumber);
                        contacts[contactCount++] = contact;
                        System.out.println("Contact added.");    
                    } 
                    else 
                    {
                        System.out.println("Contact list is full.");
                    }
                    break;

                case 2:
                    System.out.println("Contacts:");

                    for (int i = 0; i < contactCount; i++) 
                    {
                        System.out.println((i + 1) + ". " + contacts[i]);
                    }
                    break;

                case 3:
                    System.out.println("Exiting the Phone App.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}