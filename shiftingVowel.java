public class shiftingVowel {
    public static void main(String[] args) {
        System.out.println(vowelShift("You love Python!"));
    }

    public static String vowelShift(String in) {
        // create arry to store vowels
        // iterate through the string and check if values is available in the initial
        // array
        // if available shift the string
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] value = in.toCharArray();
        for (int i = 0; i < value.length; i++) {
            char c = value[i];
            if (isVowel(c)) {
                for (int j = vowels.length - 1; j >= 0; j--) {
                    if (c == vowels[j]) {
                        value[i] = vowels[(j + 1) % vowels.length];
                    }

                }
            }
        }
        return new String(value);
    }

    // vowel checker method
    public static boolean isVowel(char c) {
        // initializes a boolean with false
        boolean result = false;
        // character of vowels to compare to
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        // using advanced for loop to iterate throu the vowels
        for (int vowel : vowels) {
            // if c is found in the vowel, it returns true
            if (c == vowel) {
                result = true;

            }
        }
        return result;
    }

}
