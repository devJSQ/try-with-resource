import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          try (Scanner scanner = new Scanner (System.in)){
            System.out.print("Enter your name: ");
            String name = scanner.next();
            System.out.println("Hello " + name);

          }
    }
}
