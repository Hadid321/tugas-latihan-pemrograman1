import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Realisasi: ");
        double realisasi = input.nextDouble();

        System.out.print("Kehadiran: ");
        double kehadiran = input.nextDouble();

        System.out.print("Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("UTS: ");
        double uts = input.nextDouble();

        System.out.print("UAS: ");
        double uas = input.nextDouble();

        double b_kehadiran = kehadiran / realisasi * 10;
        double b_tugas = tugas * 20 / 100;
        double b_uts = uts * 30 / 100;
        double b_uas = uas * 40 / 100;

        double total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("\nTotal Nilai: " + total);
    }
}
