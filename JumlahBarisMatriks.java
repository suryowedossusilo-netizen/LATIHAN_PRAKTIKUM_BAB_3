import java.util.Scanner;

public class JumlahBarisMatriks {
    public static int jumlahBaris(int[][] matriks, int baris) {
        int jumlah = 0;
        for (int j = 0; j < matriks[0].length; j++) {
            jumlah += matriks[baris][j];
        }
        return jumlah;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah baris: ");
            int m = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int n = input.nextInt();

            int[][] matriks = new int[m][n];
            System.out.println("\nMasukkan elemen matriks:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Matriks[" + i + "][" + j + "] = ");
                    matriks[i][j] = input.nextInt();
                }
            }
            System.out.println("\nMatriks:");
            for (int i = 0; i < m; i++) {
                System.out.print("{ ");
                for (int j = 0; j < n; j++) {
                    System.out.print(matriks[i][j]);
                    if (j < n - 1) System.out.print(", ");
                }
                System.out.println(" }");
            }
            System.out.print("\nMasukkan baris yang ingin dijumlahkan: ");
            int baris = input.nextInt();
            int hasil = jumlahBaris(matriks, baris);
            System.out.println("\nJumlah elemen pada baris ke-" + baris + " = " + hasil);
        }
    }
}
