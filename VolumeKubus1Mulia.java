    import java.util.Scanner;

    public class VolumeKubus1Mulia {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        tampilkanMenu();
        int pilihan = scanner.nextInt();
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
    }

    public static void tampilkanMenu() {
        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Masukkan pilihan (1/2/3): ");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}