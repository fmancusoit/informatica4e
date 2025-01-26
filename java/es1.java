import java.util.Scanner;

public class es1 {
    
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in); // sempre uguale, globale

        String testo = cin.nextLine(); // prendo da input testo
        int n = cin.nextInt(); // prendo da input numero

        System.out.println(testo);
        System.out.println(n);

        cin.close();
    }
}
