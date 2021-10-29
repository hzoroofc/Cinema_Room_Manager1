package cinema;
import java.util.Scanner;
import java.lang.System;

public class Cinema {
    public static void main(String[] args) {
        final int MAX_ROWS = 9;
        int rows;
        int seatsPerRow;
        int anzahlSeatsGesamt;
        int gesEinnahmen;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number of rows:");
            System.out.print(">");
            rows = scanner.nextInt();
            if (rows > MAX_ROWS) {
                System.out.println("Maxrows <= " + MAX_ROWS);
            }
        } while (rows > MAX_ROWS);

        System.out.println("Enter the number of seats in each row:");
        System.out.print(">");
        seatsPerRow = scanner.nextInt();

        anzahlSeatsGesamt = rows * seatsPerRow;
        //System.out.println(anzahlSeatsGesamt);
        if (anzahlSeatsGesamt <= 60) {
            gesEinnahmen = anzahlSeatsGesamt * 10;
        } else {
            if (rows%2==0){
                gesEinnahmen = (anzahlSeatsGesamt/2) * 8 + (anzahlSeatsGesamt/2) * 10;
            } else {
                gesEinnahmen = (((rows-1)/2) * seatsPerRow * 10) + (((rows+1)/2) * seatsPerRow * 8);
            }
        }
        System.out.println("Total income:");
        System.out.println("$" + gesEinnahmen);
    }
}