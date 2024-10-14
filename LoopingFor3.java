public class LoopingFor3 {
    public static void main(String[] args) {
        int x=1 , a=2;
        while (x<=211){
            System.out.print(x+" ");
            x= x + a;
            a = a+2;
        }  
    }
}
