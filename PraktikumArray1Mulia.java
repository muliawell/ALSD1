import java.util.Scanner;

public class PraktikumArray1Mulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=============================");
        
        String[] matakuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        
        int[] sks = {2, 3, 3, 4, 2, 3, 3, 2};
        double[] nilaiAngka = new double[matakuliah.length];
        String[] nilaiHuruf = new String[matakuliah.length];

        double totalBobot = 0;
        double totalSKS = 0;

        for (int i = 0; i < matakuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matakuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            
            double bobot = 0.0;
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobot = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobot = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobot = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobot = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobot = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobot = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobot = 0.0;
            }

            totalBobot += bobot * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;

        System.out.println("=======================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================================");
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.println("Mata Kuliah: " + matakuliah[i]);
            System.out.println("Nilai Angka: " + nilaiAngka[i]);
            System.out.println("Nilai Huruf: " + nilaiHuruf[i]);
            System.out.println("---------------------------------------");
        }
        System.out.println("=======================================");
        System.out.println("IP : " + ipSemester);
        
        scanner.close();
    }
}
