package capitulo1;

import java.util.Scanner;

public class matriz_2D {
	
	
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar numero de filas y numero de columnas");
		
		
		int f =scanner.nextInt();
		int c =scanner.nextInt();
		
		int mat [][]= new int [f][c];
		
		int nro;
		
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				nro=(int)(Math.random()*1000);
				mat[i][j]=nro;
			}
		}
		for(int i = 0; i<f; i++) {
			for(int j =0; j < c ; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			
			System.out.println();
		}
			
	}	
}
