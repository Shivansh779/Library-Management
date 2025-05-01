import java.util.Scanner;

public class LibraryManagement {
    public static final Customer customer = new Customer();
    public static final Scanner sc = new Scanner(System.in);
    public static final Librarian librarian = new Librarian();
    public static void Student() {
        System.out.println("Welcome, Enter your desired action from the list below");
        System.out.print("1. View Books in Library \n2. Borrow Books \nEnter: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                customer.view_books();
                break;
            case 2:
                customer.borrow_book();
                break;
            case 3:
                System.out.println("Have a nice day!");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void Librarian() {
        System.out.println("Welcome, Enter your desired action from the list below");
        System.out.print("1. View Books in Library \n2. Borrow Books \n3. Add Books to Library\n4. Exit \nEnter: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                librarian.viewBooks();
                break;
            case 2:
                librarian.borrowedBooks();
                break;
            case 3:
                librarian.addBooks();
                break;
            case 4:
                System.out.println("Have a nice day!");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To The Library!");
        System.out.print("Please identify yourself as a: \n1. Customer \n2. Librarian \nEnter: ");
        int userChoice = sc.nextInt();
        while (true) {
            if (userChoice == 1) {
                Student();
            } else if (userChoice == 2) {
                Librarian();
            } else {
                System.out.println("Invalid Option!");
            }
        }
    }
}