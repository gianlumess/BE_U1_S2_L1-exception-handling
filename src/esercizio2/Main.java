package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //CON VARIABILI INT
       /* try {

            System.out.println("CALCOLIAMO I KM/LITRO PERCORSI: ");
            System.out.println("Inserisci i km percorsi");
            int km = (int) Double.parseDouble(scanner.nextLine());
            System.out.println("adesso inserisci i litri di carburante consumati");
            int carburante = (int) Double.parseDouble(scanner.nextLine());


            System.out.println("L'auto percorre " + km / carburante + " km al litro");


        } catch (ArithmeticException e) {
            System.out.println("I litri inseriti non possono essere 0!!!!");

        } finally {
            scanner.close();
        }*/

        try {


            System.out.println("CALCOLIAMO I KM/LITRO PERCORSI: ");
            System.out.println("Inserisci i km percorsi");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("adesso inserisci i litri di carburante consumati");
            double carburante = Double.parseDouble(scanner.nextLine());

            double kmLitri = km / carburante;

            //imposto un controllo per vedere se la divisione da valore infinito
            if (Double.isInfinite(kmLitri)) {
                throw new ArithmeticException();
            }
            System.out.println("L'auto percorre " + kmLitri + " km al litro");
        } catch (ArithmeticException e) {
            log.error("I litri inseriti non possono essere 0!!!!", e);
        } finally {
            scanner.close();
        }
    }
}
