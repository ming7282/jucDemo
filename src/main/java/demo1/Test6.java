package demo1;

/**
 * »ØÎÄ×Ö·û
 */
public class Test6 {
    public static void main(String[] args) {
        String s = "www7www";
        boolean huiwen = huiwen(s);
        System.out.println(huiwen);
    }
    public static boolean huiwen(String s){
        int len = s.length();

        for (int i = 0;i<len/2;i++){
            for (int j=len-1;j>len/2;j--){
                if (s.charAt(i)!=s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
