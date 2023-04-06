public class sortAsending {
    public static void main(String[] args) {
        System.out.println(AsendingOrder(759573123));
    }

    public static int AsendingOrder(int num) {
        String s = Integer.toString(num);
        char[] digits = s.toCharArray();

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                int x = Character.getNumericValue(digits[i]);
                int y = Character.getNumericValue(digits[j]);

                if (y < x) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }

            }
        }

        return Integer.parseInt(new String(digits));
    }

}
