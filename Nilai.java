import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        int  Angka;
        String Nilai;

        System.out.println("masukan Nilai Abjad:");
        Scanner input = new Scanner(System.in);

        Angka = input.nextInt();

        if (Angka >= 90) {
            Nilai = "A" ;
        }
        else if (Angka >= 80) {
            Nilai = "B" ;
        }
        else if (Angka >= 70) {
            Nilai = "C" ;
        }
        else if (Angka >= 60) {
            Nilai = "D" ;
        }else {
            Nilai = "E";
        }
        System.out.println(Angka + "Masukan Nilai" + Nilai );
        input.close();
    }
}
