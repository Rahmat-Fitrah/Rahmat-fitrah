import java.util.Scanner;
public class Pecahanuang {
    public static void main(String[] args) {
        int sisaUang, jumlahuang, Uang100000, Uang50000an, Uang20000an, Uang10000an, Uang5000an, Uang1000an, Uang500an, Uang200an, Uang100an;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah Uang:");
        jumlahuang = sc.nextInt();

        Uang100000 = jumlahuang / 100000;
        sisaUang = jumlahuang % 100000;
        System.out.println( Uang100000 + "rupiah 100000");
        
        Uang50000an = jumlahuang / 50000;
        sisaUang = jumlahuang % 50000;
        System.out.println( Uang50000an + "rupiah 50000");

        Uang20000an = jumlahuang / 20000;
        sisaUang = jumlahuang % 20000;
        System.out.println( Uang20000an + "rupiah 20000");

        Uang10000an = jumlahuang / 10000;
        sisaUang = jumlahuang % 10000;
        System.out.println( Uang10000an + "rupiah 10000");

        Uang5000an = jumlahuang / 5000;
        sisaUang = jumlahuang % 5000;
        System.out.println( Uang5000an + "rupiah 5000");

        
        Uang1000an = jumlahuang / 1000;
        sisaUang = jumlahuang % 1000;
        System.out.println( Uang1000an + "rupiah 1000");

        Uang500an = jumlahuang / 500;
        sisaUang = jumlahuang % 500;
        System.out.println( Uang500an + "rupiah 500");
        
        Uang200an = jumlahuang / 200;
        sisaUang = jumlahuang % 200;
        System.out.println( Uang200an + "rupiah 200");

        Uang100an = jumlahuang / 100;
        sisaUang = jumlahuang % 100;
        System.out.println( Uang100an + "rupiah 100");
       
        sc.close();
    }
    
}