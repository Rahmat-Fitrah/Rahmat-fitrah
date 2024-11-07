import java.util.Scanner;
public class nilaisksmahasiswa {
    public static void main(String[] args) {
        String KODE[] = new String[100];
        String MataKuliah[] = new String[100];
        int SKS[] = new int[100];
        int Nilai[] = new int[100];

        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;

        do {
            System.out.print("Nasukan Kode: ");
            KODE[i] = sc.nextLine();

            System.out.print("Masukan matkul: ");
            MataKuliah[i] = sc.nextLine();

            System.out.print("masukan sks: ");
            SKS[i] = sc.nextInt();

            System.out.print("masukan Nilai: ");
            Nilai[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("input lagih?:(y/n)");
            inputData = sc.nextLine();
            i++;
            
        } while(i<MataKuliah.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukan Jumlah Data: "+ i);

        System.err.println("");
        int x=1;
        for (int j = 0; j < MataKuliah.length; j++){
            if(MataKuliah[j]!=null){
                System.err.println("--------------------------------------------------------------------------");
                System.err.println("KODE ke: "+ (x++));
                System.err.println("Mata Kuliah: "+MataKuliah[j]);
                System.err.println("SKS: "+SKS[j]);
                System.err.println("Nilai: "+Nilai[j]);
            }
        }

        System.out.println("\nDaftar Mahsiswa");
        System.out.println("==========================================================================================================================");
        System.out.println("No \t\t kode \t\t MataKuliah \t\t SKS \t\t HurufMutu \t\t Bobot \t\t Nilai");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        x=1;
        for (int k = 0; k < MataKuliah.length; k++){
            if (MataKuliah[k] != null) {
                String HurufMutu = (Nilai[k] >=85.00) ? "A" :"B";
                String Bobot = (Nilai[k] >=85.00) ? "4.00" :"3.00";
                System.out.println((x++) + "\t\t" + KODE[k] +"\t\t" +MataKuliah[k] + "\t\t\t" +SKS[k]+ "\t\t\t" +HurufMutu + "\t\t " +Bobot +"\t\t" +Nilai[k] );
            }
        }System.out.println("===========================================================================================================================");
        double Jumlahsks=0;
        for (double num : SKS){
            Jumlahsks +=num;
        }
        System.out.println("jumalah SKS:"+Jumlahsks);
        double rata2 = Jumlahsks / i;
        System.out.println("IP.SEMESTER:"+rata2);
    }
}
