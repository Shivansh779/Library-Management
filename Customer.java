import java.util.Scanner;
import java.security.SecureRandom;
import java.io.*;
import java.util.logging.*;
import java.time.LocalDate;

public class Customer {
    public static Scanner sc = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Customer.class.getName());
    private static final String NUMBERS = "1234567890";

    public String IDgen() {
        SecureRandom random = new SecureRandom();
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(NUMBERS.length());
            id.append(NUMBERS.charAt(index));
        }
        return id.toString();
    }

    public void view_books () {
        try (BufferedReader reader = new BufferedReader(new FileReader("Books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + " ");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An Error Occurred", e);
        }
    }

    public void borrow_book () {
        LocalDate currentDate = LocalDate.now();
        String[] details = new String[4];

        System.out.print("Enter Book Name: ");
        details[0] = sc.nextLine();
        System.out.print("Enter Author Name: ");
        details[1] = sc.nextLine();
        System.out.print("Enter your name: ");
        details[2] = sc.nextLine();
        details[3] = IDgen();
        System.out.println("Your ID: " + details[3]);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Books_Borrowed.txt", true))) {
            for (int i = 0; i < 4; i++) {
                writer.write(details[i] +"\n");
                if (i == 3) {
                    writer.write(String.valueOf(currentDate));
                    writer.newLine();
                }
            }
            writer.close();
            System.out.println("Details written in file.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An Error Occurred", e);
        }
    }
}

