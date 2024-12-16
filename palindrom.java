public class palindrom {
    public static boolean palindrom(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindrom(str, start+1, end-1);
    }
public static void main(String[] args) {
    String str ="malam";
    palindrom p = new palindrom();
    boolean result = p.palindrom(str, 0, str.length() -1);
    if (result) {
        System.out.println(str+ " :adalah palingdrom ");
    }else{
        System.out.println(str+ " :bukan palingdrom ");
    }
}
}
