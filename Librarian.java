import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

public class Librarian {
    private static final Logger logger = Logger.getLogger(Librarian.class.getName());

    public void viewBooks() {
        System.out.println("Fetching Book Details...");
        try (BufferedReader reader = new BufferedReader(new FileReader("Books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An Error Occurred", e);
        }
    }

    public void borrowedBooks() {
        System.out.println("Fetching Details...\n");
        try (BufferedReader reader = new BufferedReader(new FileReader("Books_Borrowed.txt"))) {
            String line;
            String[] index = {"Book Name: ", "Author Name: ", "Customer Name: ", "Customer Purchase ID: ", "Date Of Issue: "};
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(index[i] + line);
                i++;
                if (i == 5) {
                    i = 0;
                    System.out.println();
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An Error Occurred", e);
        }
    }

    public void addBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books to add: ");
        int numOfBooks = sc.nextInt();
        String[] books = new String[numOfBooks];
        for (int i = 0; i < numOfBooks; i++) {
            System.out.print("Enter Book Name: ");
            books[i] = sc.nextLine();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Books.txt", true))) {
            for (int i = 0; i <numOfBooks; i++) {
                writer.write(books[i]);
            }
            System.out.println("Books added in Library");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An Error Occurred", e);
        }
    }
}
