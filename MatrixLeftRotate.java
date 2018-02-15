package program1402;

import java.util.Scanner;

public class MatrixLeftRotate {

	public static void main(String[] args) {
		performDataFetching();
	}

	public static void performDataFetching() {
		try {
			int row, column, i, j;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter matrix row size");
			row = scanner.nextInt();
			System.out.println("Please enter matrix column size");
			column = scanner.nextInt();
			int matrixdata[][] = new int[row][column];
			//System.out.println("Please enter matrix");
			for (i = 0; i < row; i++) {
				System.out.println("enter " + (i + 1) + " row value");
				for (j = 0; j < column; j++) {

					matrixdata[i][j] = scanner.nextInt();
				}
			}
			for (i = 0; i < row; i++) {

				for (j = 0; j < column; j++) {
					System.out.print(matrixdata[i][j] + " ");
				}
				System.out.println();
			}
			int temp1 = 0, temp2 = 0, x;
			System.out.println("Please enter number of left rotated");
			int k = scanner.nextInt();

			for (x = 0; x < k; x++) {
				for (i = 0; i < row; i++) {
					for (j = 0; j < column; j++) {
						if (j > 0 && j <= column - 1) {
							temp2 = matrixdata[i][j];
							matrixdata[i][j] = temp1;
							temp1 = temp2;
						}
						if (j == 0) {
							temp1 = matrixdata[i][j];
							matrixdata[i][j] = matrixdata[i][column - 1];

						}

					}
				}
			}

			for (i = 0; i < row; i++) {

				for (j = 0; j < column; j++) {
					System.out.print(matrixdata[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.fillInStackTrace();
			performDataFetching();
		}
	}
}
