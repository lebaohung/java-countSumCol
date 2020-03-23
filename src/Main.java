import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("COUNT SUM OF CHOSEN COLUMNS");
        System.out.print("Input row:");
        int row = scn.nextInt();
        System.out.print("Input col: ");
        int col = scn.nextInt();
        double[][] a = new double[row][col];
        System.out.println("Input value of " + row + " rows and " + col + " columns: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        System.out.print("Enter the row you want to know sum of its value (col 0 to col " + (col -1) + "): ");
        int chosenCol = scn.nextInt();
        while (chosenCol < 0 || chosenCol > (col-1)) {
            System.out.print("Invalid! Enter again: ");
            chosenCol = scn.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += a[i][chosenCol];
        }
        System.out.println("The sum of col  " + chosenCol + " is " + sum);
    }
}
