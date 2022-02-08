package UTSMatrix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MATRIX CALCULATOR");
        int row =0;int col = 0;
        for (int i = 0 ; i < 2 ; i++){
            if(i == 0){
                System.out.print("Input number of rows : " );
                row = input.nextInt();
            }
            else{
                System.out.print("Input number of columns : " );
                col = input.nextInt();System.out.println();
            }
        }
        System.out.println("Masukkan nilai Matriks 1");
        int [][] element1 = new int[row][col];
        for (int i = 0 ;i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                element1[i][j]=input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Masukkan nilai Matriks 2");
        int [][] element2 = new int[row][col];
        for (int i = 0 ;i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                element2[i][j]=input.nextInt();
            }
            System.out.println();
        }
        Matriks matriks1  = new Matriks(element1);
        Matriks matriks2 = new Matriks(element2);
        matriks1.display();System.out.println();
        matriks2.display();System.out.println();

        Matriks penjumlahanMatriks = new Matriks(row, col);
        penjumlahanMatriks = penjumlahanMatriks.penjumlahan2Matriks(matriks1, matriks2);
        Matriks penguranganMatriks = new Matriks(row, col);
        penguranganMatriks = penguranganMatriks.pengurangan2Matriks(matriks1, matriks2);
        System.out.println("Penjumlahan matriks 1 dan 2");penjumlahanMatriks.display();
        System.out.println("Pengurangan matriks 1 dan 2");penguranganMatriks.display();
    }
}
