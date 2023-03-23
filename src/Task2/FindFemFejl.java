package Task2;
//2.1 Hent klassen Cinema.java og klassen FindFemFejl.java. Kig koden igennem og dan dig et overblik over hvad den gør.
public class FindFemFejl {
    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows()-1; // Nu er index inden for arrayets størrelse (Fejl 5)
        int numberOfSeats = biogrande.getSeats()-1;
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
    }

}
