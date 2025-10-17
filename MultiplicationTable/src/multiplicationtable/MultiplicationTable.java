
package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author Vargas Pérez César Alexander
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String again;

        do {
            int number;
            
            while (true) {
                System.out.print("Enter a number from 1 to 12 to see its multiplication table: ");
                if (read.hasNextInt()) {
                    number = read.nextInt();
                    if (number >= 1 && number <= 12) {
                        break; // número válido
                    } else {
                        System.out.println("Please enter a valid number in range of 1 and 12.");
                    }
                } else {
                    System.out.println("Please enter a valid integer.");
                    read.next();
                }
            }

            System.out.println("===================================");
            System.out.println("Multiplication table of number: " + number);

            for (int i = 1; i <= 12; i++) {
                int result = number * i;
                System.out.printf("|| %2d x %2d = %3d ||%n", number, i, result);
            }
            System.out.println("===================================");

          
            System.out.print("Do you want to see another multiplication table? (y/n): ");
            read.nextLine();
            again = read.nextLine().trim().toLowerCase();
            
        } while (again.equals("y"));
        read.close();
    }
}
