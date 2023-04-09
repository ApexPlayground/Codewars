public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("12345678"));
    }

    public static String maskify(String str) {
        int length = str.length();
        // first check if the length is less or equal to 4
        if (length <= 4) {
            return str;
        } else {
            // get the last four degit using substring
            String lastFour = str.substring(length - 4);
            // declaring empty variable to store #
            String mask = "";
            // iterating to replace every value except the last 4 with "#"
            for (int i = 0; i < length - 4; i++) {
                mask += "#";
            }

            return mask + lastFour;
        }
    }
}