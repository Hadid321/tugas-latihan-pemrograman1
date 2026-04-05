public class latihan3 {
    public static void main(String[] args) {

        double makan = 35000;
        double transport = 20000;
        double belanja = 45000;

        double total = makan + transport + belanja;
        double diskon = total * 10 / 100;
        double bayar = total - diskon;

        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total setelah diskon: " + bayar);
    }
}
