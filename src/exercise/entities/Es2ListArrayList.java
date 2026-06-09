package exercise.entities;

import java.util.ArrayList;
import java.util.List;

public class Es2ListArrayList {

    public static List<Integer> createAList(Integer number) {
        List<Integer> randomNumberList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int randomNumber = (int) (Math.floor(Math.random() * 101));
            randomNumberList.add(randomNumber);
        }
        return randomNumberList;

    }

    public static void mirroredList(List<Integer> lista) {
        List<Integer> mirroredlist = new ArrayList<>();
        mirroredlist = lista.reversed();
        lista.addAll(mirroredlist);
        System.out.println(lista);
    }

    public static void evenOdd(List<Integer> lista, boolean booleano) {
        if (booleano) {
            for (int i = 0; i < lista.size(); i++) {
                if ((i + 1) % 2 == 0) System.out.println(lista.get(i));
            }
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if ((i + 1) % 2 != 0) System.out.println(lista.get(i));
            }

        }


    }
}
