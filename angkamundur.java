public class angkamundur {
    public static void angkamundur(int n) {
        if (n < 1) {
            return;
        }else{
            System.out.print(n +" ");
            angkamundur(n -1);
        }
        
    }
    public static void main(String[] args) {
        int angka = 5;
        angkamundur(angka);
    }
    }