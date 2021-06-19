package restaurant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//test comment - 2nd attempt.

public class Menu {
    private ArrayList ordered = new ArrayList();

    void show() {
        System.out.println("Menu:");
        System.out.println("1. Dania glowne\n2. Zupy\n3. Napoje\n0. Anuluj zamowienie");
    }

    void order() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        //x = scanner.nextInt();
        try {
            x = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Nieprawidlowy wybor. Sprobuj ponownie.");
        }
        if((x != 1 && x != 2 && x != 3 && x != 0)) {
            x = checkingNumbers(x);
        }
        int wybor = 0;
        String zwrot;
        if (x == 1) {
            String jeden = "1. Kotlet";
            String dwa = "2. Golabki";
            String trzy = "3. Pierogi z miesem";
            String zero = "0. Powrot do menu";
            System.out.println(jeden + "\n" + dwa + "\n" + trzy +"\n" + zero);

            //wybor = scanner.nextInt();
            try {
                wybor = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Nieprawidlowy wybor. Sprobuj ponownie.");
            }
            if((wybor != 1 && wybor != 2 && wybor != 3 && wybor != 0)) {
                wybor = checkingNumbers(wybor);
            }

            String chosen = chooseMainDish(wybor);
            ordered.add(chosen);

        }
        else if (x == 2) {
            String jeden = "1. Grochowka";
            String dwa = "2. Pomidorowa";
            String trzy = "3. Rosol";
            String zero = "0. Powrot do menu";
            System.out.println(jeden + "\n" + dwa + "\n" + trzy +"\n" + zero);

            //wybor = scanner.nextInt();
            try {
                wybor = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Nieprawidlowy wybor");
            }
            if((wybor != 1 && wybor != 2 && wybor != 3 && wybor != 0)) {
                wybor = checkingNumbers(wybor);
            }

            String chosen = chooseSoup(wybor);
            ordered.add(chosen);

        }

        else if (x == 3) {
            String jeden = "1. Woda";
            String dwa = "2. Cola";
            String trzy = "3. Sok";
            String zero = "0. Powrot do menu";
            System.out.println(jeden + "\n" + dwa + "\n" + trzy +"\n" + zero);

            //wybor = scanner.nextInt();
            try {
                wybor = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Nieprawidlowy wybor. Sprobuj ponownie.");
            }
            if((wybor != 1 && wybor != 2 && wybor != 3 && wybor != 0)) {
                wybor = checkingNumbers(wybor);
            }
            String chosen = chooseDrink(wybor);
            ordered.add(chosen);
        }

        else if (x == 0) {
            System.out.println("Nie wybrales niczego");
        }
        System.out.println("Czy chcesz kontynuowac zamowienie?(y lub n)");
        Scanner sc = new Scanner(System.in);
        String chosen = sc.nextLine();

        if(chosen.equals("y")  || chosen.equals("n"))
        {
            checkingYorN(chosen);
            while(!chosen.equals("y") && !chosen.equals("n"))
            {
                System.out.println("Wprowadz jeszcze raz, co chcesz zrobic");
                chosen = sc.nextLine();
                checkingYorN(chosen);
            }
        }
        else
        {
            throw new IOException("Invalid input");
        }
    }

    public String chooseMainDish(int id) throws Exception {
        String zwrot = "";

        if (id == 1) {
            zwrot = "1. Kotlet";
        } else if (id == 2) {
            zwrot = "2. Golabki";
        } else if (id == 3) {
            zwrot = "3. Pierogi z miesem";
        }else if (id == 0)
        {
            show();
            order();
        }
        return zwrot;
    }

    public String chooseSoup(int id) throws Exception {
        String zwrot = "";

        if (id == 1) {
            zwrot = "1. Grochowka";
        } else if (id == 2) {
            zwrot = "2. Pomidorowa";
        } else if (id == 3) {
            zwrot = "3. Rosol";
        }else if (id == 0)
        {
            show();
            order();
        }
        return zwrot;
    }

    public String chooseDrink(int id) throws Exception {
        String zwrot = "";

        if (id == 1) {
            zwrot = "1. Woda";
        } else if (id == 2) {
            zwrot = "2. Cola";
        } else if (id == 3) {
            zwrot = "3. Sok";
        }else if (id == 0)
        {
            show();
            order();
        }
        return zwrot;
    }

    void checkingYorN(String choice)
    {

        switch (choice) {

            case "y": {
                System.out.println("Do tej pory zamowiles: " + ordered);
                System.out.println("Czekam na dalsze zamówienie");
            }
            break;
            case "n": {
                if (ordered.isEmpty()) {
                    System.out.println("Nie zamowiles niczego.");
                    ordered.clear();

                }
                else {
                    System.out.println("Podsumowanie Twojego zamowienia: " + ordered);
                    ordered.clear();
                }

                System.out.println("Zapraszamy ponownie!");
                System.exit(0);
            }
            break;
        }
    }

    int checkingNumbers(int number) {
        int newNumber = 5;
        while(number != 1 && number != 2 && number != 3 && number != 0)
        {
            System.out.println("Prosze jeszcze raz wprowadzic co chcesz zamowic");
            Scanner again = new Scanner(System.in);
            newNumber = again.nextInt();
            if((newNumber == 1) || (newNumber == 2) || (newNumber == 3) || (newNumber == 0))
            {
                break;
            }
        }
        return newNumber;
    }
}
