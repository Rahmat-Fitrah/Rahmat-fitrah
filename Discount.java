import java.util.Scanner;

public class Discount {

    public static void main (String[] args) throws Exception{
        Double totalBayar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Total Belanja");
        totalBayar = sc.nextDouble();

        if (totalBayar > 700000) {
            totalBayar -= 30000;
        }
        System.out.println("Total yang harus dibayar: "+totalBayar);
        sc.close();
    }
    
}
