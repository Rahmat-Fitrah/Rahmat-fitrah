public class Lopingkotakso {
    public static void main(String[] args) {

        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) { 
                if (b <3-a) {
                    System.out.print("S");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}