public class ElemenArray {
    public static boolean contains(int[] arr,int n,int target) {
        for (int i = 0; i < n; i++){
        if (arr[i] == target) {
            return true;
        }
    }
            return false;
        }
    public static void main(String[] args) {
        int[] arr ={1, 3, 5, 7, 9};
        int target = 5;
        int n = arr.length;

        if (contains(arr, n, target)) {
            System.out.println(" Array Mengadung Elmen " + target);
        }else{
            System.out.println(" Array Tidak Mengadung Elemen " + target);
        }
    }
}
