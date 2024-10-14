import java.util.Scanner;
public class hargabuah {
    public static void main(String[] args) {
        int sisabuah, jumlahbuah, satubuah3000, duabuah5000, limabuah10000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah uang:");
        jumlahbuah = sc.nextInt();

        satubuah3000 = jumlahbuah / 3000;
        sisabuah = jumlahbuah % 3000;
        System.out.println( satubuah3000 + "3000");

        duabuah5000 = jumlahbuah / 5000;
        sisabuah = jumlahbuah % 5000;
        System.out.println( duabuah5000 + "5000");

        limabuah10000 = jumlahbuah / 10000;
        sisabuah = jumlahbuah % 10000;
        System.out.println( limabuah10000 + "10000");

        sc.close();
        System.out.println(sisabuah+ " ");
    }
}
