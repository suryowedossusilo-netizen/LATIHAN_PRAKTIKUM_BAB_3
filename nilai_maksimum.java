import java.util.Scanner;

public class nilai_maksimum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah baris: ");
            int baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = input.nextInt();
            int[][] matriks = new int[baris][kolom];
            System.out.println("\nMasukkan elemen matriks:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    matriks[i][j] = input.nextInt();
                }
            }   
            System.out.println("\nMatriks:");
            for (int i = 0; i < baris; i++) {
                System.out.print("{ ");
                for (int j = 0; j < kolom; j++) {
                    System.out.print(matriks[i][j]);
                    if (j < kolom - 1) System.out.print(", ");
                }
                System.out.println(" },");
            }   
            int maksimum = matriks[0][0];
            int posisiBaris = 0, posisiKolom = 0;
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    if (matriks[i][j] > maksimum) {
                        maksimum = matriks[i][j];
                        posisiBaris = i;
                        posisiKolom = j;
                    }
                }
            }   
            System.out.println("\nNilai maksimum: " + maksimum);
            System.out.println("Lokasi: baris " + posisiBaris + ", kolom " + posisiKolom);
        }
    }
}
