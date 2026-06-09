import enteties.User;

import java.util.*;

public class Main {
    static void main() {
        //---------------COLLECTIONS------------
        // Le collection sono dei tipi per organizzare dati e hanno sotto di loro 3 principali categorie

        // LIST
        // gli elementi nella list sono un elenco di cose, possiamo avere duplicati e possiamo aggiungere infiniti elementi

        // ArrayList: È l'implementazione più utilizzata. Basata su un array ridimensionabile, è estremamente veloce per l'accesso agli
        // elementi tramite indice (lettura). È la scelta di default nella maggior parte degli scenari

        // LinkedList: Struttura basata su nodi collegati. È molto efficiente per l'inserimento o la rimozione di elementi in qualsiasi posizione
        // della lista, specialmente all'inizio o alla fine, perché non deve spostare gli altri elementi. È più lenta per l'accesso diretto (lettura
        // tramite indice)


        // SET
        // Non ammettono duplicati a differenza delle LIST
        // QUEUE (code)
        // Rispetta una coda, come per esempio la coda di file di stampa, rispetta la gerarchia

        //----------MAP----------
        // Le map memorizzano i loro valori non singolarmente ma a coppie

        //Le interfacce (List, Set, Map, Queue) ci dicono cosa possiamo fare, ma per
        //creare un oggetto abbiamo bisogno delle classi concrete
        //Ogni classe implementa la stessa interfaccia in modo diverso,
        //ottimizzando prestazioni o comportamento

        // PERCHÉ ESISTONO DIVERSE IMPLEMENTAZIONI?
        // Ogni struttura dati ha costi e benefici. La scelta dipende ad esempio da:
        //      Velocità di lettura: Alcune classi sono veloci nel trovare un elemento, ma lente nell'aggiungerne di nuovi.
        //      Ordinamento: Alcune mantengono i dati così come li inseriamo, altre li riordinano automaticamente
        //      Gestione duplicati: Alcune scartano i doppioni, altre li conservano
        User aldo = new User("Aldo", "Baglio");
        User giovanni = new User("Giovanni", "Storti");
        User giacomo = new User("Giacomo", "Poretti");
        ArrayList<User> userList = new ArrayList<>();

        //------------------ADD----------------------
        System.out.println(userList.size());
        userList.add(aldo);
        userList.add(giovanni);
        userList.add(giacomo); // una senza indice
        userList.add(3, giovanni); // Posiziona il nuovo elemento all'indice 3;
        userList.addFirst(giacomo); // Aggiunge un elemento come primo elemento
        userList.addLast(aldo); // Aggiunge un elemento come ultimo elemento


        System.out.println(userList.size());
        System.out.println(userList);

        for (User user : userList) {
            System.out.println(user);
        }
        //----------------GET--------------------
        User fromList = userList.get(3);
        System.out.println(fromList);

        //-------------INDEX OF-----------------
        userList.indexOf(giacomo);
        // Ritorna il primo indice disponibile che corrisponde all'oggetto
        //che abbiamo richiesto e si ferma li anche se ci sono duplicati

        //--------------CONTAINS------------------
        //.contains torna un booleano e ci dice se un elemento è presente o meno nella lista
        // dietro le quinte usa il metodo .equals che tutti gli oggetti hanno,
        // ma sappiamo che se non vacciamo override del metodo verranno comparate le celle di memoria
        // con l'override invece verranno confrontate i valori (es. nome e cognome)
        if (userList.contains(aldo)) {
            System.out.println("Aldo, sei caduto?");
        } else {
            System.out.println("Aldo stai bene?");
        }

        //--------------------REMOVE------------------
        // Rimuove un elemento dall'ArrayList;
        userList.remove(1); // rimozione per indice
        userList.remove(giacomo); // rimozione per oggetto
        userList.remove(giovanni); // rimozione per oggetto
        System.out.println(userList);
        // --------------------- INIZIALIZZARE CON ELEMENTI--------
        // Inizializzazione della lista con 3 elementi (Passiamo una lista come parametro)
        ArrayList<User> usersList2 = new ArrayList<>(List.of(aldo, giovanni, giacomo));
        // Inizializzazione della lista con 3 elementi (passiamo un array convertito in lista come parametro)
        ArrayList<User> usersList3 = new ArrayList<>(Arrays.asList(aldo, giovanni, giacomo));

        //------------------ADD ALL---------------
        // Aggiunge un intera lista ad una lista esistente
        userList.addAll(usersList2);
        userList.addAll(usersList3);
        //-------------------REMOVE ALL------------
        // Mi permette di specificare una lista di elementi da eliminare
        //non svuota completamente la lista
        userList.removeAll(usersList3);

        //------------------SET----------------
//        va a sostituire l'elemento in quell'array con quello passato come attributo
        userList.add(new User("Ajeje", "Brazorf"));
        userList.set(0, giacomo);
        System.out.println(userList);

        //-------------------CLEAR & EMPTY-----------------
        System.out.println("La lista è vuota? " + userList.isEmpty());
        userList.clear();
        System.out.println("La lista è vuota? " + userList.isEmpty());

        //----------------LINKEDLIST---------------
        //ProTip
        //Se possibile è meglio programmare per interfacce
        // Perché?
        // Se domani si decide che LinkedList è più performante per il progetto, si potrà cambiare solo la parola dopo new, senza rompere il resto del
        // codice che si aspetta semplicemente una "Lista" generica
        // Sconsigliato-> ArrayList<User> listUser = new ArrayList<>();
        // è più consigliabile usare solo List perché così darà solo i metodi in comune
        // tra ArrayList e LinkedList
        // List<User> listUser = new ArrayList<>(); // ✅ Consigliato


        //------------------SET-----------------
        // I SET sono degli insiemi o collezioni di dati che non accettano duplicati

        // HashSet: È l'implementazione più performante e utilizzata. Memorizza gli elementi in una sorta di tabella garantendo tempi di
        // accesso rapidissimi. Non garantisce alcun ordine di iterazione: l'ordine in cui vengono inseriti i dati non sarà necessariamente lo
        // stesso in cui vengono letti

        HashSet<User> userSet = new HashSet<>();
        userSet.add(aldo);
        userSet.add(giovanni);
        userSet.add(giacomo);

        //LinkedHashSet: A differenza del semplice HashSet, questo set mantiene l'ordine di inserimento. È la scelta ideale se non si
        //vogliono duplicati e se si vuole preservare la sequenza temporale di inserimento

        //TreeSet: II suo vantaggio principale è che mantiene gli elementi ordinati automaticamenteE più lenta delle altre per l'inserimento,
        //ma utilissima per avere liste di elementi unici già pronti per la consultazione

        TreeSet<String> alphabet = new TreeSet<>();
        alphabet.add("d");
        alphabet.add("r");
        alphabet.add("f");
        alphabet.add("b");
        alphabet.add("a");
        alphabet.add("y");
        System.out.println(alphabet);

        //------------MAP------------
        // E una struttura a "mappatura", una sorta di dizionario o un archivio a schede
        // Memorizza Coppie composte da una Chiave (univoca) e un Valore associato (K, V)
        // Non eredita dall'interfaccia Collection perché i suoi metodi non avrebbero senso.
        // Una mappa ha bisogno di due parametri per inserire un dato invece
        // che uno solo come nelle varie Collection
        // Le chiavi di una map devono essere univoche.

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Pranzo", "Def di Pranzo");
        dictionary.put("Casa", "Def di Casa");
        dictionary.put("Albero", "Def di Albero");

        System.out.println(dictionary);

        HashMap<Integer, User> userMap = new HashMap<>();
        userMap.put(123948, aldo);
        userMap.put(543094, giovanni);
        userMap.put(843551, giacomo);
        System.out.println(userMap);


        System.out.println(dictionary.get("Albero"));
        //Se la chiave che viene richiesta non esiste il suo ritorno è null
//        System.out.println(dictionary.get("Alberoso"));

        dictionary.remove("Casa");
        System.out.println(dictionary);

        //------------ITERAZIONE DI UNA MAPS-----------
        // 1. Ottengo l'elenco delle chiavi
        // 2. Itero quell'elenco per accedere ai loro valori
        Set<String> setChiavi = dictionary.keySet();
        for (String chiave : setChiavi) {
            System.out.println("CHIAVE: " + chiave);
            System.out.println("VALORE: " + dictionary.get(chiave));
        }

        //-----------------VALUES-----------------
        Collection<String> values = dictionary.values();
        System.out.println(values);
    }


}
