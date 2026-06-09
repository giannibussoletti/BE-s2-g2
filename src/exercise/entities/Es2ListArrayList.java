package exercise.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Es2ListArrayList {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> randomNumberList = new ArrayList<>();

        int lenghtN;
        while (true) {
            System.out.println("Dammi un numero da 0 a 100");
            if (scanner.hasNextInt()) {
                lenghtN = Integer.parseInt(scanner.nextLine());
                if (lenghtN >= 0 && lenghtN <= 100) {
                    for (int i = 0; i < lenghtN; i++) {
                        int randomNumber = (int) (Math.floor(Math.random() * 101));
                        randomNumberList.add(randomNumber);
                    }
                    break;
                } else {
                    System.out.println("Il numero non va bene");
                }
            } else {
                System.out.println("Non è un valore valido");
                scanner.nextLine();
            }
        }
        Collections.sort(randomNumberList);
        System.out.println(randomNumberList);
    }
}
