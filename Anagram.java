public class Anagram {
    public static void main(String[] args) {
        boolean test = validAnagram("car", "rat");
        System.out.println(test);
    }

    public static boolean validAnagram(String s, String t) {
        // boolean result
        boolean result = true;

        if (s.length() != t.length()) {
            result = false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                result = false;
            }
        }
        return result;
    }

}
