package exercise.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExe {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listCreated = new ArrayList<>();
        int lenghtN;
        while (true) {
            System.out.println("Dammi un numero da 0 a 100");
            if (scanner.hasNextInt()) {
                lenghtN = Integer.parseInt(scanner.nextLine());
                if (lenghtN >= 0 && lenghtN <= 100) {
                    listCreated = Es2ListArrayList.createAList(lenghtN);
                    break;

                } else {
                    System.out.println("Il numero non va bene");
                }
            } else {
                System.out.println("Non è un valore valido");
                scanner.nextLine();
            }
        }
        System.out.println(listCreated);
        Es2ListArrayList.mirroredList(listCreated);
        Es2ListArrayList.evenOdd(listCreated, true);

        RubricaTelefonica.aggiungiRubrica("Gianni", "3382925104");
        RubricaTelefonica.aggiungiRubrica("Marco", "3382924065");
        RubricaTelefonica.aggiungiRubrica("Angelo", "3341215096");
        RubricaTelefonica.aggiungiRubrica("Marcello", "33951058963");

//        RubricaTelefonica.printNumber();

        RubricaTelefonica.cancellaRubrica("Marcello");
//        RubricaTelefonica.printNumber();

//        RubricaTelefonica.getName("3382925104");
//        RubricaTelefonica.getNumber("Angelo");
    }

}
