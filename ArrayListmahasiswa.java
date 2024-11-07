import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListmahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();

        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();

        char lanjut = 'y';
        while (lanjut == 'y') {
            MataKuliah mataKuliah = new MataKuliah();
            System.out.print("Masukkan nama mata kuliah: ");
            mataKuliah.nama = scanner.next();
            System.out.print("Masukkan SKS: ");
            mataKuliah.sks = scanner.nextInt();
            System.out.print("Masukkan nilai: ");
            mataKuliah.nilai = scanner.nextDouble();
            daftarMataKuliah.add(mataKuliah);

            System.out.print("menambahkan mata kuliah lagi? (y/n): ");
            lanjut = scanner.next().charAt(0);
            scanner.close();
        }

        System.out.println("\nData nilai mahasiswa:");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Semester: " + semester);
        System.out.println("------------------------");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("Mata Kuliah: " + mk.nama);
            System.out.println("SKS: " + mk.sks);
            System.out.println("Nilai: " + mk.nilai);
            System.out.println("------------------------");
        }
    }

    static class MataKuliah {
        String nama;
        int sks;
        double nilai;
        }
}

