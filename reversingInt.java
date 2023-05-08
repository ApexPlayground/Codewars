import java.lang.StringBuilder;
public class reversingInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(19879645));
    }

    public static int reverseInt(int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString());
   
    }

}
