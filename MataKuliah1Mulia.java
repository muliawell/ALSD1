    import java.util.Scanner;

    public class MataKuliah1Mulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        System.out.println("\nDaftar Mata Kuliah:");
        System.out.println("Nama Mata Kuliah | SKS | Semester | Hari Kuliah");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(namaMataKuliah[i] + " | " + sks[i] + " | " + semester[i] + " | " + hariKuliah[i]);
        }

        scanner.close();
    }
}
