import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        double reamur,celcius,fahrenheit;
        System.out.println("masukan suhu reamur: ");
        reamur = inputan.nextDouble();
        celcius = 5.0/4.0 * reamur;
        fahrenheit = 9.0/5.0 * celcius + 32.0;
        System.out.println("Suhu Reamur = "+reamur);
        System.out.println("suhu celcius = "+celcius);
        System.out.println("suhu fahrenheit = "+fahrenheit);
        inputan.close();
    }
}
