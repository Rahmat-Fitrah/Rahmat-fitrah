import java.util.Scanner;
public class uangkembali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah Telur (kg): ");  
        int jumlahTelur  = scanner.nextInt();
        System.out.println("Masukan total Bayar: ");
        int TotalBayar = scanner.nextInt();
        System.out.println("Masukan Uang Yang Diberikan: ");
        int UangYangDiberikan = scanner.nextInt();
    if ( UangYangDiberikan > 0) {
        int Uangkembali = TotalBayar-UangYangDiberikan;
        System.out.println("Sisa Uang Yang di Kembalikan:"+ Uangkembali);
    } else {
        System.out.println("Jumlah Uang Yang Tidak Di Kembalikan 0.");
    }
    scanner.close();
    }
}