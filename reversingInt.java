
public class reversingInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(19879645));
    }

    public static int reverseInt(int num) {
        String value = Integer.toString(num);
        char[] digits = value.toCharArray();

        for (int i = 0; i < digits.length / 2; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - i - 1];
            digits[digits.length - i - 1] = temp;

        }
        return Integer.parseInt(new String(digits));
    }
}
