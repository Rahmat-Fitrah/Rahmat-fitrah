import java.util.Scanner;
public class kelereng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelereng: ");
        int jumlahKelereng = scanner.nextInt();
        System.out.print("Masukkan jumlah teman: ");
        int jumlahTeman = scanner.nextInt();
        if (jumlahTeman > 0) {
            int kelerengPerTeman = jumlahKelereng / jumlahTeman;
            int sisaKelereng = jumlahKelereng % jumlahTeman;
            System.out.println("Setiap teman mendapatkan: " + kelerengPerTeman + " kelereng");
            System.out.println("Sisa kelereng yang tidak terbagikan: " + sisaKelereng);
        } else {
            System.out.println("Jumlah teman tidak boleh 0.");
        }

        scanner.close();
    }
}