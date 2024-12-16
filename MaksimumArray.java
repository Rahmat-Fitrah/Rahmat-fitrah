public class MaksimumArray {
    public static int fintMax(int[] arr,int n) {
            if (n == 1){
            return arr[0];
        }
            int maxOfRest = fintMax(arr, n-1);
            return Math.max(arr[n-1], maxOfRest);
    }
    public static void main(String[] args) {
        int[] arr ={7,4,5,2,5,7,9,5};
        int n = arr.length;

        int Max = fintMax(arr, n);
            System.out.println(" nilai Maksimul Dalm Array " + Max);
        }
    }