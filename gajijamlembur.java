import java.util.Scanner;
public class gajijamlembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Gaji Bulanan : ");  
        int GajiBulannan  = scanner.nextInt();
        System.out.print("Masukan Jam Lembur : ");  
        int JamLembur  = scanner.nextInt();
        System.out.print("Masukan Gaji Perjam : ");  
        int GajiPerjam  = scanner.nextInt();
        if (GajiPerjam > 0) {
            int GajiPerkerja = GajiPerjam * JamLembur + GajiBulannan  ;
            System.out.println( GajiPerkerja  );
        }else {
            System.out.println(" ");
        }

        scanner.close();
    }
}
