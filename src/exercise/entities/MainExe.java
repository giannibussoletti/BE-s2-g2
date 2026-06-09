package exercise.entities;

public class MainExe {
    static void main() {

        RubricaTelefonica.aggiungiRubrica("Gianni", "3382925104");
        RubricaTelefonica.aggiungiRubrica("Marco", "3382924065");
        RubricaTelefonica.aggiungiRubrica("Angelo", "3341215096");
        RubricaTelefonica.aggiungiRubrica("Marcello", "33951058963");

//        RubricaTelefonica.printNumber();

        RubricaTelefonica.cancellaRubrica("Marcello");
//        RubricaTelefonica.printNumber();

        RubricaTelefonica.getName("3382925104");
        RubricaTelefonica.getNumber("Angelo");
    }
}
