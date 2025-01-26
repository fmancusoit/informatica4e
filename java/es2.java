import java.util.Scanner;

public class es2 {

    static float calcolaSomma(float x, float y) {
        float risultato = 0;
        risultato = x + y;
        return risultato;
    }

    static float calcolaDifferenza(float x, float y) {
        float risultato = 0;
        risultato = x - y;
        return risultato;
    }

    static float calcolaMoltiplicazione(float x, float y) {
        float risultato = 0;
        risultato = x * y;
        return risultato;
    }

    static float calcolaDivisione(float x, float y) {
        float risultato = 0;
        risultato = x / y;
        return risultato;
    }
    
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        float x, y;
        int scelta;

        System.out.println("Calcolatrice");
        System.out.println("\n");
        System.out.print("Inserisci primo numero: \t");
        x = cin.nextFloat();
        System.out.print("\nInserisci secondo numero: \t");
        y = cin.nextFloat();

        System.out.print("\n\nScegli il calcolo: ");
        System.out.println("1 - Somma");
        System.out.println("2 - Differenza");
        System.out.println("3 - Moltiplicazione");
        System.out.println("4 - Divisione");

        System.out.print("\nLa tua selezione: \t");
        scelta = cin.nextInt();

        float risultato = 0;

        switch (scelta) {
            case 1:
                risultato = calcolaSomma(x, y);
                break;
            case 2:
                risultato = calcolaDifferenza(x, y);
                break;
            case 3:
                risultato = calcolaMoltiplicazione(x, y);
                break;
            case 4:
                if (y != 0) {
                    risultato = calcolaDivisione(x, y);
                }
                break;
        
            default:
                System.out.println("\nSeleziona un numero fra 1 e 4!");
                break;
        }

        if (scelta != 4 || (scelta == 4 && y != 0)) {
            System.out.println("\n\nRisultato: " + risultato);
        } else if (scelta == 4 && y == 0) {
            System.out.println("\n\nRisultato non valido!");
        }

        cin.close();
    }
}
