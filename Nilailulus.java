import java.util.Scanner;
public class Nilailulus {
    public static void main(String[] args) {
        int Angka;
        String Nilai;

        System.out.println("Masukan Nilai");
        Scanner input = new Scanner(System.in);

        Angka = input.nextInt();
        if (Angka >=76) {
            Nilai = "SELAMAT ANDA LULUS";
        }else
            Nilai = "ANDA TIDAK LULUS";
        System.out.println(Nilai+ " " );
        input.close();
    }
}
