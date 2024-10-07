import java.util.Scanner;
public class Discount {

    public static void main (String[] args) throws Exception{
        Double totalBelanja, totalBayar, discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Total Belanja");
        totalBelanja = sc.nextDouble();

        if (totalBelanja > 50000) {
            discount =  5.0/100*totalBelanja;
        }else if (totalBelanja > 100000) {
            discount =  10/100*totalBelanja;
        }else if (totalBelanja > 200000) {
            discount =  15/100*totalBelanja;
        }else
            discount = 0.0;
        
        totalBayar = totalBelanja-discount;
        System.out.println("Total Belanja: "+totalBelanja);
        System.out.println("Discount: "+discount);
        System.out.println("Total dibayar: "+totalBayar);
        sc.close();
    }
    
}