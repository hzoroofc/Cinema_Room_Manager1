package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        int rowsCount = getRowsCount();
        int seatsInEachRowCount = getSeatsInEachRowCount();
        String[][] cinemaRoom = fillTheMatrixOfSeats(rowsCount, seatsInEachRowCount);
        printCinema(cinemaRoom, seatsInEachRowCount);
        int rowNumber = getRowNumber();
        int seatNumber = getSeatNumber();
        getPriceOfTicket(rowNumber, rowsCount, seatsInEachRowCount);
        bookedTheSeat(cinemaRoom, rowNumber, seatNumber);
        printCinema(cinemaRoom, seatsInEachRowCount);
        System.out.println(1);
    }

    public static int getRowsCount() {
        System.out.print("Enter the number of rows:" + '\n' + "> ");
        Scanner scanner = new Scanner(System.in);
        int rowsCount = scanner.nextInt();
        return rowsCount;

    }

    public static int getSeatsInEachRowCount() {
        System.out.print("Enter the number of seats in each row:" + '\n' + "> ");
        Scanner scanner = new Scanner(System.in);
        int seatsInEachRowCount = scanner.nextInt();
        System.out.println();
        return seatsInEachRowCount;
    }

    public static String[][] fillTheMatrixOfSeats(int rowsCount, int seatsInEachRowCount) {
        String[][] cinemaRoom = new String[rowsCount][seatsInEachRowCount + 1];
        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                cinemaRoom[i][j] = "S";
            }
        }
        return cinemaRoom;
    }

    public static void printCinema(String[][] cinemaRoom, int seatsInEachRowCount) {
        String result = "  ";
        for (int i = 1; i <= seatsInEachRowCount; i++) {
            result += i + " ";
        }
        System.out.println("Cinema:");
        System.out.println(result);

        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print(cinemaRoom[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getRowNumber() {
        System.out.print("Enter a row number:" + '\n' + "> ");
        Scanner scanner = new Scanner(System.in);
        int rowNumber = scanner.nextInt();
        return rowNumber;
    }

    public static int getSeatNumber() {
        System.out.print("Enter a seat number in that row:" + '\n' + "> ");
        Scanner scanner = new Scanner(System.in);
        int seatNumber = scanner.nextInt();
        System.out.println();
        return seatNumber;
    }

    public static void getPriceOfTicket(int rowNumber, int rowsCount, int seatsInEachRowCount) {
        if (rowsCount * seatsInEachRowCount <= 60) {
            System.out.println("Ticket price: " + "$10");
        } else {
            if (rowsCount % 2 == 0)
                if (rowNumber <= rowsCount / 2) {
                    System.out.println("Ticket price: " + "$10");
                } else {
                    System.out.println("Ticket price: " + "$8");
                }
            else {
                if (rowNumber <= (rowsCount - 1) / 2) {
                    System.out.println("Ticket price: " + "$10");
                } else {
                    System.out.println("Ticket price: " + "$8");
                }
            }
        }
        System.out.println();
    }

    public static String[][] bookedTheSeat(String[][] cinemaRoom, int rowNumber, int seatNumber) {
        cinemaRoom[rowNumber - 1][seatNumber] = "B";
        return cinemaRoom;
    }
}
