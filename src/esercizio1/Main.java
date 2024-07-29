package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creo il logger
        Logger logger = LoggerFactory.getLogger(Main.class);

        //creo l'array di 5 interi
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;  //inserimento di valori randomici da 1 a 10
        }

        System.out.println("Array con valori iniziali");
        printArray(array);

        //creo l'oggetto scanner e la variabile dove salvare l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        int inputValore = -1;

        while (inputValore != 0) {
            try {
                System.out.println("Scegli posizione dell'array dove inserire un valore(da 0 a 4)");
                int inputPosizione = Integer.parseInt(scanner.nextLine());

                if (inputPosizione < 0 || inputPosizione >= array.length) {
                    System.out.println("La posizione selezionata non è valida, riprova.");
                    continue;
                }
                System.out.println("Inserisci un valore da inserire, oppure premi 0 per terminare.");
                inputValore = Integer.parseInt(scanner.nextLine());

                //se il valore dell'input è 0 l'applicazione termina

                if (inputValore == 0) {
                    break;
                }

                //altrimenti inseriamo il valore nell'array
                array[inputPosizione] = inputValore;

                System.out.println("Array aggiornato: ");
                printArray(array);
            } catch (InputMismatchException e) {
                logger.error("input non valido", e);
            }
        }
        scanner.close();

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
