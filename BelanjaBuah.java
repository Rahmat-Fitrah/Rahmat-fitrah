import java.util.Scanner;
public class BelanjaBuah {
    public static void main(String[] args) {
        String NamaBuah[] = new String[100];      
        String[][] Buah={
            {"Apel","35000"},//0
            {"jeruk","50000"},//1
            {"mangga","25000"},//2
            {"duku","15000"},//3
            {"semangka","20000"}//4
        };    
        int Total[] = new int[100];
        int Jumlah[] = new int[100];
        int Subtotal[] = new int[100];
        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
            do{
                System.out.print("Masukan Nama Buah:");
                NamaBuah[i] = sc.nextLine();

                System.out.print("Masukan jumlah Buah:");
                Jumlah[i] = sc.nextInt();

                System.out.print("Pilih Buah[0-4]:");
                Buah[i][i] = sc.nextLine();

                System.out.print("Input Lagih?: (y/n) ");
                inputData = sc.nextLine();
                i++;
            } while(i<NamaBuah.length && inputData.equalsIgnoreCase("y"));
            sc.close(); 
            
            System.out.println("Masukan Jumlah Data: "+ i);

            System.out.println("");
            int x=1;
            for (int j = 0; j< NamaBuah.length; j++){
                if (NamaBuah[j]!=null) {
                    System.out.println("------------------------------------------------");
                    System.out.println("Namabuah ke: "+ (x++));
                    System.out.println("Nama Buah: "+NamaBuah[j]);
                    System.out.println("jumlah: "+Jumlah[j]);                  
                    System.out.println("Buah: "+Buah[j]);
                }
            }
                   

        System.out.println("\nDaftar Belanja");
        System.out.println("================================================================================================================");
        System.out.println("No \t\t Nama Buah \t\t Jumlah \t\t Harga  \t\t Subtotal");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        x=1;
        for (int k = 0; k < NamaBuah.length; k++){
            if (NamaBuah[k] != null) {  
                System.out.println((x++) + "\t\t" + NamaBuah[k] +"\t\t" +Jumlah[k] + "\t\t"+Buah +"\t\t"+Subtotal[k]);
            }
        }System.out.println("=================================================================================================================");
            double jumlah=0;

        double TotalBayar = jumlah * i;
        System.out.println("Total:"+Total);
        System.out.println("Discount:"+TotalBayar);
        System.out.println("Total Bayar:"+TotalBayar);
        
    }
}