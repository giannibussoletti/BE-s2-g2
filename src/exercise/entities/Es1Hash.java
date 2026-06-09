package exercise.entities;

import java.util.HashSet;
import java.util.Scanner;

public class Es1Hash {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> randomWord = new HashSet<>();
        HashSet<String> duplicateWord = new HashSet<>();

        System.out.println("Dimmi quante parole vuoi inserire");
        int nOfWords = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nOfWords; i++) {
            System.out.println("Dammi la " + (i + 1) + "°" + " parola");
            String word = scanner.nextLine();
            if (randomWord.contains((word))) {
                duplicateWord.add(word);
                randomWord.remove(word);
            } else {
                randomWord.add(word);
            }

        }

        System.out.println("Hai inserito " +
                duplicateWord.size() +
                " parole duplicate che sono:\n"
                + duplicateWord + "\n"
                + "Invece hai inserito "
                + randomWord.size()
                + " parole uniche che sono\n"
                + randomWord);
    }

}
