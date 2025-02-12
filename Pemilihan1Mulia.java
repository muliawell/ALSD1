import java.util.Scanner;

public class Pemilihan1Mulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
        
        System.out.println("============================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("==============================");

            String nilaihuruf;
            boolean statusLulus;
            
            if (nilaiAkhir >= 80) {
                nilaihuruf = "A";
                statusLulus = true;
            } else if (nilaiAkhir >= 73) {
                nilaihuruf = "B+";
                statusLulus = true;
            } else if (nilaiAkhir >= 65) {
                nilaihuruf = "B";
                statusLulus = true;
            } else if (nilaiAkhir >= 60) {
                nilaihuruf = "C+";
                statusLulus = true;
            } else if (nilaiAkhir >= 50) {
                nilaihuruf = "C";
                statusLulus = true;
            } else if (nilaiAkhir >= 39) {
                nilaihuruf = "D";
                statusLulus = false;
            } else {
                nilaihuruf = "E";
                statusLulus = false;

                System.out.println("==============================");
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaihuruf);
                if (statusLulus) {
                    System.out.println("SELAMAT ANDA LULUS");
                } else {
                    System.out.println("TIDAK LULUS");
                }
                System.out.println("==============================");
    }
}
}
}