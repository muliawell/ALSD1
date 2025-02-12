import java.util.Scanner;

public class Fungsi1Mulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] bunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        System.out.println("Pilih menu:");
        System.out.println("1. Hitung pendapatan setiap cabang");
        System.out.println("2. Hitung jumlah stock setiap jenis bunga");
        System.out.println("3. Hitung stock bunga setelah pengurangan");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungPendapatan(bunga, harga);
                break;
            case 2:
                hitungStock(bunga);
                break;
            case 3:
                hitungStockSetelahPengurangan(bunga);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    public static void hitungPendapatan(int[][] bunga, int[] harga) {
        for (int i = 0; i < bunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < bunga[i].length; j++) {
                pendapatan += bunga[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void hitungStock(int[][] bunga) {
        int[] totalStock = new int[bunga[0].length];

        for (int i = 0; i < bunga.length; i++) {
            for (int j = 0; j < bunga[i].length; j++) {
                totalStock[j] += bunga[i][j];
            }
        }

        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("\nTotal stok setiap jenis bunga:");
        for (int i = 0; i < totalStock.length; i++) {
            System.out.println(namaBunga[i] + ": " + totalStock[i]);
        }
    }

    public static void hitungStockSetelahPengurangan(int[][] bunga) {
        int[] bungaMati = {-1, -2, 0, -5}; 

        for (int i = 0; i < bunga[0].length; i++) {
            for (int j = 0; j < bunga.length; j++) {
                bunga[j][i] += bungaMati[i];
            }
        }

        System.out.println("\nStock setelah pengurangan:");
        for (int i = 0; i < bunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < bunga[i].length; j++) {
                System.out.print(bunga[i][j] + " ");
            }
            System.out.println();
        }
    }
}
