package Task2;


public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];   //har byttet om så dobblet arrayet bliver instaniseret først. (1)
        for ( int i=0; i< rows; i++){           // Sammenligning (2)
             for (int j =0; j<seats; j++ ){
             this.seats[i][j]= "0";
             }
        }

        this.seats[0][0] = "X";

    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("0")) {     // sammenligner noget med nul, som ikke er blevet inistaliseret (2)
            seats[row][seat] = "X";
            return true;}
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {   // lavet x til  stort X (3)
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // skal ikke sættes til null (4)
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
