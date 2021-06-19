package restaurant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();

        while(true) {
            menu.show();
            menu.order();
        }
    }

    public static void orderSomething (Menu orderSth) throws Exception {
        Menu menu = new Menu();

        while (true) {
            menu.show();
            menu.order();

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            //int decision;
            if (input == 0) {
                System.out.println("Nie zamowiles niczego, zapraszamy ponownie.");
                break;
            }
            try
            {
                int decision = Integer.parseInt(String.valueOf(input));
            }
            catch(NumberFormatException decision)
            {
                System.out.println("Bledne dane.");
            }
            catch(InputMismatchException decision)
            {
                System.out.println("Bledne dane.");
            }
        }
    }
}
