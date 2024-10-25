import java.util.Scanner;

public class BelanjaBuah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] Buah = {"Apel", "jeruk", "Mangga", "Duku", "Semangka"};
        int[] Harga = {35000, 50000, 25000, 15000, 20000};
        int[] Totalharga = new int[Buah.length];

        int total = 0;

        while (true) {
            System.out.print("Pilih Buah 0-4: ");
            int BelanjaBuah = scanner.nextInt();

            if (BelanjaBuah < 0 || BelanjaBuah >= Buah.length) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.print("Masukkan jumlah Buah: ");
            int hasil = scanner.nextInt();
            Totalharga[BelanjaBuah] += hasil;

            total += Harga[BelanjaBuah] * hasil;

            System.out.print("Input lagi? (y/n): ");
            String input = scanner.next();

            if (!input.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println("Daftar Belanja:");
        System.out.println("======================================================================");
        System.out.println("No.\t\tNama Buah \tJumlah \t\tHarga \t\tSubtotal");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < Buah.length; i++) {
            if (Totalharga[i] > 0) {
                System.out.printf("%d.\t\t%s\t\t%d\t\t%d\t\t%d\n", i + 0, Buah[i], Totalharga[i], Harga[i], Harga[i] * Totalharga[i]);
            }
        }System.out.println("==================================================================");

        System.out.println("Total:\t\t" + total);
        int discount = (int) (total * 0.15);
        System.out.println("Discount (15%):\t" + discount);
        System.out.println("Total bayar:\t" + (total - discount));

        scanner.close();
    }
}