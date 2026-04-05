import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Makan: ");
        double makan = input.nextDouble();

        System.out.print("Transport: ");
        double transport = input.nextDouble();

        System.out.print("Belanja: ");
        double belanja = input.nextDouble();

        double total = makan + transport + belanja;

        double pMakan = makan / total * 100;
        double pTransport = transport / total * 100;
        double pBelanja = belanja / total * 100;

        System.out.println("\nPersentase:");
        System.out.println("Makan: " + pMakan + "%");
        System.out.println("Transport: " + pTransport + "%");
        System.out.println("Belanja: " + pBelanja + "%");
    }
}
