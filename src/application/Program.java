package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, m, x, i, j;
		
		System.out.print("Inser the number of lines: ");
		n = input.nextInt();
		System.out.print("Inser the number of columns: ");
		m = input.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + i  + ", " + j + "]: ");
				matrix[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\nmatrix");
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nInsert a existent element of matrix: ");
		x = input.nextInt();
		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					System.out.println("/nPosition: [" + i + ", " + j + "]" ) ;
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Down: " + matrix[i][j+1]);
					}
				}
			}
		}
		
		input.close();
	}
}
