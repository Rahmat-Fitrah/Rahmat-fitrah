import java.util.Scanner;
public class DataMahasiswa {
    public static void main(String[] args) {
        String mahasiswa[] = new String[100];
        int nilai[] = new int[100];

        Scanner sc = new Scanner(System.in);
        String inputData = "y";
        int i=0;
        do {
            System.out.print("Masukan Nama: ");
            mahasiswa[i] = sc.nextLine();

            System.out.print("masukan Nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("input lagih?:(y/n)");
            inputData = sc.nextLine();
            i++;
        } while(i<mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukan Jumlah Data: "+ i);

        System.err.println("");
        int x=1;
        for (int j = 0; j < mahasiswa.length; j++){
            if(mahasiswa[j]!=null){
                System.err.println("----------------------------------------------");
                System.err.println("Mahsiswa ke: "+ (x++));
                System.err.println("Nama Mahasiwa: "+mahasiswa[j]);
                System.err.println("Nilai: "+nilai[j]);
            }
        }

        System.out.println("\nDaftar Mahsiswa");
        System.out.println("=================================================");
        System.out.println("No \t\t Nama \t\t Nilai \t\t Keterangan");
        System.out.println("-------------------------------------------------------");
        x=1;
        for (int k = 0; k < mahasiswa.length; k++){
            if (mahasiswa[k] != null) {
                String keterangan = (nilai[k] >=75) ? "Lulus" : "Tidak Lulus";
                System.out.println((x++) + "\t\t" + mahasiswa[k] +"\t\t" +nilai[k] + "\t\t" +keterangan);
            }
        }System.out.println("=======================================================");
        double Jumlah=0;
        for (double num : nilai){
            Jumlah +=num;
        }
        System.out.println("jumalah nilai:"+Jumlah);
        double rata2 = Jumlah / i;
        System.out.println("Nilai rata-rata:"+rata2);
    }
}
