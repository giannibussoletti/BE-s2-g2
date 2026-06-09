package exercise.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RubricaTelefonica {
    private static HashMap<String, String> rubrica = new HashMap<>();
    private static String name;
    private static String telNumber;

//    public RubricaTelefonica(String name, String telNumber) {
//        RubricaTelefonica.name = name;
//        RubricaTelefonica.telNumber = telNumber;
//    }

    public static void aggiungiRubrica(String name, String telNumber) {
        rubrica.put(name, telNumber);
    }

    public static void cancellaRubrica(String name) {
        rubrica.remove(name);
    }

    public static void getName(String value) {

        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(value))
                System.out.println("NOME: " + entry.getKey() + "\nNUMERO: " + entry.getValue());
        }

    }

    public static void getNumber(String name) {
        System.out.println("NOME: " + name + "\nNUMERO: " + rubrica.get(name));
    }

    public static void printNumber() {
        Set<String> setChiavi = rubrica.keySet();
        for (String chiave : setChiavi) {
            System.out.println("NOME: " + chiave);
            System.out.println("NUMERO: " + rubrica.get(chiave));
        }
    }
}
