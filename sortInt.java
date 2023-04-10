public class sortInt {
    public static void main(String[] args) {
        System.out.println(decendingOrder(4556353));

    }

    public static int decendingOrder(int num) {
        // convert num to string
        String values = Integer.toString(num);
        // convert the string to char for iteration
        char[] digits = values.toCharArray();
        // iteration starts at index 0 to the second to the last one
        // p.s: if it was still the last value there will be an index out of bound error
        // when compering previous value to the next one
        for (int i = 0; i < digits.length - 1; i++) {
            // iteration start from index 1 to the last one
            for (int j = i + 1; j < digits.length; j++) {
                // get numeric value at i
                int x = Character.getNumericValue(digits[i]);
                // get numeric value at index j
                int y = Character.getNumericValue(digits[j]);
                // swap if the next value is larger than the current value to sort it in
                // desending order
                if (y > x) {
                    char temp = digits[j];
                    digits[j] = digits[i];
                    digits[i] = temp;

                }

            }
        }
        // return it as an int
        return Integer.parseInt(new String(digits));
    }
}