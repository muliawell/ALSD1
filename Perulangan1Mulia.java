import java.util.Scanner;
public class Perulangan1Mulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIM: ");
        String nim = scanner.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if ( n < 10){
        n += 10;
    }
    
    System.out.print("Output: ");
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 1 || i == 6 || i == 10) {
            System.out.print("* ");
        } else {
            System.out.print(i + " ");
        }
    }
    System.out.println();
    }
}